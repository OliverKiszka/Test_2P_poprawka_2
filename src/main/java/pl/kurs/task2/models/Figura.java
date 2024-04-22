package pl.kurs.task2.models;

import java.util.List;

public abstract class Figura {

    protected static int counter = 1;

    abstract double calculatePerimeter();

    abstract double calculateArea();

    public static Kwadrat stworzKwadrat(int a) {
        return new Kwadrat(a, counter);
    }

    public static Kolo stworzKolo(int d) {
        return new Kolo(d, counter);
    }

    public static Prostokat stworzProstokat(int a, int b) {
        return new Prostokat(a, b, counter);
    }

    public static Figura getFiguraWithHighestPerimeter(List<Figura> figury) {
        if (figury != null && !figury.isEmpty()) {
            Figura resultFigura = null;
            double maxPerimeter = 0;
            for (Figura f : figury) {
                if (f != null) {
                    double perimeter = f.calculatePerimeter();
                    if (perimeter > maxPerimeter) {
                        maxPerimeter = perimeter;
                        resultFigura = f;
                    }
                }
            }
            return resultFigura;
        } else {
            return null;
        }
    }

    public static Figura getFiguraWithHighestArea(List<Figura> figury) {
        if (figury != null && !figury.isEmpty()) {
            Figura resultFigura = null;
            double maxArea = 0;
            for (Figura f : figury) {
                if (f != null) {
                    double area = f.calculateArea();
                    if (area > maxArea) {
                        maxArea = area;
                        resultFigura = f;
                    }
                }
            }
            return resultFigura;
        } else {
            return null;
        }
    }


}
