package Ex8;

public class Employee {
    private String employeeName;
    private String employeeNo;
    private String employeeDesign;

    public Employee() {
    }

    public Employee(String employeeName, String employeeNo, String employeeDesign) {
        this.employeeName = employeeName;
        this.employeeNo = employeeNo;
        this.employeeDesign = employeeDesign;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeNo='" + employeeNo + '\'' +
                ", employeeDesign='" + employeeDesign + '\'' +
                '}';
    }
}
