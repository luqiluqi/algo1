package pl.sda.structure.generic;

public class Kwadrat extends Figura<Double> {

    private double a;

    public Kwadrat(double a) {
        this.a = a;
    }

    @Override
    public Double calculateArea() {
        return a * a;
    }
}
