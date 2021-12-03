package pl.imiajd.hryciuk;
import java.time.*;

public class Pracownik1 extends Osoba1 {
    private double pobory;
    private LocalDate dataZatrudnienia;

    // KONSTRUKTOR
    public Pracownik1(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec, double pobory, LocalDate dataZatrudnienia) {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.pobory = pobory;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public String getOpis() {
        String print = String.format("pracownik z pensją %.2f zł", pobory);
        print += ", zatrudniony " + dataZatrudnienia;
        return print;
    }

    // METODY DOSTĘPOWE
    public double getPobory() {
        return pobory;
    }

    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
    }
}