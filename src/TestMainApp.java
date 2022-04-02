import geometrics.Edge;
import geometrics.TriangleSurface;
import geometrics.Vector3D;
import geometrics.Vertex;
import math_utilites.Matrix;
import math_utilites.OrthographicProjector;
import math_utilites.Rotator;
import renderers.GraphicRenderer;

import java.util.List;
import java.util.Timer;

public class TestMainApp {



    public static void main(String[] args) throws InterruptedException {

        Vertex v1 = new Vertex(new Vector3D(100,0,100));
        Vertex v2 = new Vertex(new Vector3D(200,0,100));
        Vertex v3 = new Vertex(new Vector3D(150,0,200));

        Timer timer = new Timer();

        OrthographicProjector projector = new OrthographicProjector(1);
        Rotator rotator = new Rotator();

        TriangleSurface surface = new TriangleSurface(v1, v2, v3);
        GraphicRenderer renderer = new GraphicRenderer();

        for(double angle = 0; angle < Math.PI/2; angle+=0.01){

            surface = rotator.rotateZ(surface, angle);
            TriangleSurface surface2D = projector.project(surface);

            for(Vertex vertex : surface2D.getVertexes()){
                System.out.println(vertex.getPosition());
            }

            System.out.println("---------------------------------");



            for(Edge edge : surface2D.getEdges()){
                renderer.addLine(edge);
            }
            renderer.refresh();


        }

    }




}
