package pl.sda.structure.hostpital;

import pl.sda.structure.hostpital.model.Patient;

import java.util.PriorityQueue;

public class HospitalQueueService {

    private PriorityQueue<Patient> priorityQueue =
            new PriorityQueue<>(new PatientComparator());

    public void add(Patient patient) {
        //TODO
    }

    public Patient next() {
        //TODO
        return null;
    }

    public Patient howIsNext() {
        //TODO
        return null;
    }

    public boolean isEmpty() {
        return priorityQueue.isEmpty();
    }


}
