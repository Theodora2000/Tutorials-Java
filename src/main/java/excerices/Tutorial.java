package excerices;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Tutorial extends JPanel implements ActionListener, KeyListener{

    Timer tm = new Timer(5,this);//Gui version of sleep methot, this reference to ActionListener
    int x=0,velX=0, y=0,velY=0;

    public Tutorial(){
        tm.start();
        addKeyListener(this);
        setFocusable(true);//enable KeyListener
        setFocusTraversalKeysEnabled(false);//we wontbe using shit or tab key

    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.red);

        g.fillRect(x,y,50,30);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(x<0){
            velX=0;
            x=0;
        }
        if(x>530){
            velX=0;
            x=530;
        }
        if(y<0){
            velY=0;
            y=0;
        }
        if(y>330){
            velY=0;
            y=330;
        }
        x = x + velX;
        y = y + velY;
        repaint();//repaint rectangle every 5 seconds
    }




    @Override
    public void keyPressed(KeyEvent e) {

        int c = e.getKeyCode();

        if(c == KeyEvent.VK_LEFT){
            velX=-1;
            velY=0;
        }
        if(c == KeyEvent.VK_UP){
            velX=0;
            velY=-1;
        }
        if(c == KeyEvent.VK_RIGHT){
            velX=1;
            velY=0;
        }
        if(c == KeyEvent.VK_DOWN){
            velX=0;
            velY=1;
        }
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
