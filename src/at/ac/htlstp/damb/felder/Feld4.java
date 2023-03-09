package at.ac.htlstp.damb.felder;

import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Feld4 {

    public static int ziffernsumme(int x) {
        int result=0;
        while (x>0) {
            result += x%10;
            x/=10;
        }
        return result;
    }

    public static void main(String[] args) {
        Vector<Integer> result = new Vector<>();
        for (int i=10;i<=1000;i++) {
            int  zs = ziffernsumme(i);
            if (i%zs==0) result.add(i);
        }
        System.out.println(result);
        System.out.println(result.size()+" Elemente wurden gefunden!");
    }

    @Test
    public void testZiffernsumme() {
        assertEquals(3,ziffernsumme(12));
        assertEquals(17,ziffernsumme(32453));
    }
}
