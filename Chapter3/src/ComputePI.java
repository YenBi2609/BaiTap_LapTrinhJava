import java.util.Scanner;

public class ComputePI {
    public static void main(String[] args) {
        double pi = 0;
        double i = 0;
        int sign = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of iterations:");
        int Number_Of_Iterations = scanner.nextInt();

        while (i < Number_Of_Iterations) {

            pi = pi + 4 * sign / (2 * i + 1);

            i++;

            sign = - sign;

        }
        System.out.println(pi);

    }
}
