class Student {
    String name;
    static int idCounter = 0;
    int id;

    Student(String name) {
        this.name = name;
        this.id = ++idCounter; // Auto-generate unique ID
    }
}

public class UniversityEnrollmentSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Deeksha");
        Student s2 = new Student("Sahana");
        System.out.println("Student 1 ID: " + s1.id);
        System.out.println("Student 2 ID: " + s2.id);
    }
}
