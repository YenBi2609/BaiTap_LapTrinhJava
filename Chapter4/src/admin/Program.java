package admin;

import people.Student;
import people.Teacher;

public class Program {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setTeacherInfo();
        Student s = new Student();
        s.setStudentDetails();
        s.assignTeacher(t.getName(),t.getCode());

        s.getStudentDetails();

    }
}
