package pl.kurs.task2.models;


public class Kwadrat extends Figura {
    private final int a;
    private int number;

    public Kwadrat(int a) {
        this.a = a;
    }

    protected Kwadrat(int a, int number) {
        this.a = a;
        this.number = number;
        Figura.counter++;
    }


    @Override
    double calculatePerimeter() {
        return 4 * a;
    }

    @Override
    double calculateArea() {
        return a * a;
    }

    @Override
    public String toString() {
        return "Figura nr " + number + ": " + "Kwadrat o boku " + a + ".";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Kwadrat kwadrat = (Kwadrat) object;
        return a == kwadrat.a;
    }

}
