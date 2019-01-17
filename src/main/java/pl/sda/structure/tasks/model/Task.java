package pl.sda.structure.tasks.model;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Klasa reprezentuje zadanie do wykonania
 */
public class Task {

    //Priorytety zadania
    private TaskPriority priority;
    //Nazwa zadania
    private String taskName;
    //Do kiedy ważny
    private LocalDate dueDate;

    public Task(TaskPriority priority, String taskName, LocalDate dueDate) {
        this.priority = priority;
        this.taskName = taskName;
        this.dueDate = dueDate;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public String getTaskName() {
        return taskName;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return priority == task.priority &&
                Objects.equals(taskName, task.taskName) &&
                Objects.equals(dueDate, task.dueDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority, taskName, dueDate);
    }

    @Override
    public String toString() {
        return "Task{" +
                "priority=" + priority +
                ", taskName='" + taskName + '\'' +
                ", dueDate=" + dueDate +
                '}';
    }
}
