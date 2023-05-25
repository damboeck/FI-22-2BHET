package at.ac.htlstp.damb.graphisch;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class FKreis extends FrameMT{

    private Kreis k;

    public static void main(String[] args) {
        new FKreis();
    }

    public FKreis() {
        super("Kreis");
        k=null;
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        if (k!=null) k.paint(g);
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton()==MouseEvent.BUTTON1){
            if (k==null) k = new Kreis(20,e.getPoint());
            else k.setM(e.getPoint());
            this.repaint();
        }
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        k.setR(k.getR()-e.getWheelRotation()*2);
        repaint();
    }
}
