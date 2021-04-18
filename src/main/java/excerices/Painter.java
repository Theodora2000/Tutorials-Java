package excerices;

import javax.swing.*;
import java.awt.*;
import java.nio.channels.Pipe;

public class Painter extends JFrame  {
public Painter(){
    setSize(600,400);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setContentPane(new DrawArea());
    setVisible(true);
}

class DrawArea extends JPanel{
    Point A = null;
    Point B = null;
    public DrawArea(){
        A = new Point(100,100);
        B = new Point(200,200);
    }

    public void paintComponent(Graphics g){
        g.drawLine(A.x, A.y, B.x, B.y);
        g.drawString("a", A.x, A.y);
        g.drawString("b", B.x, B.y);

    }
}
}
