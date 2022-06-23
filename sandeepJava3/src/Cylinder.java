public class Cylinder extends Circle{

    double height;

    Cylinder(double height,double radius)
    {
        super(height,radius);
        this.height=height;
    }
    Cylinder(double height,double radius, double color)
    {
        super(radius,color);
        this.height=height;
    }

    double getHeight()
    {
        return this.height;
    }

    double getVolume()
    {
        return 3.124*radius*radius*height;
    }

    double getArea()
    {
        return 2*3.142*radius*height+2*3.142*radius*radius;
    }

}
