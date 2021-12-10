package pl.imiajd.hryciuk;
import java.time.*;

import java.time.LocalDate;

public class Osoba2 implements Cloneable, Comparable<Osoba2> {
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba2(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String toString() {
        return "Osoba2 [" + nazwisko + ", " + dataUrodzenia + "]";
    }

    public boolean equals(Osoba2 osoba) {
        if (this.nazwisko.equals(osoba.nazwisko) == true && this.dataUrodzenia.equals(osoba.dataUrodzenia) == true)
            return true;
        return false;
    }

    public int compareTo(Osoba2 osoba) {
        if (this.nazwisko.compareTo(osoba.nazwisko) == 0) {
            if (this.dataUrodzenia.compareTo(osoba.dataUrodzenia) == 0)
                return 0;
            else if (this.dataUrodzenia.compareTo(osoba.dataUrodzenia) > 0)
                return 1;
            else
                return -1;
        }
        else if (this.nazwisko.compareTo(osoba.nazwisko) > 0)
            return 1;
         else
            return -1;
    }

    // METODY DOSTĘPOWE
    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }
}
