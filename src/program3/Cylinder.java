package program3;


public class Cylinder extends Circle {

    double height;

    Cylinder(double height,double radius)
    {
        super(radius);
        this.height=height;
    }

    Cylinder(double height,double radius, double color)
    {
        super(radius,color);
        this.height=height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume()
    {
        return Math.PI* radius * radius * height;
    }

    public double getArea()
    {
        return Math.PI*radius*(radius+height);
    }

}
