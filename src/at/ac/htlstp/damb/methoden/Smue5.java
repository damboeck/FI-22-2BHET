package at.ac.htlstp.damb.methoden;

public class Smue5 {

    /**
     * Prüft ob eine Zahl positiv ist
     * @param wert Zahl
     * @return     true wenn Zahl größer Null
     */
    public static boolean isPos(double wert) {
        return wert>0;
    }

    /**
     * Prüft ob eine Zahl negativ ist
     * @param wert Zahl
     * @return     true wenn Zahl kleiner Null
     */
    public static boolean isNeg(double wert) {
        return wert<0;
    }

    /**
     * Prüft ob eine Zahl Null ist
     * @param wert Zahl
     * @return     true wenn Zahl Null ist
     */
    public static boolean isNull(double wert) {
        return wert == 0.;
    }

    /**
     * Prüft ob eine Zahl Null ist
     * @param wert Zahl
     * @return     true wenn Zahl Null ist
     */
    public static boolean isNull(int wert) {
        return wert == 0;
    }

    public static boolean isNull(double wert, double toleranz) {
        // TODO
        return false;
    }

}
