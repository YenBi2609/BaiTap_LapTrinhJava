package Ex8;

public class HREmployee extends Employee{
    private String deptName;
    private String deptCode;

    public HREmployee() {
    }

    public HREmployee(String employeeName, String employeeNo, String employeeDesign, String deptName, String deptCode) {
        super(employeeName, employeeNo, employeeDesign);
        this.deptName = deptName;
        this.deptCode = deptCode;
    }

}
