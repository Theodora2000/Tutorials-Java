package excerices;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Scanner;
import javax.swing.*;


public class Tutorial  extends JFrame implements MouseListener, MouseMotionListener {
    JLabel label;
    public Tutorial(){
        setSize(400,400);
        setTitle("Mousey");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        label = new JLabel(" ", JLabel.CENTER);
        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout());
        pane.add(label);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        setVisible(true);


    }
    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        int b = e.getButton();//which button is clicked
        label.setText("Mouse clicked at"+ x + " " +y+", Button ="+b);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        label.setText("Mouse pressed at"+ x + "" +y);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        label.setText("Mouse released at"+ x + "" +y);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("mouse entered form.");
    }

    @Override
    public void mouseExited(MouseEvent e) {

        label.setText("mouse exited form.");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        label.setText("mouse dragged to.("+ x +", "+y+")");

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        label.setText("mouse moved to.("+ x +", "+y+")");
    }
}