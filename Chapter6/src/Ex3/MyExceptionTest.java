package Ex3;

public class MyExceptionTest {
    public static void test(int number) throws MyException {
        if (number == 8) {
            throw (new MyException("you hit the magic number"));
        }
        System.out.println("hello"); // skip if exception triggered
    }
    public static void main(String[] args) {
        try {
            test(9); // does not trigger exception

            test(8); // trigger exception

        } catch (MyException ex) { // exception handler

            ex.printStackTrace();
        }

    }
}
