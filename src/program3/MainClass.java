package program3;

/*
Design a base class Circle with member variables (radius and color) of type double,
methods (getRadius(), getArea()) and constructors
(Circle(radius), Circle(radius, color)).Derive subclass called
Cylinder from the superclass Circle with member variable (height) of type
double, public methods (getHeight(), getVolume(), getArea()) and its
constructors(Cylinder(height, radius), Cylinder(height, radius,color)). Create the two
instances of cylinder and print similar cylinders if the area, volume and color of cylinders
are same. Demonstrate the code reuse and polymorphism properties of Object oriented
programming by inheriting the constructors and methods of the base class.
 */
import java.util.Scanner;

public class MainClass {


    public  static  Cylinder askInput(int i)
    {
        System.out.println("Enter the properties of cylinder-"+i);
        double height,radius,color;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the height of the cylinder");
        height=scan.nextDouble();
        System.out.println("Enter the radius of the cylinder");
        radius=scan.nextDouble();
        System.out.println("Enter the color of the cylinder");
        color=scan.nextDouble();
        return new Cylinder(height,radius,color);
    }

    public static void checkSame(Cylinder c1, Cylinder c2)
    {
        if(c1.getArea() == c2.getArea() && c1.getVolume()==c2.getVolume() && c1.color==c2.color)
        {
            System.out.println("The two cylinders are same");
        }
        else {
            System.out.println("The two cylinder are different");
        }

    }

    public static void main(String[] args) {

        Cylinder c1,c2;
        c1=askInput(1);
        c2=askInput(2);
        checkSame(c1,c2);

    }
}
