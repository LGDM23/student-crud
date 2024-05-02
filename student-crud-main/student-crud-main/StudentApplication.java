public class StudentApplication {
    public static void main(String[] args) {
        // Create a new student object
        Student student = new Student("Dodong Cruz", 21, "CPE");
        Student student = new Student("Rico Blanco", 21, "IT");
        Student student = new Student("Raymond Marasigan", 21, "IT");

        // Display student information
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student Major: " + student.getMajor());
    }
}

class Student {
    private String name;
    private int age;
    private String major;

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }
}
