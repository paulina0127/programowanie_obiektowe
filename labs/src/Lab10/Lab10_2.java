public class Lab10_2 {
    public static void main(String[] args) {
        // ZAD 2
        String[] words = { "Ala", "ma", "psa", "i", "kota" };
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("First = " + mm.getFirst());
        System.out.println("Second = " + mm.getSecond());

        System.out.println();
        System.out.println("Po zmianie:");
        System.out.println("First = " + PairUtil.swap(mm).getFirst());
        System.out.println("Second = " + PairUtil.swap(mm).getSecond());
    }
}
