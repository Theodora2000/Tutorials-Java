package excerices;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Painter extends JFrame implements MouseMotionListener {
    private int x=-10,y=-10;
    public Painter(){
        setTitle("Painter");
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel instructions = new JLabel("Drag the mouse to draw", JLabel.RIGHT);
        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());
        c.add(instructions, BorderLayout.SOUTH);
        c.addMouseMotionListener(this);


        setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    public void paint(Graphics  g){
        g.fillOval(x,y,4,4);
    }
}
