package pl.sda.structure.oop.problem1.tyre;

public class Tyre {

    //marka opon
    private TyreName tyreBrandName;

    //Numer seryjny opon
    private String serialNumber;

    Tyre (TyreName name, String serialNumber){
        Parameters parameters = new Parameters(SizeTyre.valueOf());
        this.tyreBrandName = name;
        this.serialNumber = serialNumber;
    }

}
