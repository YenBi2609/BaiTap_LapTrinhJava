package Abstract;

public abstract class Shape {
    private String color;
    private boolean filled;
    Shape() {
        color = "";
    }
    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    String getColor() {
        return color;
    }
    void setColor(String color) {
        this.color = color;
    }
    boolean isFilled() {
        return true;
    }
    void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract double getArea();
    abstract double getPerimeter();
    public abstract String toString();
}
