package excerices;

import javax.swing.*;

public class Main extends  Tutorial{

    public  static void main(String[] args){
        Tutorial t = new Tutorial();
        JFrame jf = new JFrame();
        jf.setTitle("Tutorial");
        jf.setSize(600,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(t);
    }
}
