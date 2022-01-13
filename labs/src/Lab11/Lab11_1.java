import java.util.LinkedList;

public class Lab11_1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Kwiat");
        list.add("Nowak");
        list.add("Kowalska");
        list.add("Aneks");
        list.add("Małysz");
        list.add("Cichocki");

        System.out.println(list);
        // ZAD 1
        //redukuj(list, 2);

        // ZAD 2
        //redukujT(list, 2);

        // ZAD 3
        //odwroc(list);

        // ZAD 4
        //odwrocT(list);
        System.out.println(list);
    }

    public static void redukuj(LinkedList<String> pracownicy, int n) {
        for (int i = n; i < pracownicy.size(); i += n)
            pracownicy.remove(i);
    }

    public static <T> void redukujT(LinkedList<T> pracownicy, int n) {
        for (int i = n; i < pracownicy.size(); i += n)
            pracownicy.remove(i);
    }

    public static void odwroc(LinkedList<String> lista) {
        String temp = "";
        for (int i = 0; i < lista.size() / 2; i++) {
            temp = lista.get(i);
            lista.set(i, lista.get(lista.size() - 1 - i));
            lista.set(lista.size() - 1 - i, temp);
        }
    }

    public static <T> void odwrocT(LinkedList<T> lista) {
        T temp;
        for (int i = 0; i < lista.size() / 2; i++) {
            temp = lista.get(i);
            lista.set(i, lista.get(lista.size() - 1 - i));
            lista.set(lista.size() - 1 - i, temp);
        }
    }
}
