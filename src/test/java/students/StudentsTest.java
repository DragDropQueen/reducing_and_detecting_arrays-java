package students;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by savannah on 11/11/14.
 */
public class StudentsTest {
    Students students;

    @Before
    public void setStudents() {
        students = new Students();
    }

    @Test
    public void ReturnsAllStudents() {
        assertEquals(students.all().size(), 5);
        assertEquals(students.all().get(0).name(), "Sue");
        assertEquals(students.all().get(4).age(), 22);
    }

    @Test
    public void canCalculateTheAverageAgeOfTheClass() {
        assertEquals(13, students.averageAge());
    }

    @Test
    public void canReturnAStringOfStudentNames() {
        assertEquals("Sue Bob Greg Amanda Steve", students.nameString());
    }

    @Test
    public void canFindStudentsOlderThanACertainAge() {
        assertEquals("Greg", students.findFirstOlderThan(10).name());
    }

    @Test
    public void canTellIfAnyStudentsAreOldEnoughToDrink() {
        assertEquals(true, students.anyOlderThan(21));

        assertEquals(false, students.anyOlderThan(55));
    }

    @Test
    public void canFindASpecificStudent() {
        assertEquals("Sue", students.findStudent("Sue").name());

        assertEquals(null, students.findStudent("Link"));
    }

    @Test
    public void canDetermineIfStudentIsPresent() {
        assertEquals(true, students.studentPresent("Sue"));

        assertEquals(false, students.studentPresent("Link"));
    }
}
