package Ex1;

public class RunThread extends Thread{
    private String toSay;
    private int Sleep;
    public RunThread(String st,int sl){
        toSay = st;
        Sleep=sl;
    }
    public void run(){
        try{
            for(;;){
                System.out.println(toSay);
                sleep(Sleep);
            }
        } catch(InterruptedException e){
        }
    }
    public static void main(String[] args) {
        // write your code here
        RunThread thr1 = new RunThread("Thread A",1200);

        RunThread thr2 = new RunThread("Thread B",2000);

        thr1.start();

        thr2.start();

    }
}
