package at.ac.htlstp.damb.schleifen;

public class Dreieck1 {

    public static void dreieck(int size) {
        System.out.print("+");
        for (int i=0;i<size;i++){
            System.out.print("-");
        }
        System.out.println("/");
        for (int z=size+1;z>0;z--){
            for (int s=0;s<z;s++) {
                if (s==z-1)
                    System.out.print("/");
                else if (s==0)
                    System.out.print("|");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        for (int i=0;i<11;i++)
            dreieck(i);
    }
}
