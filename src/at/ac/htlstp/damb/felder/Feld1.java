package at.ac.htlstp.damb.felder;

public class Feld1 {

    public static void main(String[] args) {
        double[] R;
        R = new double[6];
        for (int i=0;i<R.length;i++) {
            System.out.printf("R[%d]=%5.2f\n",i,R[i]);
        }
        R[0] = 110;
        R[1] = 200;
        R[2] = 220;
        for (int i=0;i<R.length;i++) {
            System.out.printf("R[%d]=%5.2f\n",i,R[i]);
        }
    }
}
