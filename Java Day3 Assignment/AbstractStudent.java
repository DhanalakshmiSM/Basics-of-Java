// 16. Abstract Student
// Problem: Abstract class Student with method getGrade(). Implement in UGStudent and PGStudent.
// Steps:
// 1.	Define abstract Student.
// 2.	Implement grade logic in subclasses.
// 3.	Print student grades.

abstract class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract String getGrade();
}

class UGStudent extends Student {
    int year;
    double marks;

    public UGStudent(String name, int id, int year, double marks) {
        super(name, id);
        this.year = year;
        this.marks = marks;
    }

    @Override
    String getGrade() {
        if (marks >= 60) {
            return "First Class";
        } else if (marks >= 50) {
            return "Second Class";
        } else {
            return "Fail";
        }
    }
}

class PGStudent extends Student {
    String thesisTitle;
    double marks;

    public PGStudent(String name, int id, String thesisTitle, double marks) {
        super(name, id);
        this.thesisTitle = thesisTitle;
        this.marks = marks;
    }

    @Override
    String getGrade() {
        if (marks >= 70) {
            return "Distinction";
        } else if (marks >= 60) {
            return "First Class";
        } else {
            return "Fail";
        }
    }
}
public class AbstractStudent {
    public static void main(String[] args) {
        Student ugStudent = new UGStudent("Alice", 1, 2, 65);
        Student pgStudent = new PGStudent("Bob", 2, "AI Research", 75);

        System.out.println(ugStudent.name + " (UG) - Grade: " + ugStudent.getGrade());
        System.out.println(pgStudent.name + " (PG) - Grade: " + pgStudent.getGrade());
    }
}