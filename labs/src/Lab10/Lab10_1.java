public class Lab10_1 {
    public static void main(String[] args) {
        // ZAD 1
        String[] words = { "Ala", "ma", "psa", "i", "kota" };
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("First = " + mm.getFirst());
        System.out.println("Second = " + mm.getSecond());

        mm.swap();
        System.out.println();
        System.out.println("Po zmianie:");
        System.out.println("First = " + mm.getFirst());
        System.out.println("Second = " + mm.getSecond());
    }
}

class ArrayAlg {
    public static Pair<String> minmax(String[] a) {
        if (a == null || a.length == 0)
            return null;

        String min = a[0];
        String max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0)
                min = a[i];

            if (max.compareTo(a[i]) < 0)
                max = a[i];
        }

        return new Pair<String> (min, max);
    }
}
