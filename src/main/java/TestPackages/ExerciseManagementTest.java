package TestPackages;

import org.junit.Before;
import org.junit.Test;
import exercises.ExerciseManagement;

import static org.junit.Assert.*;

public class ExerciseManagementTest {
    private ExerciseManagement management;

    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning() {
        ExerciseManagement management = new ExerciseManagement();
        assertEquals(0,management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        ExerciseManagement management = new ExerciseManagement();
        management.add("write a test");
        assertEquals(1,management.exerciseList().size());
    }

    @Test
    public void addedExercisesInList() {
        ExerciseManagement management = new ExerciseManagement();
        management.add("write a test");
        assertTrue(management.exerciseList().contains("write a test"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("New Exercise");
        management.markAsCompleted("New Exercise");
        assertFalse(management.isCompleted("Some Exercise"));
    }




}
