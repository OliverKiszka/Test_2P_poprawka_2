package pl.kurs.task2.models;

public class Kolo extends Figura {
    private final int d;
    private int number;

    public Kolo(int d) {
        this.d = d;
    }

    protected Kolo(int d, int number) {
        this.d = d;
        this.number = number;
        Figura.counter++;
    }

    @Override
    double calculatePerimeter() {
        return d * Math.PI;
    }

    @Override
    double calculateArea() {
        return Math.PI * (d * d) / 4;
    }

    @Override
    public String toString() {
        return "Figura nr " + number + ": " + "Koło o promieniu " + (d / 2) + ".";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Kolo kolo = (Kolo) object;
        return d == kolo.d;
    }

}
