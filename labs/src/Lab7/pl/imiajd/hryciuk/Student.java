package pl.imiajd.hryciuk;

public class Student extends Osoba {
    private String kierunek;

    public Student(String nazwisko, int rokUrodzenia, String kierunek) {
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;
    }

    public String toString() {
        return super.toString() +  "\n" + "Kierunek: " + kierunek;
    }

    public String getKierunek() {
        return kierunek;
    }
}
