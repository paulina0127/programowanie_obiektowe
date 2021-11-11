import java.math.BigDecimal;
import java.math.RoundingMode;

public class Lab4_5 {
    public static void main(String[] args) {
        BigDecimal K = new BigDecimal("0");
        BigDecimal k = new BigDecimal(args[0]);
        BigDecimal p = new BigDecimal(args[1]);
        int n = Integer.parseInt(args[2]);

        p = p.divide(new BigDecimal("100"));
        K = k.multiply((p.add(new BigDecimal("1")).pow(n)));
        K = K.setScale(2, RoundingMode.HALF_UP);

        System.out.println("Wynik = " + K);
    }
}
