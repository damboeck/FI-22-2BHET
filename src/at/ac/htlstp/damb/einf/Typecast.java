package at.ac.htlstp.damb.einf;

public class Typecast {

    public static void main(String[] args) {
        int x=7;
        int y=3;
        int a;
        double b=2.4;
        double z = (double)y/x;
        System.out.printf("z=%f\n",z);
        double zFalsch = y/x;
        System.out.printf("z=%f\n",zFalsch);

        a = (int)b*y;
        System.out.println("a="+a);
        a = (int)(b*y);
        System.out.println("a="+a);
    }
}
