import pl.imiajd.hryciuk.*;
import java.time.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Lab9_2 {
    public static void main(String[] args) {
        ArrayList<Student2> grupa = new ArrayList<>();
        grupa.add(new Student2("Nowak", LocalDate.of(1995, 10, 15), 4.5));
        grupa.add(new Student2("Kowalski", LocalDate.of(1999, 5, 7), 3.8));
        grupa.add(new Student2("Kowalski", LocalDate.of(1995, 10, 17)));
        grupa.add(new Student2("Aneks", LocalDate.of(1993, 1, 1), 4.1));
        grupa.add(new Student2("Kwiatkowska", LocalDate.of(1998, 9, 4), 5.0));

        for (Student2 student : grupa)
            System.out.println(student.toString());

        grupa.sort(Comparator.comparing(Osoba2::getNazwisko));
        System.out.println();
        System.out.println("Po sortowaniu:");
        for (Student2 student : grupa)
            System.out.println(student.toString());

        System.out.println();
        System.out.println("Equals(): " + grupa.get(1).equals(grupa.get(1)));
        System.out.println("CompareTo(): " + grupa.get(1).compareTo(grupa.get(1)));

        System.out.println("Equals(): " + grupa.get(1).equals(grupa.get(2)));
        System.out.println("CompareTo(): " + grupa.get(1).compareTo(grupa.get(2)));

        System.out.println("Equals(): " + grupa.get(3).equals(grupa.get(4)));
        System.out.println("CompareTo(): " + grupa.get(3).compareTo(grupa.get(4)));
    }
}