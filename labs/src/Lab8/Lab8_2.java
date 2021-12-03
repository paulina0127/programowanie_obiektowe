import pl.imiajd.hryciuk.*;
import java.util.ArrayList;
import java.time.*;

public class Lab8_2 {
    public static void main(String[] args) {
        ArrayList<Instrument> orkiestra = new ArrayList<>();

        orkiestra.add(new Flet("Metro", LocalDate.of(1995, 10, 15)));
        orkiestra.add(new Flet("Metro", LocalDate.of(2000, 5, 1)));
        orkiestra.add(new Skrzypce("Gewa", LocalDate.of(2005, 3, 25)));
        orkiestra.add(new Skrzypce("Gewa", LocalDate.of(2010, 7, 20)));
        orkiestra.add(new Fortepian("Magnus", LocalDate.of(2018, 6, 11)));

        for (Instrument i : orkiestra) {
            System.out.println("Dźwięk: " + i.dzwiek());
            System.out.println(i.toString());
        }
    }
}