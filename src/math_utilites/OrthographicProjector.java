package math_utilites;

import geometrics.Edge;
import geometrics.TriangleSurface;
import geometrics.Vector3D;
import geometrics.Vertex;

import java.util.List;

public class OrthographicProjector {

    private final Matrix projectionMatrix = new Matrix(2, 3);

    public OrthographicProjector(double scaleFactor){
        projectionMatrix.setRow(0, List.of(scaleFactor, 0d, 0d));
        projectionMatrix.setRow(1, List.of(0d, 0d, scaleFactor));
    }

    public TriangleSurface project(TriangleSurface source){

        Vertex[] vertexes = source.getVertexes();

        return new TriangleSurface(
                projectVertex(vertexes[0]),
                projectVertex(vertexes[1]),
                projectVertex(vertexes[2])
        );
    }

    private Vertex projectVertex(Vertex vertex){

        Matrix vertexMatrix = new Matrix(3, 1);
        Vector3D position = vertex.getPosition();
        vertexMatrix.setColumn(0, List.of(position.getX(), position.getY(), position.getZ()));

        Matrix projectedVertexMatrix = Matrix.multiply(projectionMatrix, vertexMatrix);

        List<Double> newPosition = projectedVertexMatrix.getColumn(0);
        return new Vertex(new Vector3D(newPosition.get(0), newPosition.get(1), 0));

    }

}
