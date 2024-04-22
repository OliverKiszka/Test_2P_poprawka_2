package pl.kurs.task2.models;

public class Prostokat extends Figura {
    private final int a;
    private final int b;
    private int number;

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    protected Prostokat(int a, int b, int number) {
        this.a = a;
        this.b = b;
        this.number = number;
        Figura.counter++;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (a + b);
    }

    @Override
    double calculateArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Figura nr " + number + ": " + "Prostokat o bokach " + a + "x" + b + ".";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Prostokat prostokat = (Prostokat) object;
        return a == prostokat.a && b == prostokat.b;
    }

}
