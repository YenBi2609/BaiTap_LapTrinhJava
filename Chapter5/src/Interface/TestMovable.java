package Interface;

public class TestMovable {
    public static void main(String[] args) {
        Movable x1 = new MovablePoint(2, 3);
        System.out.println(x1);
        x1.moveDown();
        System.out.println(x1);
        x1.moveLeft();
        System.out.println(x1);
    }
}
