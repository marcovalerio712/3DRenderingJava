import java.util.ArrayList;

public class Solid {

    private ArrayList<TriangleSurface> surfaces = new ArrayList<>();

    public Solid(){

    }

    public void addSurface(TriangleSurface surface){
        surfaces.add(surface);
    }

}
