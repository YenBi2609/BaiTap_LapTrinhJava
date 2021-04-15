import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        System.out.print("Enter a day:");

        Scanner scanner=new Scanner(System.in);

        int day=scanner.nextInt();

        String dayString;

        switch (day) {

            case 1: dayString = "Monday"; break;

            case 2: dayString = "Tuesday"; break;

            case 3: dayString = "Wednesday"; break;

            case 4: dayString = "Thursday"; break;

            case 5: dayString = "Friday"; break;

            case 6: dayString = "Saturday"; break;

            case 7: dayString = "Sunday"; break;

            default: dayString = "Invalid day"; break;

        }

        System.out.println(dayString);

    }
}

