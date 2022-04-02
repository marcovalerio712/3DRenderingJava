package math_utilites;

import java.util.List;

public class OrthographicProjector {

    private Matrix projectionMatrix = new Matrix(2, 3);

    public OrthographicProjector(double scaleFactor){
        projectionMatrix.setRow(0, List.of(scaleFactor, 0d, 0d));
        projectionMatrix.setRow(1, List.of(0d, 0d, scaleFactor));
    }

    public Matrix project(Matrix source){

        Matrix result = Matrix.multiply(projectionMatrix, source);
        return result;

    }

}
