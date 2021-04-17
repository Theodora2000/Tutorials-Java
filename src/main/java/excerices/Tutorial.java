package excerices;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Tutorial extends JPanel implements ActionListener{

    Timer tm = new Timer(5,this);//Gui version of sleep methot, this reference to ActionListener
    int x=0,velX=2;
/*
    public Tutorial(){
        tm.start();
       /* addKeyListener(this);
        setFocusable(true);//enable KeyListener
        setFocusTraversalKeysEnabled(false);//we wontbe using shit or tab key

    }*/
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.red);

        g.fillRect(x,x,50,30);
        tm.start();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(x<0 || x > 350){
            velX = -velX;
        }
        x = x + velX;
        //y=y+velY;
        repaint();//repaint rectangle every 5 seconds
    }



}
