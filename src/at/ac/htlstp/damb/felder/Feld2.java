package at.ac.htlstp.damb.felder;

import java.util.Arrays;

public class Feld2 {

    public static double minArray(double[] x) {
        double min = x[0];
        for (int i=0;i<x.length;i++) {
            double aktual = x[i];
            if (aktual < min) min = aktual;
        }
        return min;
    }

    public static double maxArray(double[] x) {
        double max = x[0];
        for (double aktual : x)
            if (aktual > max) max = aktual;
        return max;
    }

    public static void main(String[] args) {
        double[] R = {110,200,220,470,560,100};
        System.out.println(Arrays.toString(R));
        double[] A;
        A=R;
        System.out.println("A="+Arrays.toString(A)+" R="+Arrays.toString(R));
        A[0] = 14;
        System.out.println("A="+Arrays.toString(A)+" R="+Arrays.toString(R));
        A=Arrays.copyOf(R,R.length);
        A[1] = 88;
        System.out.println("A="+Arrays.toString(A)+" R="+Arrays.toString(R));
        System.out.println("kleinster Wert von A ="+minArray(A));
        System.out.println("größter Wert von A ="+maxArray(A));
    }
}
