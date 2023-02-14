package at.ac.htlstp.damb.methoden;

public class MatheTools {

    /**
     * Prüft ob zwei Zahlen bis auf einen relative Genauigkeit gleich
     * sind.
     * @param x         erste Zahl
     * @param y         zweite Zahl
     * @param tolerance Genauigkeit in Prozent
     * @return          true wenn die zwei Zahlen ungefähr gleich sind
     */
    public static boolean equals(double x, double y, double tolerance){
        double e = Math.abs(x-y)/Math.max(Math.abs(x),Math.abs(y));
        return e<tolerance*0.01;
    }
}
