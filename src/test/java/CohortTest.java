import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {

    Cohort emptyCohort;
    Cohort cohortWOne;
    Cohort cohortWMany;

    @Before
    public void init() {

        emptyCohort = new Cohort();
        cohortWOne = new Cohort();
        cohortWMany = new Cohort();

        Student john = new Student(10L, "john");
        Student jack = new Student(20L, "jack");

        john.addGrade(90);
        john.addGrade(70);

        jack.addGrade(50);
        jack.addGrade(80);
        cohortWOne.addStudent(john);
        cohortWMany.addStudent(john);
        cohortWMany.addStudent(jack);

    }

    @Test
    public void testIfAddStudentWorks() {
        assertEquals(1, cohortWOne.getStudents().size());
        assertEquals(2, cohortWMany.getStudents().size());
    }

    @Test
    public void testIfGetStudentsWork() {
        assertEquals(10, cohortWMany.getStudents().get(0).getId());
        assertEquals(20, cohortWMany.getStudents().get(1).getId());
    }

    @Test
    public void testIfCohortAvgWorks() {
        assertEquals(70, cohortWOne.getCohortAverage(), 0.5);
        assertEquals(77.5, cohortWMany.getCohortAverage(), 0.5);
    }
}

