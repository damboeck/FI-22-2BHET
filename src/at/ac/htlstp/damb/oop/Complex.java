package at.ac.htlstp.damb.oop;

/**
 * Klasse für eine komplexe Zahl. Wird immutable realisiert.
 */
public class Complex {

    /** Realteil der Zahl */
    private double re;

    /** Imaginärteil der Zahl */
    private double im;

    /**
     * Erzeugt eine komplexe Zahl aus Real und Imaginärteil
     * @param re Realteil
     * @param im Imaginärteil
     */
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex(double re) {
        this.re = re;
        this.im = 0;
    }

    public Complex(double abs, double arg,boolean degree) {
        double rad = degree ? arg*Math.PI/180d : arg;
        re = abs*Math.cos(rad);
        im = abs*Math.sin(rad);
    }

    @Override
    public String toString() {
        String ret = re+"+"+im+"j";
        if (isReal()) ret=""+re;
        if (isImag()) ret=im+"j";
        if (isNull()) ret="0";
        return ret;
    }

    public boolean isReal() {
        //TODO realisiere relativ zum Realteil!!
        return im==0;
    }

    public boolean isImag() {
        return re==0;
    }

    public boolean isNull() {
        return re==0 && im==0;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public double getAbs() {
        return Math.sqrt(re*re+im*im);
    }

    public double getArg() {
        return Math.atan2(im,re);
    }

    public double getArgDegree() {
        return getArg()*180d/Math.PI;
    }

    //----------------------------------------------------------------------------------------

    public static Complex add(Complex c1, Complex c2) {
        return new Complex(c1.re+c2.re, c1.im+c2.im);
    }

    public Complex add(Complex c) {
        return new Complex(this.re+c.re, this.im+c.im);
    }

    public Complex neg() {
        return new Complex(-re, -im);
    }

    public Complex sub(Complex c) {
        return this.add(c.neg());
    }

}
