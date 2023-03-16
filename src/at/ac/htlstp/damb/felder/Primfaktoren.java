package at.ac.htlstp.damb.felder;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Primfaktoren {

    public static Vector<Integer> primfakt(int x) {
        int d=2;
        Vector<Integer> prims = new Vector<>();
        if (x<0) x=-x;
        if (x==0) return prims;
        if (x==1) {
            prims.add(1);
            return prims;
        }
        // jetzt gehts los
        while (x>1) {
            if (x%d==0) {
                prims.add(d);
                x/=d;
            } else d++;
        }
        return prims;
    }

    public static void assertEqualsArrayVectorNoOrder(int[] f, Vector<Integer> g) {
        assertEquals(f.length, g.size());
        int[] fc = Arrays.copyOf(f,f.length);
        Arrays.sort(fc);
        Vector<Integer> gc = new Vector<>();
        gc.addAll(g);
        Collections.sort(gc);
        for (int i=0;i<fc.length;i++)
            assertEquals(fc[i],gc.get(i));
    }

    public static int produkt(int[] f) {
        int p = 1;
        for (int x:f) p*=x;
        return p;
    }

    @Test
    public void testProdukt() {
        int[] f = {2,5,3,3};
        assertEquals(2*5*3*3,produkt(f));
    }

    @Test
    public void testPrimfakt() {
        int[] f1 = {2,5,3,7,3,2};
        int[] f2 = {2,2,5,7,3,3};
        Vector<Integer> g1 = new Vector<>();
        for (int x:f1) g1.add(x);
        assertEqualsArrayVectorNoOrder(f1,g1);
        assertEqualsArrayVectorNoOrder(f2,g1);

        assertEqualsArrayVectorNoOrder(f1,primfakt(produkt(f1)));
    }
}
