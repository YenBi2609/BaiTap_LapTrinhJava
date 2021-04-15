package Ex2;

public class Employee {
    String empName;

    public Employee() {
        empName ="";
    }

    public Employee(String empName) {
        this.empName = empName;
    }
    void DisplayDetails(){
        System.out.println("Name of Employee: "+ empName);
    }
}

