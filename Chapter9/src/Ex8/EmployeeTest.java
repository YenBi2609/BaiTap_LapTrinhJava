package Ex8;

import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<Employee>();

        System.out.println("Employee Class Details: ");
        System.out.println("***********************");

        emp.add(0, new Employee("Raphael John", "A001", "Team Lead"));

        emp.add(1, new Employee("Jenny Samuel", "A002", "Project Manager"));

        System.out.print(emp);
        System.out.println();

        EmployeeDetail empObj = new EmployeeDetail();

        empObj.printCollection(emp);

/**

 * Creates an user defined ArrayList of type HREmployee.

 */

        ArrayList<HREmployee> empHR = new ArrayList<HREmployee>(1);

        System.out.println("\nHREmployee Class Details: ");

        System.out.println("*************************");

        empHR.add(0, new HREmployee("Angelina John", "A001", "Project Manager",

                "Operations", "01"));

        empHR.add(1, new HREmployee("Susan Pitt", "A002", "Team Leader",

                "Writing", "02"));

        System.out.print(empHR);
        System.out.println();
        empObj.printDerivedCollection(empHR);
    }
}
