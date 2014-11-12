package students;

/**
 * Created by savannah on 11/11/14.
 */
public class Student {
    private String name;
    private int age;

    public Student(String student_name, int student_age) {
        name = student_name;
        age = student_age;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }
}
