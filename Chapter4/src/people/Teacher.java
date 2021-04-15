package people;

import java.util.Scanner;

public class Teacher {
    private int code;
    private String name;
    private String address;
    private String phone;

    public Teacher(){
        code = 0;
        name = "";
        address = "";
        phone = "";
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
    public void getTeacherInfo() {

        System.out.println("The details about the teacher are:");
        System.out.println("Code: " + code);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phone);
    }
    public void setTeacherInfo() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter details about the teacher:");
        System.out.println("Enter teacher's code:");

        code = input.nextInt();
        input.nextLine();
        System.out.println("Enter name:");
        name = input.nextLine();
        System.out.println("Enter address:");
        address = input.nextLine();
        System.out.println("Enter phone number:");
        phone = input.nextLine();
    }


}
