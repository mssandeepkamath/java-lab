import java.util.Scanner;

public class Complex {

    double real;
    double imaginary;

    Complex() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }
    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex add(Complex number3, Complex number2, Complex number1) {
        number3.real = number1.real + number2.real;
        number3.imaginary = number1.imaginary + number2.imaginary;
        return number3;
    }

    Complex subtract(Complex number3, Complex number2, Complex number1) {
        number3.real = number1.real - number2.real;
        number3.imaginary = number1.imaginary - number2.imaginary;
        return number3;
    }


        Scanner in = new Scanner(System.in);
        System.out.println("Enter the real part of first complex number\n");
        double real1 = in.nextDouble();
        System.out.println("Enter the imaginary part of first complex number\n");
        double imaginary1 = in.nextDouble();
        Complex number1 = new Complex(real1, imaginary1);
        System.out.println("Enter the real part of second complex number\n");
        double real2 = in.nextDouble();
        System.out.println("Enter the imaginary part of second complex number\n");
        double imaginary2 = in.nextDouble();
        Complex number2 = new Complex(real2, imaginary2);
        Complex number3 = new Complex();
        System.out.println("Enter the option\n1.Add()\n2.Subtract()\n");
        int opt = in.nextInt();
        switch (opt) {
            case 1:
                number3.add(number3, number2, number1);
                System.out.println("Complex number-1: " + number1.real + "+" +" i "+ "(" + number1.imaginary + ")");
                System.out.println("Complex number-2: " + number2.real + "+" +" i "+ "(" + number2.imaginary + ")");
                System.out.println("Resultant:" + number3.real + "+" +" i "+ "(" + number3.imaginary + ")");
                break;
            case 2:
                number3.subtract(number3, number2, number1);
                System.out.println("Complex number-1: " + number1.real + "+" +" i "+ "(" + number1.imaginary + ")");
                System.out.println("Complex number-2: " + number2.real + "+"+" i " + "(" + number2.imaginary + ")");
                System.out.println("Resultant:" + number3.real + "+"+" i " + "(" + number3.imaginary + ")");
                break;
            default:
                System.out.println("Invalid input\n");
                break;
        }


    }


}





