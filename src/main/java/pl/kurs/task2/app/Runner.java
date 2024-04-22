package pl.kurs.task2.app;

import pl.kurs.task2.models.*;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        //nadawanie numeru recznie niemożliwe, bo konstruktor jest protected
        //Kolo koloCreatedByConstructor = new Kolo(5, 4);

        List<Figura> figury = Arrays.asList(Figura.stworzKwadrat(10), Figura.stworzKolo(20), Figura.stworzProstokat(10, 20), Figura.stworzKwadrat(18));
        for (Figura f : figury) {
            System.out.println(f);
        }

        System.out.println("Figura z największym obwodem to: " + Figura.getFiguraWithHighestPerimeter(figury));
        System.out.println("Figure z największym polem to: " + Figura.getFiguraWithHighestArea(figury));

        System.out.println(figury.contains(new Kwadrat(10))); //wypisuje true, bo equals() jest overrided


        //UWAGA!

        //Figura stworzona metodą fabryczną ma sekwencyjny numer
        System.out.println(Figura.stworzKwadrat(18));
        //Figura stworzona konstruktorem ma zero
        System.out.println(new Kwadrat(18));

    }
}
