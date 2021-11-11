import java.util.Scanner;
import java.util.Arrays;

public class Lab4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // ZAD 1 a)
        System.out.println("Podaj napis.");
        String napis = scan.nextLine();
        System.out.println("Podaj literę.");
        char n = scan.next().charAt(0);
        System.out.println("Wynik = " + countChar(napis, n));

        // ZAD 1 b)
        System.out.println("Podaj pierwszy napis.");
        String napis1 = scan.nextLine();
        System.out.println("Podaj drugi napis.");
        String napis2 = scan.nextLine();
        System.out.println("Wynik = " + countSubStr(napis1, napis2));

        // ZAD 1 c)
        System.out.println("Podaj napis.");
        String napis3 = scan.nextLine();
        System.out.println("Wynik = " + middle(napis3));

        // ZAD 1 d)
        System.out.println("Podaj napis.");
        String napis4 = scan.nextLine();
        System.out.println("Podaj liczbę powtórzeń.");
        int m = scan.nextInt();
        System.out.println("Wynik = " + repeat(napis4, m));

        // ZAD 1 e)
        System.out.println("Podaj pierwszy napis.");
        String napis5 = scan.nextLine();
        System.out.println("Podaj drugi napis.");
        String napis6 = scan.nextLine();
        int tab[] = where(napis5, napis6);
        System.out.println("Wynik = " + Arrays.toString(tab));

        // ZAD 1 f)
        System.out.println("Podaj napis.");
        String napis7 = scan.nextLine();
        System.out.println("Przed zmianą: " + napis7);
        System.out.println("Po zmianie: " + change(napis7));

        // ZAD 1 g)
        System.out.println("Podaj napis.");
        String napis8 = scan.nextLine();
        System.out.println("Wynik = " + nice(napis8));

        // ZAD 1 h)
        System.out.println("Podaj napis.");
        String napis9 = scan.nextLine();
        System.out.println("Wynik = " + nice2(napis8, '-', 4));
    }

    public static int countChar(String str, char c) {
        int cnt = 0;

        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == c)
                cnt++;

        return cnt;
    }

    public static int countSubStr(String str, String subStr) {
        int cnt = 0;
        int index = 0;

        while ((index = str.indexOf(subStr, index)) != -1) {
            cnt++;
            index += subStr.length();
        }

        return cnt;
    }

    public static String middle(String str) {
        int dl = str.length();

        if (dl % 2 == 0)
            return str.substring((dl / 2) - 1, dl / 2 + 1);
        else
            return str.substring((dl - 1) / 2, ((dl - 1) / 2) + 1);
    }

    public static String repeat(String str, int n) {
        String napis = "";

        for (int i = 0; i < n; i++)
            napis += str;

        return napis;
    }

    public static int[] where(String str, String subStr) {
        int cnt = 0;
        int index = 0;
        int i = 0;

        while ((index = str.indexOf(subStr, index)) != -1) {
            cnt++;
            index += subStr.length();
        }

        int tab[] = new int[cnt];
        while ((index = str.indexOf(subStr, index)) != -1) {
            tab[i] = index;
            index += subStr.length();
            i++;
        }

        return tab;
    }

    public static String change(String str) {
        StringBuffer napis = new StringBuffer().append(str);

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(napis.charAt(i)) == true)
                napis.setCharAt(i, Character.toLowerCase(napis.charAt(i)));
            else if (Character.isLowerCase(napis.charAt(i)) == true)
                napis.setCharAt(i, Character.toUpperCase(napis.charAt(i)));
        }

        return napis.toString();
    }

    public static String nice(String str) {
        StringBuffer napis = new StringBuffer();
        int n = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (n == 3) {
                napis.append("'");
                n = 0;
            }
            napis.append(str.charAt(i));
            n++;
        }

        napis.reverse();
        return napis.toString();
    }

    public static String nice2(String str, char c, int p) {
        StringBuffer napis = new StringBuffer();
        int n = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (n == p) {
                napis.append(c);
                n = 0;
            }
            napis.append(str.charAt(i));
            n++;
        }

        napis.reverse();
        return napis.toString();
    }
}