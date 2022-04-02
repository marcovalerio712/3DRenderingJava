import java.awt.*;
import java.util.ArrayList;

public class Canvas3DRenderer extends Canvas {

    private ArrayList<Edge> segments = new ArrayList<>();

    public void addSegment(Edge edge){
        segments.add(edge);
    }


    @Override
    public void paint(Graphics g){
        for(Edge edge : segments){
            int x1 = (int) Math.round(edge.getFirstVertex().getPosition().getX());
            int y1 = (int) Math.round(edge.getFirstVertex().getPosition().getY());
            int x2 = (int) Math.round(edge.getSecondVertex().getPosition().getX());
            int y2 = (int) Math.round(edge.getSecondVertex().getPosition().getY());
            g.drawLine(x1, y1, x2, y2);
        }
    }

}
