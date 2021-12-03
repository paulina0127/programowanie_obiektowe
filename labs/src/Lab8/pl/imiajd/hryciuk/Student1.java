package pl.imiajd.hryciuk;
import java.time.*;

public class Student1 extends Osoba1 {
    private String kierunek;
    private double sredniaOcen;

    // KONSTRUKTOR
    public Student1(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec, String kierunek) {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.kierunek = kierunek;
    }

    public String getOpis() {
        String print = "kierunek studiów: " + kierunek;
        if (sredniaOcen != 0.0)
            print += ", średnia ocen: " + sredniaOcen;

        return print;
    }

    // METODY DOSTĘPOWE
    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }
}