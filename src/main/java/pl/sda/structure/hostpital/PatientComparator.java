package pl.sda.structure.hostpital;

import pl.sda.structure.hostpital.model.Patient;

import java.util.Comparator;

public class PatientComparator implements Comparator<Patient> {

    /**
     *
     * @return
     *  int<0 jeśli patient1 < patient2
     *  int>0 jeśli patient1 > patient2
     *
     * W pierwszej kolejność powinny być obsługiwane osoby z czymś poważnym(Diease.SOMETHIN_SEROIUS)​
     * Dalej osoby których iloczyn howAngry i zarazlwość będzie wyższy
     *
     */
    public int compare(Patient patient1, Patient patient2) {
        //TODO
        return -1;
    }


}
