package program3;



public class Circle {

    double radius, color;


    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, double color) {

        this.radius = radius;
        this.color = color;
    }


    double getRadius() {
        return this.radius;
    }

    double getArea() {
        return Math.PI * this.radius * this.radius;
    }




}
