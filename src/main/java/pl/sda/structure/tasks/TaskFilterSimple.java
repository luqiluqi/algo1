package pl.sda.structure.tasks;

import pl.sda.structure.tasks.model.Task;

import java.util.List;

public class TaskFilterSimple {

    private final List<Task> allTask;

    public TaskFilterSimple(List<Task> allTask) {
        this.allTask = allTask;
    }

    /**
     * Pobierz taski tylko z priorytetem LOW
     */
    public List<Task> getOnlyWithLowLevel() {
        //TODO
        throw new RuntimeException("Not implemeted yet!");
    }

    /**
     * Pobierz taski tylko z priorytetem MEDIUM
     */
    public List<Task> getOnlyWithMediumLevel() {
        //TODO
        throw new RuntimeException("Not implemeted yet!");
    }


    /**
     * Pobierz taski tylko z priorytetem HIGH
     */
    public List<Task> getOnlyWithHighLevel() {
        //TODO
        throw new RuntimeException("Not implemeted yet!");
    }

}
