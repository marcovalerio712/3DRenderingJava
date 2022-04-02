package geometrics;

public class Vertex {

    private Vector3D position;

    public Vertex(Vector3D position){
        this.position = position;
    }

    public void setPosition(Vector3D position){
        this.position = position;
    }

    public Vector3D getPosition(){
        return position;
    }


}
