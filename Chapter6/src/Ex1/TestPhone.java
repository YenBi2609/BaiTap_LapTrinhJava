package Ex1;

import java.util.Scanner;

public class TestPhone {
    public static void main(String[] args) {
// Create an instance of MobilePhone class
        MobilePhone objNokia = new MobilePhone();
        Scanner input = new Scanner(System.in);
// Variable to store user's choice
        byte choice ;
// Iterate until the chooses to exit the application
        do {
            System.out.printf("\nSelect an operation from the following:");
            System.out.println("\n1. Add phone numbers \n2. Send Message\n3. Exit");
// Accept the choice from the user
            System.out.println("Enter the choice: ");
            choice = input.nextByte();

// Invoke the methods of MobilePhone class depending on the
// operation selected by the user
            if(choice == 1) {
                objNokia.setPhoneNumbers();

            } else if (choice == 2) {
                objNokia.sendMessage();
            }
        } while(choice != 3);
    }
}
