import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        double tax = 0.0825;
        Scanner in = new Scanner(System.in);
        System.out.print("Price of the item is :");
        double price = in.nextDouble();
        System.out.printf("tax of the item : %.3f", price*tax);
        System.out.printf("\npurchase price of the item : %.3f" , price + price*tax);
    }
}
