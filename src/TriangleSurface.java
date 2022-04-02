import java.util.ArrayList;

public class TriangleSurface {

    private Vertex[] vertexes = new Vertex[3];

    public TriangleSurface(Vertex pointA, Vertex pointB, Vertex pointC){

        vertexes[0] = pointA;
        vertexes[1] = pointB;
        vertexes[2] = pointC;

    }

    public Edge[] getEdges(){

        Edge[] edges = new Edge[3];
        edges[0] = new Edge(vertexes[0], vertexes[1]);
        edges[1] = new Edge(vertexes[1], vertexes[2]);
        edges[2] = new Edge(vertexes[2], vertexes[0]);

        return edges;
    }

}
