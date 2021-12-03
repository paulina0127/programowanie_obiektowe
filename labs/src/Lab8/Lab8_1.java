import pl.imiajd.hryciuk.*;
import java.time.*;

public class Lab8_1 {
    public static void main(String[] args) {
        Osoba1[] ludzie = new Osoba1[2];
        String[] imiona = new String[]{"Jan"};

        ludzie[0] = new Pracownik1("Kowalski", imiona, LocalDate.of(2000, 12, 19),  false, 5000, LocalDate.of(2020, 10, 15));

        imiona = new String[]{"Małgorzata", "Anna"};
        ludzie[1] = new Student1("Nowak", imiona, LocalDate.of(1998, 4, 5), true,"informatyka");
        ((Student1)ludzie[1]).setSredniaOcen(4.57);

        for (Osoba1 p : ludzie)
            System.out.println(p.toString() + " - " + p.getOpis());
    }
}






