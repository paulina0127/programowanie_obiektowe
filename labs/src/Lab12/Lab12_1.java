import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Scanner;

public class Lab12_1 {
    public static void main(String[] args) {
        PriorityQueue<Zadanie> queue = new PriorityQueue<Zadanie>(Comparator.comparing(Zadanie::getPriorytet));
        queue.add(new Zadanie(1, "Zrób zakupy"));
        queue.add(new Zadanie(3, "Posprzątaj"));
        queue.add(new Zadanie(2, "Przygotuj obiad"));

        //printQueue(queue);

        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz polecenie.");
        String polecenie = scan.nextLine();

        if (polecenie.contains("dodaj")) {
            int priorytet = Integer.parseInt(polecenie.substring(6,7));
            String opis = polecenie.substring(8,polecenie.length());
            queue.add(new Zadanie(priorytet, opis));
        }

        else if (polecenie.equals("następne"))
            System.out.println("Usunięto " + queue.remove());

        else if (polecenie.equals("zakończ"))
            System.out.println("Zakończono pracę programu.");

        printQueue(queue);
    }

    public static void printQueue(PriorityQueue<Zadanie> queue) {
        while (!queue.isEmpty())
            System.out.println(queue.remove());
        return;
    }
}

class Zadanie {
    private int priorytet;
    private String opis;

    // KONSTRUKTOR
    public Zadanie(int priorytet, String opis) {
        this.priorytet = priorytet;
        this.opis = opis;
    }

    public String toString() {
        return priorytet + " : " + opis;
    }

    // METODY DOSTĘPOWE
    public int getPriorytet() {
        return priorytet;
    }

    public String getOpis() {
        return opis;
    }

    public void setPriorytet(int priorytet) {
        this.priorytet = priorytet;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
