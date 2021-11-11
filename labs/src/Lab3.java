import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Lab3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("Podaj dodatnią liczbę n nie większą niż 100.");
        int n = scan.nextInt();
        while (n < 0 || n > 100) {
            System.out.println("Podaj poprawną liczbę.");
            n = scan.nextInt();
        }

        int tab[] = new int[n];
        generuj(tab,n,-999, 999);
        System.out.println("Tablica: " + Arrays.toString(tab));
        System.out.println("Liczby nieparzyste = " + ileNieparzystych(tab));
        System.out.println("Liczby parzyste = " + ileParzystych(tab));
        System.out.println("Liczby dodatnie = " + ileDodatnich(tab));
        System.out.println("Liczby ujemne = " + ileUjemnych(tab));
        System.out.println("Liczby zerowe = " + ileZerowych(tab));
        int tab2[] = {5,3,-2,3,5,6,2,-5,3,4,5};
        System.out.println("Liczby maksymalne = " + ileMaksymalnych(tab));
        System.out.println("Suma liczb dodatnich = " + sumaDodatnich(tab));
        System.out.println("Suma liczb ujemnych = " + sumaUjemnych(tab));
        System.out.println("Dlugość maksymalnego ciągu liczb dodatnich = " + dlugoscMaksymalnegoCiaguDodatnich(tab2));
        signum(tab);
        System.out.println("Signum = " + Arrays.toString(tab));
        odwrocFragment(tab,1,2);
        System.out.println("Odwrócone = " + Arrays.toString(tab));
        */

        System.out.println("Podaj 3 liczby z przediału [1;10]");
        int m = scan.nextInt();
        int n = scan.nextInt();
        int k = scan.nextInt();

        int a[][] = new int[m][n];
        generuj2(a,m,n);
        int b[][] = new int[n][k];
        generuj2(b,n,k);

        System.out.println("Tablica A");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + " ");
            System.out.print("\n");
        }
        System.out.print("\n");

        System.out.println("Tablica B");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++)
                System.out.print(b[i][j] + " ");
            System.out.print("\n");
        }
        System.out.print("\n");

        int c[][] = new int[m][k];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                for (int l = 0; l < n; l++)
                    c[i][j] += a[i][l] * b[l][j];
            }
        }

        System.out.println("Tablica C");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++)
                System.out.print(c[i][j] + " ");
            System.out.print("\n");
        }
    }

    public static void generuj(int tab[], int n, int minWartosc, int maxWartosc) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            tab[i] = rand.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
        }
    }

    public static int ileNieparzystych(int tab[]) {
        int ile = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] %2 != 0)
                ile++;
        }
        return ile;
    }

    public static int ileParzystych(int tab[]) {
        int ile = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] %2 == 0)
                ile++;
        }
        return ile;
    }

    public static int ileDodatnich(int tab[]) {
        int ile = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0)
                ile++;
        }
        return ile;
    }

    public static int ileUjemnych(int tab[]) {
        int ile = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0)
                ile++;
        }
        return ile;
    }

    public static int ileZerowych(int tab[]) {
        int ile = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 0)
                ile++;
        }
        return ile;
    }

    public static int ileMaksymalnych(int tab[]) {
        int ile = 0;
        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == max)
                ile++;
            if (tab[i] > max)
                max = tab[i];
        }
        return ile;
    }

    public static int sumaDodatnich(int tab[]) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0)
                suma += tab[i];
        }
        return suma;
    }

    public static int sumaUjemnych(int tab[]) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0)
                suma += tab[i];
        }
        return suma;
    }

    public static int dlugoscMaksymalnegoCiaguDodatnich(int tab[]) {
        int max = 0;
        int temp = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0)
                max += 1;
            else {
                if (temp < max)
                    temp = max;
                max = 0;
            }
        }
        return temp;
    }

    public static void signum(int tab[]) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] >= 0)
                tab[i] = 1;
            else
                tab[i] = -1;
        }
    }

    public static void odwrocFragment(int tab[], int lewy, int prawy) {
        int l = 0;
        int r = 0;
        for (int i = 0; i < tab.length; i++) {
            if (i == lewy)
                l = tab[i];
            if (i == prawy)
                r = tab[i];
        }
        tab[lewy] = r;
        tab[prawy] = l;
    }

    public static void generuj2(int tab[][], int n, int m) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                tab[i][j] = rand.nextInt(10);
        }
    }
}