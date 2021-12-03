package pl.imiajd.hryciuk;
import java.time.*;

abstract public class Osoba1 {
    private String nazwisko;
    private String[] imiona;
    private LocalDate dataUrodzenia;
    private boolean plec;

    // KONSTRUKTOR
    public Osoba1(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec) {
        this.nazwisko = nazwisko;
        this.imiona = imiona;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }

    public abstract String getOpis();

    public String toString() {
        String print = "";
        for (String i : imiona) {
            print += i;
            print += " ";
        }

        print += nazwisko + ", urodzony/a " + dataUrodzenia + ", ";
        if (plec == false)
            print += "mężczyzna";
        else
            print += "kobieta";

        return print;
    }

    // METODY DOSTĘPOWE
    public String getNazwisko() {
        return nazwisko;
    }

    public String[] getImiona() {
        return imiona;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public boolean getPlec() {
        return plec;
    }
}