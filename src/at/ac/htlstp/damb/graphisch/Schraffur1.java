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

    }
}
