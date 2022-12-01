package at.ac.htlstp.damb.methoden;

public class TestMatheTools {

    public static void TestEquals(double x, double y, double tol,boolean erg) {
        boolean ber = MatheTools.equals(x,y,tol);
        if (ber!=erg) {
            System.out.printf("Fehler! %f=%f mit tol=%f liefert %b statt %b\n",x,y,tol,ber,erg);
        }
    }

    public static void main(String[] args) {
        TestEquals(5,6,1,false);
        TestEquals(5,5.001,1,true);
        TestEquals(0.00001,0.00001*1.011,1,false);
        TestEquals(0.00001,0.00001*1.009,1,true);
        TestEquals(-5,-6,1,false);
        TestEquals(5,-5,1,false);
        TestEquals(0.01,0,1,false);

        //System.out.printf("%f=%f mit %f tol liefert %b\n",5.,6.,1.,MatheTools.equals(5,6,1));
        //System.out.printf("%f=%f mit %f tol liefert %b\n",5.,5.001,1.,MatheTools.equals(5,5.001,1));
        System.out.println("Fertig!");
    }
}
