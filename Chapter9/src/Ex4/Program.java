package Ex4;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) throws Exception{
        PeopleList<Student> listStudent = new PeopleList<Student>();
        listStudent.add(new Student("Yen","123", "Class1", 21));
        listStudent.add(new Student("Hang","321", "Class2", 22));
        System.out.println("Is the list empty? " + listStudent.checkEmpty());

        System.out.println("Size of the list: " + listStudent.getSize());

        System.out.println("Student Details:");

        System.out.println("************");

        listStudent.display();

    }
}
