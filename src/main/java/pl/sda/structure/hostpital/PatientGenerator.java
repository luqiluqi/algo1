package pl.sda.structure.hostpital;

import pl.sda.structure.hostpital.model.Disease;
import pl.sda.structure.hostpital.model.Patient;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PatientGenerator {
    private static final List<String> name = Arrays
            .asList("Jakub", "Katarzyna", "Mateusz", "Pawel", "Michal");
    private static final List<String> surname = Arrays
            .asList("Kowalski", "Nowak", "Podsiadlo", "Wisniewski", "Nosacz");

    public Patient get() {
        //Generator liczb pseudolosowych - wbudowany w javie
        Random rand = new Random();
        // rand.nextInt(5) - zwraca liczbę losowa z przedziału o 0 do 5 włącznie
        final String name = PatientGenerator.name.get(rand.nextInt(5));
        final String surname = PatientGenerator.surname.get(rand.nextInt(5));
        final Disease[] diseases = Disease.values();
        final Disease randomDisease = diseases[rand.nextInt(diseases.length)];

        Patient patient = new Patient();

        //TODO uzupełnij pole name,surname,dieses,randomDisease

        return patient;
    }
}
