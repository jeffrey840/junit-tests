import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testCreateStudent(){
        Student Jeffrey = new Student(1L, "Jeffrey");
        Student Joe = null;
        assertNull(Joe);
        assertNotNull(Jeffrey);
    }

    @Test
    public void testStudentFields(){
        Student Jeffrey = new Student(1L, "Jeffrey");
        assertSame(1L, Jeffrey.getId());
        assertSame("Jeffrey", Jeffrey.getName());
        assertSame(0, Jeffrey.getGrades().size());
    }


    @Test
    public void testAddGrade(){
        Student Jeffrey = new Student(1L, "Jeffrey");
        Jeffrey.addGrade(100);
        assertSame(100, Jeffrey.getGrades().get(0));
        Jeffrey.addGrade(80);
        assertSame(80, Jeffrey.getGrades().get(1));
    }

    @Test
    public void testAverageGrade(){
        Student Jeffrey = new Student(1L, "Jeffrey");
        Jeffrey.addGrade(100);
        Jeffrey.addGrade(80);
        assertEquals(90, Jeffrey.getGradeAverage(), 0);
    }
}