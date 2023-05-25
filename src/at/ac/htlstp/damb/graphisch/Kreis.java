package at.ac.htlstp.damb.graphisch;

import java.awt.*;

public class Kreis {

    private int r;
    private Point m;
    private Color c;
    private boolean fill;

    public Kreis(int r, Point m, Color c, boolean fill) {
        this.r = r;
        this.m = m;
        this.c = c;
        this.fill = fill;
    }
    public Kreis(int r, int mx, int my, Color c, boolean fill) {
        this(r,new Point(mx,my),c,fill);
    }
    public Kreis(int r, Point m) {
        this(r,m,Color.blue,false);
    }

    public void paint(Graphics g) {
        g.setColor(c);
        if (fill) g.fillOval(m.x-r,m.y-r,2*r,2*r);
        else      g.drawOval(m.x-r,m.y-r,2*r,2*r);
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Point getM() {
        return m;
    }

    public void setM(Point m) {
        this.m = m;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }
}
