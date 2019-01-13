package pl.sda.structure.generic;

public class CalculatorMain {

    public static void main(String args[]){
        Kalkulator kalkulator = new Kalkulator(new Kwadrat(2));
        kalkulator.calculate();

    }


}
