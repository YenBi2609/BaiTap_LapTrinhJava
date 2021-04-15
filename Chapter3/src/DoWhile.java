import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        char ch;
        Scanner scanner = new Scanner(System.in);
        do{

            System.out.print("Nhap vao mot ky tu: ");

            ch = (scanner.next()).charAt(0);

            System.out.printf("==>Ky tu vua nhap la: %c\n", ch);

        }while(ch != 'z');

        System.out.print("\nThe loop is completed. \n");
    }
}
