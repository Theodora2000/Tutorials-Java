package excerices;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tutorial extends JFrame {

    JPanel jp = new JPanel();
    JPanel jp2 = new JPanel();
    JButton jb = new JButton("Change  color - cyan");
    JButton jb2 = new JButton("Change  color - black");

    public Tutorial(){
        setTitle("Tutorial");
        setSize(600,600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jp.add(jb);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 jp2.setBackground(Color.CYAN);
            }
        });

        jp.add(jb2);
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jp2.setBackground(Color.black);
            }
        });

        add(jp, BorderLayout.SOUTH);
        add(jp2);
    }


}
