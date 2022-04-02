public class Edge {

    private final Vertex vertex_1;
    private final Vertex vertex_2;

    public Edge(Vertex vertex_1, Vertex vertex_2){
        this.vertex_1 = vertex_1;
        this.vertex_2 = vertex_2;
    }

    public Vertex getFirstVertex(){
        return vertex_1;
    }

    public Vertex getSecondVertex() {
        return vertex_2;
    }
}
