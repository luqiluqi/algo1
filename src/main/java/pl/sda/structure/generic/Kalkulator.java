package pl.sda.structure.generic;

public class Kalkulator<T extends Figura> {

    private T figura;

    public Kalkulator(T figura) {
        this.figura = figura;
    }

    public void calculate(){

        figura.calculateArea();


    }

}
