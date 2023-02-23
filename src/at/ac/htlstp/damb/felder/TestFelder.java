package at.ac.htlstp.damb.felder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFelder {

    double[] f1 = {20,350,30,-33,0,14,23};
    double[] f2 = {22,33,55,33,11,14};

    @Test
    public void testMinArray() {
        assertEquals(-33,Feld2.minArray(f1));
        assertEquals(11,Feld2.minArray(f2));
        assertEquals(7,f1.length);
        assertEquals(20,f1[0]);
    }

    @Test
    public void testCopyArray() {
        double[] c=Feld2.copyArray(f1);
        assertEquals(f1.length,c.length);
        for (int i=0;i<c.length;i++)
            assertEquals(f1[i],c[i]);
        c[0]=33;
        assertEquals(20,f1[0]);
    }
}
