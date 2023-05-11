package at.ac.htlstp.damb.graphisch;

import java.awt.*;

public class Schraffur1 extends Linie1{
    public Schraffur1(String name, int breite, int hoehe) {
        super(name, breite, hoehe);
    }

    public static void main(String[] args) {
        new Schraffur1("Schraffur",800,600);
    }

    @Override
    public void paint(Graphics g) {
        int d = this.getHeight();
        int a = (this.getWidth()+this.getHeight())/11;
        //g.drawLine(0,0,d,d);
        /*int x=a;
        while(x<this.getWidth()) {
            g.drawLine(x,0,x+d,d);
            x+=a;
        }*/
        /*for (int x=a; x<this.getWidth(); x+=a) g.drawLine(x,0,x+d,d);
        for (int y=a; y<this.getHeight();y+=a) g.drawLine(0,y,d,y+d);*/
        for (int x=a-d;x<this.getWidth(); x+=a)  g.drawLine(x,0,x+d,d);

    }
}
