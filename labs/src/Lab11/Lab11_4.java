import java.util.Scanner;
import java.util.ArrayList;

public class Lab11_4 {
    public static void main(String[] args) {
        // ZAD 7
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę.");
        int n = scan.nextInt();

        ArrayList<Integer> pierwsze = new ArrayList<>();
        pierwsze.add(2);

        for (int i = 1; i < n - 1; i++)
            pierwsze.add(pierwsze.get(i - 1) + 1);

        for (int i = 2; i < Math.sqrt(n); i++) {
            for (int j = i + i; j <= n; j += i) {
                if (pierwsze.indexOf(j) != -1)
                    pierwsze.remove(pierwsze.indexOf(j));
            }
        }

        System.out.println(pierwsze.toString());
    }
}