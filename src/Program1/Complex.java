package Program1;

public class Complex {

    private double real;
    private double imaginary;

    Complex() {

    }

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    static Complex addComplex(Complex c1, Complex c2) {
        Complex c3 = new Complex();
        c3.real = c1.real + c2.real;
        c3.imaginary = c1.imaginary + c2.imaginary;
        return c3;
    }

    static Complex subtractComplex(Complex c1, Complex c2) {
        Complex c3 = new Complex();
        c3.real = c1.real - c2.real;
        c3.imaginary = c1.imaginary - c2.imaginary;
        return c3;
    }

    void display(Complex c) {
        System.out.println("Complex number = " + c.real + " + " + c.imaginary + " i ");
    }
}
