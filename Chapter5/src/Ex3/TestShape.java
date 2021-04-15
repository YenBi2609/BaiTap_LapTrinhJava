package Ex3;

public class TestShape {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("red", 5,3);
        System.out.println(rectangle);
        System.out.println("Area is " + rectangle.getArea());


        Shape triangle = new Triangle("blue", 6,9);
        System.out.println(triangle);
        System.out.println("Area is " + triangle.getArea());

        Shape s1 = new Shape("green");
        System.out.println(s1);
        System.out.println("Area is " + s1.getArea());
    }
}
