package Ex2;

public class SalaryEmployee extends Employee {
    double salary;

    public SalaryEmployee() {
        salary = 0;
    }

    public SalaryEmployee(String empName, double salary) {
        super(empName);
        this.salary = salary;
    }
    void DisplayDetails(){
        super.DisplayDetails();
        System.out.printf("\n" + empName + "'s Salary: %.2f\n", salary);
    }
}
