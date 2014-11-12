package students;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by savannah on 11/11/14.
 */
public class Students {
    ArrayList<Student> students = new ArrayList();

    public Students() {
        Student bob = new Student("Bob", 10);
        Student sue = new Student("Sue", 10);
        Student greg = new Student("Greg", 15);
        Student amanda = new Student("Amanda", 8);
        Student steve = new Student("Steve", 22);

        students.add(sue);
        students.add(bob);
        students.add(greg);
        students.add(amanda);
        students.add(steve);
    }

    public ArrayList<Student> all() {
        return students;
    }

    public int averageAge() {
        int ages = 0;

        for (Student student : students) {
            ages = ages + student.age();
        }

        return ages/students.size();
    }

    public String nameString() {
        String names = "";

        for (Student student : students) {
            names = names + " " + student.name();
        }

        return names.trim();
    }

    public Student findFirstOlderThan(int age) {
        for (Student student : students) {
            if (student.age() > age) {
                return student;
            }
        }

        return null;
    }

    public boolean anyOlderThan(int age) {
        if (findFirstOlderThan(age) != null) {
            return true;
        }

        return false;
    }

    public Student findStudent(String name) {
        for (Student student : students) {
            if (student.name().equals(name)) {
                return student;
            }
        }

        return null;
    }

    public boolean studentPresent(String name) {
        if (findStudent(name) != null) {
            return true;
        }

        return false;
    }

    public Object[] groupByAge(int age) {
        ArrayList<String> agedStudents = new ArrayList();

        for ( Student student : students ) {
            if (student.age() == age) {
                agedStudents.add(student.name());
            }
        }

        return agedStudents.toArray();
    }
}
