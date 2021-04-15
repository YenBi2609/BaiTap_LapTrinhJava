package Ex2;

public class Box<T extends B> {
    private T t;
    Box() {
        t=null;
    }
    Box(T t) {
        this.t=t;
    }
    public void set(B t) {
        this.t = (T) t;
    }
    public T get() {
        return t;
    }
}
