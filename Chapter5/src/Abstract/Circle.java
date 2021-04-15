package Abstract;

public class Circle extends Shape {
    private double radius;

    Circle() {
        super();
    }

    Circle(double radius) {
        super();
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    double getArea(){
        return radius*radius*Math.PI;
    }
    @Override
    double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color=" + getColor() +
                ", filled=" + isFilled() +
                '}';
    }
}
