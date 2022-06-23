import java.util.Scanner;

public class MainClass {

     static void displayIfSame(Cylinder cylinder1, Cylinder cylinder2)
    {
        if(cylinder1.color==cylinder2.color && cylinder1.getArea()==cylinder2.getArea() && cylinder1.getVolume()==cylinder2.getVolume())
        {
            System.out.println("The cylinders are similar");
        }
        else
        {
            System.out.println("The cylinders are not similar");
        }
    }

    public static void main(String[] args) {
         double height,radius,color;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Height, radius and Color of Cylinder-1");
        height=in.nextDouble();
        radius=in.nextDouble();
        color=in.nextDouble();
        Cylinder cylinder1=new Cylinder(height,radius,color);
        System.out.println("Enter Height, radius and Color of Cylinder-2");
        height=in.nextDouble();
        radius=in.nextDouble();
        color=in.nextDouble();
        Cylinder cylinder2=new Cylinder(height,radius,color);
        displayIfSame(cylinder1,cylinder2);

    }
}
