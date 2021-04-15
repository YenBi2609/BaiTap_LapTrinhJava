package Ex2;

public class RunThread1 implements Runnable{
    private String toSay;
    int sleep;
    public RunThread1(String st,int sl){
        toSay = st;
        sleep=sl;
    }
    public void run() {
        try {
            for(;;) {
                System.out.println(toSay);
                Thread.sleep(sleep);
            }
        }catch(InterruptedException e){
        }
    }
    public static void main(String [] args) {

        RunThread1 out1 = new RunThread1("Thread A",2000);

        RunThread1 out2 = new RunThread1("Thread B",1200);

        Thread thr1 = new Thread(out1);

        Thread thr2 = new Thread(out2);

        thr1.start();

        thr2.start();

    }
}
