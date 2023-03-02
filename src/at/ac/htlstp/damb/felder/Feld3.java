package at.ac.htlstp.damb.felder;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Feld3 {



    /**
     * Berechnet den arithmetischen Mittelwert aller Feldelemente
     * @param f  Feld
     * @return   Mittelwert
     */
    public static double mwArray(double[] f) {
        double summe = 0;
        for (double x:f) summe += x;
        return summe/f.length;
    }

    public static void main(String[] args) {
        double[] f1 = {4,2.5,3.5,8};
        double[] f2 = {3,-4,5,-7,3.6};
        System.out.println("MW von "+ Arrays.toString(f1)+" = "+mwArray(f1));
        System.out.println("MW von "+ Arrays.toString(f2)+" = "+mwArray(f2));
    }

    @Test
    public void testMwArray(){
        double[] f1 = {4,2.5,3.5,8};
        double[] f2 = {3,-4,5,-7,3.6};
        assertEqualsDouble((4+2.5+3.5+8)/4.0, mwArray(f1));
        assertEqualsDouble(0.12,mwArray(f2));
    }

    public static void assertEqualsDouble(double x, double y) {
        boolean erg;
        erg = Math.abs(x-y)/Math.max(Math.abs(x),Math.abs(y))<1e-6;
        assertTrue(erg);
    }

    /**
     * Löscht aus einem Feld ein Element an einer bestimmten Position und gibt das neue
     * Feld als Ergebnis zurück
     * @param feld Originalfeld
     * @param pos  Position welche gelöscht werden soll
     * @return     neues Feld ohne dem gelöschten Element
     */
    public static int[] removeArray(int[] feld, int pos) {
        int[] ergebnis = new int[feld.length-1];
        for (int i=0;i<ergebnis.length;i++)
            if (i<pos) ergebnis[i] = feld[i];
            else       ergebnis[i] = feld[i+1];
            //ergebnis[i] = feld[ i<pos ? i : i+1 ];
        return ergebnis;
    }

    @Test
    public void testRemoveArray() {
        int[] f = {3,5,7,-2,3,9};
        int[] g = {3,5,-2,3,9};
        int[] f1= removeArray(f,2);
        assertEquals(Arrays.toString(g),Arrays.toString(f1));
    }


}
