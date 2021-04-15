package Ex2;

public class test {
    public static void main(String[] args) {
        // class C
        Box<C> myBox = new Box<C>();

        myBox.set(new C());

        B c = myBox.get();

        System.out.println(c);
        // class B
        Box<B> myBox1 = new Box<B>();

        myBox1.set(new B());

        B b = myBox1.get();

        System.out.println(b);
        // class A lỗi do A không extends của B
//        Box<A> myBox2 = new Box<A>();

//        myBox2.set(new A());
//
//        A a = myBox2.get();
//
//        System.out.println(a);
        Box<?> myBox3;

        myBox3 = new Box<B>(new B());
        B b1 = myBox3.get();
        System.out.println(b1);
        //lỗi không set được do đầu vào hàm set là kiểu T( trong TH này là kiểu ? )
        myBox3.set(new C());
        C c1 = (C) myBox3.get();
        System.out.println(c1);

        Box<? extends B> myBox4;
        myBox4 = new Box<B>(new B());
        B b2 = myBox4.get();
        System.out.println(b2);
        myBox4.set(new C());
        C c2 = (C) myBox4.get();
        System.out.println(c2);

        Box<? super B> myBox5;
        myBox5 = new Box<B>(new B());
        B b3 = myBox5.get();
        System.out.println(b3);
        myBox5.set(new C());
        C c3 = (C) myBox5.get();
        System.out.println(c3);
    }
}
