package at.ac.htlstp.damb.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexTest {

    @Test
    public void test1() {
        /*Complex c = new Complex(1,1);
        double f  = c.getArgDegree();*/
        assertEquals(45.,(new Complex(1,1)).getArgDegree());
    }
}
