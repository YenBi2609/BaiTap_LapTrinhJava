import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        System.out.print("enter inch : ");
        Scanner in = new Scanner(System.in);
        double inch = in.nextDouble();
        System.out.println( inch + " inch = "+ 2.54*inch + " cm");

        System.out.print("enter cm : ");
        Scanner scan = new Scanner(System.in);
        double cm = scan.nextDouble();
        System.out.println( cm + " cm = "+ cm/2.54 + " inch");
    }
}