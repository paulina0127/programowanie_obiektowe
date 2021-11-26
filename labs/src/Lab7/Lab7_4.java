import pl.imiajd.hryciuk.*;

public class Lab7_4 {
    public static void main(String[] args) {
        Osoba osoba = new Osoba("Kowalski", 1975);
        Student student = new Student("Nowak", 1997, "Informatyka");
        Nauczyciel nauczyciel = new Nauczyciel("Ptak", 1962, 3500.00);

        System.out.println(osoba.toString());
        System.out.println();
        System.out.println(student.toString());
        System.out.println();
        System.out.println(nauczyciel.toString());
    }
}
