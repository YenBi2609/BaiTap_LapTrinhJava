package Ex2;

import Ex2.SalaryEmployee;
import Ex2.WageEmployee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee objJohn = new SalaryEmployee("John", 2300.50);

        objJohn.DisplayDetails();

        Employee objDavid = new WageEmployee("David", 34.50, 10);

        objDavid.DisplayDetails();




    }
}
