package pl.sda.structure.generic;

public class Kolo extends Figura<Double> {

    private final double r;

    public Kolo(double r) {
        this.r = r;
    }

    @Override
    public Double calculateArea() {
        return (Math.PI * r * r);
    }
}
