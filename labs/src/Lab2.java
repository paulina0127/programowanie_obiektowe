import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* ZAD 1.1 a)
        System.out.println("Podaj liczbę n.");
        int n = scan.nextInt();
        int suma = 0;
        while (n != 0) {
            System.out.println("Podaj liczbę.");
            int x = scan.nextInt();
            suma += x;
            n--;
        }
        System.out.println("Suma = " + suma);
        */

        /* ZAD 1.1 b)
        System.out.println("Podaj liczbę n.");
        int n = scan.nextInt();
        int iloczyn = 1;
        while (n != 0) {
            System.out.println("Podaj liczbę.");
            int x = scan.nextInt();
            iloczyn *= x;
            n--;
        }
        System.out.println("Iloczyn = " + iloczyn);
        */

        /* ZAD 1.1 c)
        System.out.println("Podaj liczbę n.");
        int n = scan.nextInt();
        int suma = 0;
        while (n != 0) {
            System.out.println("Podaj liczbę.");
            int x = scan.nextInt();
            if (x < 0)
                x *= -1;
            suma += x;
            n--;
        }
        System.out.println("Suma = " + suma);
        */

        /* ZAD 1.1 d)
        System.out.println("Podaj liczbę n.");
        int n = scan.nextInt();
        double p;
        double suma = 0;
        while (n != 0) {
            System.out.println("Podaj liczbę.");
            int x = scan.nextInt();
            if (x < 0)
                x *= -1;
            p = Math.sqrt(x);
            suma += p;
            n--;
        }
        System.out.println("Suma = " + suma);
        */

        /* ZAD 1.1 e)
        System.out.println("Podaj liczbę n.");
        int n = scan.nextInt();
        int iloczyn = 1;
        while (n != 0) {
            System.out.println("Podaj liczbę.");
            int x = scan.nextInt();
            if (x < 0)
                x *= -1;
            iloczyn *= x;
            n--;
        }
        System.out.println("Iloczyn = " + iloczyn);
        */

        /* ZAD 1.1 f)
        System.out.println("Podaj liczbę n.");
        int n = scan.nextInt();
        int suma = 0;
        while (n != 0) {
            System.out.println("Podaj liczbę.");
            int x = scan.nextInt();
            suma += x*x;
            n--;
        }
        System.out.println("Suma = " + suma);
        */

        /* ZAD 1.1 g)
        System.out.println("Podaj liczbę n.");
        int n = scan.nextInt();
        int suma = 0;
        int iloczyn = 1;
        while (n != 0) {
            System.out.println("Podaj liczbę.");
            int x = scan.nextInt();
            suma += x;
            iloczyn *= x;
            n--;
        }
        System.out.println("Suma = " + suma + "\n" + "Ilozyn = " + iloczyn);
        */

        /* ZAD 1.1 h)
        System.out.println("Podaj liczbę n.");
        int n = scan.nextInt();
        int suma = 0;
        for(int i = 1; i < n+1; i++) {
            System.out.println("Podaj liczbę.");
            int x = scan.nextInt();
            x *= Math.pow(-1, i+1);
            suma += x;
            System.out.println(x);
        }
        System.out.println("Suma = " + suma);
        */

        /* ZAD 1.1 i)
        System.out.println("Podaj liczbę n.");
        int n = scan.nextInt();
        double suma = 0;
        int silnia = 1;
        for(int i = 1; i < n+1; i++) {
            System.out.println("Podaj liczbę.");
            double x = scan.nextInt();
            silnia *= i;
            x = (Math.pow(-1, i) * x) / silnia;
            suma += x;
            System.out.println(x);
        }
        System.out.println("Suma = " + suma);
        */

        /* ZAD 1.2
        System.out.println("Podaj liczbę n.");
        int n = scan.nextInt();
        int l = 0;
        for(int i = 1; i < n+1; i++) {
            System.out.println("Podaj liczbę.");
            int x = scan.nextInt();
            if (i == 1)
                l = x;
            else
                System.out.println(x);
        }
        System.out.println(l);
        */

        /* ZAD 2.2
        System.out.println("Podaj liczbę n.");
        int n = scan.nextInt();
        int suma= 0;
        for(int i = 1; i < n+1; i++) {
            System.out.println("Podaj liczbę.");
            int x = scan.nextInt();
            if (x > 0)
                x *= 2;
            suma += x;
        }
        System.out.println("Suma = " + suma);
        */

        /* ZAD 2.3
        System.out.println("Podaj liczbę n.");
        int n = scan.nextInt();
        int dodatnie = 0;
        int ujemne = 0;
        int zera = 0;
        for(int i = 1; i < n+1; i++) {
            System.out.println("Podaj liczbę.");
            int x = scan.nextInt();
            if (x == 0)
                zera += 1;
            else if (x > 0)
                dodatnie += 1;
            else
                ujemne += 1;
        }
        System.out.println("Dodatnie = " + dodatnie + "\n" +  "Ujemne = " + ujemne + "\n" + "Zera = " + zera);
        */

        /* ZAD 2.4
        System.out.println("Podaj liczbę n.");
        int n = scan.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < n+1; i++) {
            System.out.println("Podaj liczbę.");
            int x = scan.nextInt();
            if (x > max)
                max = x;
            if (x < min)
                min = x;
        }
        System.out.println("Najmniejsza liczba: " + min + "\n" + "Największa liczba: " + max);
        */

        /* ZAD 2.5
        System.out.println("Podaj liczbę n.");
        int n = scan.nextInt();
        int tab[] = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Podaj liczbę.");
            tab[i] = scan.nextInt();
        }
        for(int i = 0; i < n-1; i++) {
            if (tab[i] > 0 && tab[i+1] > 0)
                System.out.println("(" + tab[i] + "," + tab[i+1] + ")");
        }
        */
    }
}