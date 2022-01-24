import java.util.Map;
import java.util.TreeMap;

public class Lab12_3 {
    public static void main(String[] args) {
        Map<Student, Integer> ids = new TreeMap<Student, Integer>();
        Map<Student, String> oceny = new TreeMap<Student, String>();

        Student student1 = new Student("Joe", "White" ,1);
        Student student2 = new Student("Carl", "White" ,2);
        Student student3 = new Student("Susan", "Stacy", 3);

        // dodanie studentów
        put(ids, oceny, student1, "db");
        put(ids, oceny, student2, "db+");
        put(ids, oceny, student3, "bdb");

        // wyświetlenie listy studentów
        System.out.println("Lista studentów:");
        oceny.forEach((key, value) -> System.out.println(key.getImie() + " " + key.getNazwisko() + ": " + value));

        // usuwanie studentów
        remove(ids, oceny, 2);
        System.out.println("\nLista studentów po usunięciu:");
        oceny.forEach((key, value) -> System.out.println(key.getImie() + " " + key.getNazwisko() + ": " + value));

        // zmiana oceny studenta
        replace(ids, oceny, 1, "db+");
        System.out.println("\nLista studentów po zmianie oceny:");
        oceny.forEach((key, value) -> System.out.println(key.getImie() + " " + key.getNazwisko() + ": " + value));
    }

    public static void put(Map<Student, Integer> ids, Map<Student, String> oceny, Student student, String ocena) {
        ids.put(student, student.getId());
        oceny.put(student, ocena);
    }

    public static void remove(Map<Student, Integer> ids, Map<Student, String> oceny, int id) {
        for (Student key : ids.keySet())
            if (ids.get(key) == id) {
                ids.remove(key);
                oceny.remove(key);
                break;
            }
    }

    public static void replace(Map<Student, Integer> ids, Map<Student, String> oceny, int id, String ocena) {
        for (Student key : ids.keySet())
            if (ids.get(key) == id) {
                oceny.replace(key, ocena);
                break;
            }
    }
}

class Student implements Comparable<Student> {
    private String imie;
    private String nazwisko;
    private int id;

    public Student() {}

    public Student(String imie, String nazwisko, int id) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id = id;
    }

    @Override
    public int compareTo(Student student) {
        if (this.nazwisko.compareTo(student.nazwisko) == 0) {
            if (this.imie.compareTo(student.imie) == 0) {
                if (this.id > student.id)
                    return 1;
                else if (this.id < student.id)
                    return -1;
                else
                    return 0;
            }
            else
                return this.imie.compareTo(student.imie);
        }
        else
            return this.nazwisko.compareTo(student.nazwisko);
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getId() {
        return id;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setId(int id) {
        this.id = id;
    }
}