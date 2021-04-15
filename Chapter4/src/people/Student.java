package people;

import java.util.Scanner;

public class Student {
    private int code;
    private String name;
    private int age;
    private String address;
    private String project;
    private int teacherCode;
    String teacherName;

    public Student(){
        code = 0;
        name ="";
        age = 0;
        address="";
        project="";
        teacherName = "";
    }
    public void getStudentDetails(){
        System.out.println("The details about the student are");
        System.out.println("Code: "+code);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
        System.out.println("Project: "+project);
        System.out.println("Teacher attending the student: "+ teacherName);
    }
    public void setStudentDetails(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter details about the student: ");
        System.out.println("Enter student's code: ");
        code = input.nextInt();

        System.out.println("Enter name: ");
        name = input.next();
        System.out.println("Enter age: ");
        age = input.nextInt();

        System.out.println("Enter address: ");
        address = input.next();
        System.out.println("Enter Project: You can type as many lines as " +
                "you wish. Enter 0 to stop.");
        project = new Scanner(System.in).useDelimiter("0").next();

    }
    public void assignTeacher(String name, int code){
        teacherName = name;
        teacherCode = code;
    }
}
