import java.util.ArrayList;
import java.util.LinkedList;

public class Lab11_5 {
    public static void main(String[] args) {
        // ZAD 8
        LinkedList<Integer> liczby = new LinkedList<>();
        ArrayList<String> imiona = new ArrayList<>();

        liczby.add(1);
        liczby.add(2);
        liczby.add(3);
        imiona.add("Alek");
        imiona.add("Maria");
        imiona.add("Kasia");

        print(liczby);
        System.out.println();
        print(imiona);
    }

    public static <E extends Iterable<?>> void print(E obiekt) {
        obiekt.forEach((element) -> System.out.print(element + ", " ));
    }
}