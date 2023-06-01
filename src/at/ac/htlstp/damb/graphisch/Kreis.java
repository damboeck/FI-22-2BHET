package at.ac.htlstp.damb.graphisch;

import java.awt.*;

public class Kreis extends FlaecheZweipunkt {

    public Kreis(Point p1, Point p2, Color c, boolean fill) {
        super(p1, p2, c, fill);
    }

    public Kreis(int r, Point m, Color c, boolean fill) {
        this(new Point(m.x-r,m.y-r),new Point(m.x+r,m.y+r),c,fill);
    }
    public Kreis(int r, int mx, int my, Color c, boolean fill) {
        this(r,new Point(mx,my),c,fill);
    }
    public Kreis(int r, Point m) {
        this(r,m,Color.blue,false);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(getC());
        if (isFill()) g.fillOval(getM().x-getR().x,getM().y-getR().y,2*getR().x,2*getR().y);
        else      g.drawOval(getM().x-getR().x,getM().y-getR().y,2*getR().x,2*getR().y);
    }

    public Point getR() {
        int rx = (getP2().x-getP1().x)/2;
        int ry = (getP2().y-getP1().y)/2;
        return new Point(rx<0?-rx:rx,ry<0?-ry:ry);
    }

    public void setR(int r) {
        Point m=getM();
        setP1(new Point(m.x-r,m.y-r));
        setP2(new Point(m.x+r,m.y+r));
    }
    public void setR(Point r) {
        Point m=getM();
        setP1(new Point(m.x-r.x,m.y-r.y));
        setP2(new Point(m.x+r.y,m.y+r.y));
    }

    public Point getM() {
        return new Point((getP1().x+getP2().x)/2,(getP1().y+getP2().y)/2);
    }

    public void setM(Point m) {
        Point r=getR();
        setP1(new Point(m.x-r.x,m.y-r.y));
        setP2(new Point(m.x+r.y,m.y+r.y));
    }

    public void scaleRadius(int f) {
        Point r =getR();
        Point m =getM();
        r = new Point(r.x+f,r.y+f);
        setP1(new Point(m.x-r.x,m.y-r.y));
        setP2(new Point(m.x+r.y,m.y+r.y));
    }

}
