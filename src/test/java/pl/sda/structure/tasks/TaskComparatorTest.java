package pl.sda.structure.tasks;

import org.junit.Test;
import pl.sda.structure.tasks.model.Task;
import pl.sda.structure.tasks.model.TaskPriority;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class TaskComparatorTest {

    @Test
    public void testCompare1() {
        Task t1 = new Task(TaskPriority.HIGH, "t1", LocalDate.now());
        Task t2 = new Task(TaskPriority.MEDIUM, "t1", LocalDate.now().minusDays(10));

        TaskComparator taskComparator = new TaskComparator();

        int compareResult = taskComparator.compare(t1, t2);

        // 1 bo task t1 ma wyższy priorytet
        assertEquals(1, compareResult);
    }

    @Test
    public void testCompare2() {
        Task t1 = new Task(TaskPriority.HIGH, "t1", LocalDate.now().plusYears(1));
        Task t2 = new Task(TaskPriority.HIGH, "t1", LocalDate.now().minusDays(10));

        TaskComparator taskComparator = new TaskComparator();

        int compareResult = taskComparator.compare(t1, t2);

        // -1  - bo task t2 minał okres waznośći , trzeba go wykonać ASAP!
        assertEquals(-1 , compareResult);
    }

    @Test
    public void testCompare3() {
        Task t1 = new Task(TaskPriority.MEDIUM, "t1", LocalDate.now().plusDays(1));
        Task t2 = new Task(TaskPriority.MEDIUM, "t1", LocalDate.now().plusMonths(1));

        TaskComparator taskComparator = new TaskComparator();

        int compareResult = taskComparator.compare(t1, t2);

        // 1 bo task t1.dueDate nastąpi szybciej
        assertEquals(1, compareResult);
    }

    @Test
    public void testCompare4() {
        Task t1 = new Task(TaskPriority.MEDIUM, "t1", LocalDate.now().plusDays(1));
        Task t2 = new Task(TaskPriority.HIGH, "t1", LocalDate.now().plusMonths(1));

        TaskComparator taskComparator = new TaskComparator();

        int compareResult = taskComparator.compare(t1, t2);

        // -1 bo task t2 ma wyższy priorytet
        assertEquals(-1, compareResult);
    }

    @Test
    public void testCompare5() {
        Task t1 = new Task(TaskPriority.MEDIUM, "t1", LocalDate.now().minusDays(1));
        Task t2 = new Task(TaskPriority.HIGH, "t1", LocalDate.now().minusDays(2));

        TaskComparator taskComparator = new TaskComparator();

        int compareResult = taskComparator.compare(t1, t2);

        // -1 bo task t2 ma wyższy priorytet
        assertEquals(-1, compareResult);
    }


}