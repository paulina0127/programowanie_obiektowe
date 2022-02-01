package Z1;

public class ArrayUtil {
    public static <T extends Comparable<? super T>> boolean jestPalindromem(T tab[]) {
        for (int i = 0; i < tab.length/2; i++)
            if (tab[i].compareTo(tab[tab.length - 1 - i]) != 0)
                return false;
        return true;
    }
}
