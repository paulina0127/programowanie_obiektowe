import java.util.Map;
import java.util.TreeMap;

public class Lab12_2 {
    public static void main(String[] args) {
        Map<String, String> oceny = new TreeMap<String, String>();

        // dodanie studentów
        oceny.put("Carl", "db+");
        oceny.put("Joe", "db");
        oceny.put("Susan", "bdb");

        // wyświetlenie listy studentów
        System.out.println("Lista studentów:");
        oceny.forEach((key, value) -> System.out.println(key + ": " + value));

        // usuwanie studentów
        oceny.remove("Carl");
        System.out.println("\nLista studentów po usunięciu:");
        oceny.forEach((key, value) -> System.out.println(key + ": " + value));

        // zmiana oceny studenta
        oceny.replace("Joe", "db+");
        System.out.println("\nLista studentów po zmianie oceny:");
        oceny.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
