package Ex4;

public class Student {
    String studentName;
    String studentID;
    String description;
    int studentAge;

    public Student(String studentName, String studentID, String description, int studentAge) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.description = description;
        this.studentAge = studentAge;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentID='" + studentID + '\'' +
                ", description='" + description + '\'' +
                ", studentAge=" + studentAge +
                '}';
    }
}
