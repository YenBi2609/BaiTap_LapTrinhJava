package Ex8;

import java.util.Collection;

public class EmployeeDetail {
    public EmployeeDetail() {
    }
    void printCollection(Collection<?> collect){
        for (Object obj : collect)

            System.out.println(obj.toString());
    }
    void printDerivedCollection(Collection<? extends Employee> collect){
        for (Object obj : collect)
            System.out.println(obj.toString());
    }
}
