package pl.imiajd.hryciuk;
import java.time.*;

public class Student2 extends Osoba2 implements Cloneable, Comparable<Osoba2> {
    private double sredniaOcen;

    public Student2(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    public Student2(String nazwisko, LocalDate dataUrodzenia) {
        super(nazwisko, dataUrodzenia);
    }

    public String toString() {
        if (sredniaOcen != 0.0)
            return super.toString() + " średnia ocen: " + sredniaOcen;
        return super.toString();
    }

    public int compareTo(Student2 student) {
        if (super.compareTo(student) == 0) {
            if (this.sredniaOcen == student.sredniaOcen)
                return 0;
            else if (this.sredniaOcen > student.sredniaOcen)
                return 1;
            else
                return -1;
        }
        else
            return super.compareTo(student);
    }
}
