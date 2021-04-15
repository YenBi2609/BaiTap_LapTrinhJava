package Ex2;

public class WageEmployee extends Employee {
    double rate;
    int hours;

    public WageEmployee() {
        rate = 0;
        hours = 0;
    }

    public WageEmployee(String empName, double rate, int hours) {
        super(empName);
        this.rate = rate;
        this.hours = hours;
    }
    void DisplayDetails(){
        super.DisplayDetails();
        System.out.printf("\n" + empName + "'s Salary: %.2f\n", rate * hours);
    }
}
