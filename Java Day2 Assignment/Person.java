class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void display() {
        super.display();
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Student s = new Student("Rahul", 20, "A");
        s.display();
    }
}
