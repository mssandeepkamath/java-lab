package Program1;
/*
 Create a Java class called Complex with the following details as member variables within it.
(i) Real (ii) Imaginary
Develop a Java program to perform addition and subtraction of two complex numbers by
using the method add() and subtract( ) respectively, by passing object as parameter and
display result using method display(). Initialize the real and imaginary values of the complex
number using parameterized constructor. Also demonstrate overloading constructors and
methods.
 */
import java.util.Scanner;

public class MainClass {
    static double real, imaginary;
    static Complex c1, c2, c3;


    static Complex askInput(int i) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the real part of complex number " + i);
        real = in.nextDouble();
        System.out.println("Enter the imaginary part of complex number " + i);
        imaginary = in.nextDouble();
        return new Complex(real, imaginary);
    }

    public static void main(String[] args) {

        c1 = askInput(1);
        c2 = askInput(2);
        System.out.println("Sum of two complex number is ");
        c3 = Complex.addComplex(c1, c2);
        c3.display(c3);
        System.out.println("Difference of two complex number is ");
        c3 = Complex.subtractComplex(c1, c2);
        c3.display(c3);

    }
}
