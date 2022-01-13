import java.math.BigInteger;

public class Lab4_4 {
    public static void main(String[] args) {
        // ZAD 4
        int n = Integer.parseInt(args[0]);
        BigInteger liczba = new BigInteger("0");
        BigInteger cnt = new BigInteger("0");

        if (n > 0) {
            liczba = new BigInteger("1");
            for (int i = 0; i < (n * n); i++) {
                cnt = cnt.add(liczba);
                liczba = liczba.multiply(new BigInteger("2"));
            }
        }

        System.out.println("Wynik = " + cnt);
    }
}
