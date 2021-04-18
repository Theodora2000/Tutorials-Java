import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Tutorial {
    static int n;
    static int[] xs=new int[20];
    static int[] ys=new int[20];
    static int i,xp,yp,degree;
    static float radian;

    static void rotate()
    {
        int i;
        float t,v;
        for(i=0;i<n;i++)
        {
            t=xs[i]-xp;
            v=ys[i]-yp;
            xs[i]=(int)(xp+t*Math.cos(radian)-v*Math.sin(radian));
            ys[i]=(int)(yp+v*Math.cos(radian)+t*Math.sin(radian));
        }
    }


    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of sides: ");
        n=sc.nextInt();
        System.out.println("Enter co-rdinates: x,y for each point:");
        System.out.println("(x between 0 and 640, y between 0 and 360)");
        for(i=0;i<n;i++)
        {
            xs[i]=sc.nextInt();
            ys[i]=sc.nextInt();
        }
        System.out.println("\nenter pivot point co-ordinate");
        xp=sc.nextInt();
        yp=sc.nextInt();
        System.out.println("\nenter rotation angle");
        degree=sc.nextInt();
        radian=(float)degree*3.14f/180;
        JFrame jf=new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600,400);
        MyPanel panel=new MyPanel();
        jf.add(panel);
        jf.setVisible(true);
        jf.revalidate();
        jf.repaint();
    }
}


class MyPanel extends JPanel
{
    @Override
    public void paintComponent(Graphics g)
    {
        g.setColor(Color.RED);
        g.drawPolygon(Tutorial.xs, Tutorial.ys, Tutorial.n);
        Tutorial.rotate();
        g.setColor(Color.BLUE);
        g.drawPolygon(Tutorial.xs, Tutorial.ys, Tutorial.n);
    }
}