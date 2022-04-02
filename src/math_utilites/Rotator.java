package math_utilites;

import geometrics.TriangleSurface;
import geometrics.Vector3D;
import geometrics.Vertex;

import java.util.List;

public class Rotator {



    public static Matrix getRotationalMatrixZ(double angle){
        Matrix rotationalMatrixZ = new Matrix(3, 3);
        rotationalMatrixZ.setRow(0, List.of(Math.cos(angle), -Math.sin(angle), 0d));
        rotationalMatrixZ.setRow(1, List.of(Math.sin(angle), Math.cos(angle), 0d));
        rotationalMatrixZ.setRow(2, List.of(0d, 0d, 1d));
        return rotationalMatrixZ;
    }

    public TriangleSurface rotateZ(TriangleSurface source, double angle){
        Matrix rotationalMatrix = getRotationalMatrixZ(angle);
        Vertex[] vertexes = source.getVertexes();

        return new TriangleSurface(
                rotateVertex(vertexes[0], rotationalMatrix),
                rotateVertex(vertexes[1], rotationalMatrix),
                rotateVertex(vertexes[2], rotationalMatrix)
        );
    }

    private Vertex rotateVertex(Vertex vertex, Matrix rotationalMatrix){

        Matrix vertexMatrix = new Matrix(3, 1);
        Vector3D position = vertex.getPosition();
        vertexMatrix.setColumn(0, List.of(position.getX(), position.getY(), position.getZ()));
        Matrix projectedVertexMatrix = Matrix.multiply(rotationalMatrix, vertexMatrix);
        List<Double> newPosition = projectedVertexMatrix.getColumn(0);
        return new Vertex(new Vector3D(newPosition.get(0), newPosition.get(1), newPosition.get(2)));

    }

}
