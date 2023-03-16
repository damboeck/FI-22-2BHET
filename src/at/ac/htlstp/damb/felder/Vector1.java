package at.ac.htlstp.damb.felder;

import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Vector1 {

    public static int zs(int x) {
        int sum = 0;
        while (x>0) {
            sum += x%10;
            x /= 10;
        }
        return sum;
    }

    @Test
    public void testZs() {
        assertEquals(1+4+2+3,zs(1423));
        assertEquals(2+6+0+4,zs(2604));
    }

    public static void main(String[] args) {
        Vector<Integer> zahlen = new Vector<>();
        for (int i=10; i<=1000; i++) {
            if (i%zs(i)==0)
                zahlen.add(i);
        }
        System.out.println(zahlen);
    }

}
