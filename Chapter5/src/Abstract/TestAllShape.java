package Abstract;

public class TestAllShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);

        System.out.println(s1);

        System.out.println(s1.getArea());

        System.out.println(s1.getPerimeter());

        System.out.println(s1.getColor());

        System.out.println(s1.isFilled());

//        System.out.println(s1.getRadius());  s1 là đối tượng lớp cha không thể truy cập hàm lớp con

        Circle c1 = (Circle)s1;  // downcast

        System.out.println(c1);

        System.out.println(c1.getArea());

        System.out.println(c1.getPerimeter());

        System.out.println(c1.getColor());

        System.out.println(c1.isFilled());

        System.out.println(c1.getRadius());

//        Shape s2 = new Shape(); class Shape là class abstract nên không thể khởi tạo đối tượng trực tiếp

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast

        System.out.println(s3);

        System.out.println(s3.getArea());

        System.out.println(s3.getPerimeter());

        System.out.println(s3.getColor());

//        System.out.println(s3.getLength());  s3 là đối tượng lớp cha ko thể truy cập hàm lớp con

        Rectangle r1 = (Rectangle)s3; // downcast

        System.out.println(r1);

        System.out.println(r1.getArea());

        System.out.println(r1.getColor());

        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); // Upcast

        System.out.println(s4);

        System.out.println(s4.getArea());

        System.out.println(s4.getColor());

//        System.out.println(s4.getSide()); s4 là đối tượng lớp cha ko thể truy cập hàm lớp con

        Rectangle r2 = (Rectangle)s4; // Downcast

        System.out.println(r2);

        System.out.println(r2.getArea());

        System.out.println(r2.getColor());

//      System.out.println(r2.getSide()); r2 là đối tượng lớp cha ko thể truy cập hàm lớp con

        System.out.println(r2.getLength());

//        Square sq1 = (Square)s1;  Downcast
// 1 ClassCastException
//downcasting gán object của supperclass cho biến tham chiếu subclass.
// dùng toán tử instanceof để kiểm tra s1 có phải là thể hiển của lớp cha
        if (s1 instanceof Square) {
            Square sq1 = (Square)s1;
            System.out.println(sq1);

            System.out.println(sq1.getArea());

            System.out.println(sq1.getColor());

            System.out.println(sq1.getSide());

            System.out.println(sq1.getLength());

        } else {
            System.out.println("Can't cast");
        }

    }
}
