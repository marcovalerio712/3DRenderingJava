package renderers;

import geometrics.Edge;

import javax.swing.*;
import java.awt.*;

public class GraphicRenderer extends JFrame{

    private Canvas3DRenderer canvas;

    public GraphicRenderer(){
        super("Graphic 3D Renderer");

        this.setSize(800, 600);
        this.setVisible(true);
        this.setLocation(200, 200);
        this.setLayout(new BorderLayout());

        canvas = new Canvas3DRenderer();

        this.add(canvas, BorderLayout.CENTER);



    }

    public void addLine(Edge edge){
        canvas.addSegment(edge);
    }

    public void refresh(){
        canvas.repaint();
    }

}
