public class TestMainApp {

    public static void main(String[] args){

        Vector3D lightDirection = new Vector3D(1, 1, 1).normalized();

        double x = 0, y = 0, z = 0;

        Vertex v1 = new Vertex(new Vector3D(0,0,0));
        Vertex v2 = new Vertex(new Vector3D(100,0, 0));
        Vertex v3 = new Vertex(new Vector3D(0,100,0));

        TriangleSurface surface = new TriangleSurface(v1, v2, v3);

        GraphicRenderer renderer = new GraphicRenderer();

        for(Edge edge : surface.getEdges()){
            renderer.addLine(edge);
        }

        Matrix A = new Matrix(3, 2);
        A.debug();

        Vector3D gradient = new Vector3D(2*x, 2*y, 2*z);
    }



}
