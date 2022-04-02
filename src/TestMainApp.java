import geometrics.Edge;
import geometrics.TriangleSurface;
import geometrics.Vector3D;
import geometrics.Vertex;
import math_utilites.Matrix;
import renderers.GraphicRenderer;

import java.util.List;

public class TestMainApp {

    public static void main(String[] args){

        Vertex v1 = new Vertex(new Vector3D(0,0,0));
        Vertex v2 = new Vertex(new Vector3D(0,0,100));
        Vertex v3 = new Vertex(new Vector3D(0,100,0));

        TriangleSurface surface = new TriangleSurface(v1, v2, v3);

        GraphicRenderer renderer = new GraphicRenderer();

        for(Edge edge : surface.getEdges()){
            renderer.addLine(edge);
        }


    }




}
