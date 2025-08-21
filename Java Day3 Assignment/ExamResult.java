// 10. Exam Result
// Problem: Base class Exam with method result(). Subclasses MathExam, ScienceExam, EnglishExam override it.
// Steps:
// 1.	Create Exam with String result().
// 2.	Override to return "Pass/Fail" based on marks.
// 3.	Print result for each subject.

class Exam {
    public String result() {
        return "Result not defined";
    }
}
class MathExam extends Exam {
    private int marks;

    public MathExam(int marks) {
        this.marks = marks;
    }

    @Override
    public String result() {
        return (marks >= 40) ? "Math Exam: Pass" : "Math Exam: Fail";
    }
}

class ScienceExam extends Exam {
    private int marks;

    public ScienceExam(int marks) {
        this.marks = marks;
    }

    @Override
    public String result() {
        return (marks >= 40) ? "Science Exam: Pass" : "Science Exam: Fail";
    }
}

class EnglishExam extends Exam {
    private int marks;

    public EnglishExam(int marks) {
        this.marks = marks;
    }

    @Override
    public String result() {
        return (marks >= 40) ? "English Exam: Pass" : "English Exam: Fail";
    }
}
public class ExamResult {
    public static void main(String[] args) {
        Exam mathExam = new MathExam(45);
        Exam scienceExam = new ScienceExam(35);
        Exam englishExam = new EnglishExam(50);

        System.out.println(mathExam.result());
        System.out.println(scienceExam.result());
        System.out.println(englishExam.result());
    }
}
