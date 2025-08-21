// 19. Abstract Course
// Problem: Abstract class Course with getDuration() and getFee(). Implement in JavaCourse and PythonCourse.
// Steps:
// 1.	Create abstract class.
// 2.	Implement in subclasses.
// 3.	Print course details.

abstract class Course {
    abstract String getDuration();
    abstract double getFee();
}

class JavaCourse extends Course {
    @Override
    String getDuration() {
        return "3 months";
    }

    @Override
    double getFee() {
        return 300.0;
    }
}

class PythonCourse extends Course {
    @Override
    String getDuration() {
        return "2 months";
    }

    @Override
    double getFee() {
        return 250.0;
    }
}
public class AbstractCourse {
    public static void main(String[] args) {
        Course javaCourse = new JavaCourse();
        Course pythonCourse = new PythonCourse();

        System.out.println("Java Course:");
        System.out.println("Duration: " + javaCourse.getDuration());
        System.out.println("Fee: " + javaCourse.getFee());

        System.out.println("\nPython Course:");
        System.out.println("Duration: " + pythonCourse.getDuration());
        System.out.println("Fee: " + pythonCourse.getFee());
    }
}