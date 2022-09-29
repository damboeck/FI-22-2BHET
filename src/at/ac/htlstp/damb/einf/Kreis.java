package at.ac.htlstp.damb.einf;

import java.util.Scanner;

/**
 * Ein kleines Programm zum Berechnen der Fläche eines Kreises
 */
public class Kreis {

    public static void main(String[] args) {
        // Dies ist ein Kommentar
        /* Dies ist ein mehrzeiliger
           Kommentar !
         */
        //TODO Das ist noch zu machen
        //FIXME Bitte Fehler beheben

        // jetzt gehts los
        // Deklaration
        double r;
        double flaecheA;
        Scanner sc=new Scanner(System.in);
        // Initialisierung
        System.out.print("Bitte gib den Radius ein:");
        r=sc.nextDouble();
        // Berechnung
        flaecheA = Math.pow(r,2)*Math.PI;

        System.out.printf("Fläche = %7.2f cm^2\n",flaecheA);
        System.out.println("Fläche ="+flaecheA+" cm^2");
        sc.close();

    }
}
