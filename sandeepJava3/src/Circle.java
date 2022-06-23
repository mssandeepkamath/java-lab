public class Circle {
    double radius;
    double color;


    Circle(double radius) {
        this.radius=radius;

    }
    Circle(double radius, double color)
    {
        this.radius=radius;
        this.color=color;

    }

    double getRadius() {
        return this.radius;
    }


    double getArea() {
        return 3.142*radius*radius;
    }

}
