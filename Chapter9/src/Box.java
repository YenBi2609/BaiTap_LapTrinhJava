public class Box<T> {
    private T t; // T stands for "Type"
    Box() {
        t=null;
    }
    Box(T t) {
        this.t=t;
    }
    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();

        integerBox.set(new Integer(10));

        Integer someInteger = integerBox.get();

        System.out.println(someInteger);

    }
}
