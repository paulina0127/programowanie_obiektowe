package pl.imiajd.hryciuk;

public class Nauczyciel extends Osoba {
    private double pensja;

    public Nauczyciel(String nazwisko, int rokUrodzenia, double pensja) {
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }

    public String toString() {
        return super.toString() + "\n" + "Pensja: " + pensja;
    }
}
