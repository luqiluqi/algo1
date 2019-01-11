package pl.sda.structure.hostpital.model;

public enum Disease {

    FLU(1), COLD(2), DIARRHEA(3), SOMETHING_SEROIUS(4);

    private final int infectiousness;

    Disease(int infectiousness) {

        this.infectiousness = infectiousness;
    }

    public int getInfectiousness() {
        return infectiousness;
    }

}
