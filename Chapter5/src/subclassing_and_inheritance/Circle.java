package subclassing_and_inheritance;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
