import java.time.*;

public class Lab10_3 {
    public static void main(String[] args) {
        Integer tab1[] = {0, 1, 2, 3, 4, 5};
        Integer tab2[] = {9, 8, 2, 3, 1, 5};

        LocalDate tab3[] = {LocalDate.of(2000, 10, 2), LocalDate.of(2015, 12, 1)};
        LocalDate tab4[] = {LocalDate.of(2020, 10, 22), LocalDate.of(2015, 12, 1)};

        // ZAD 3
        System.out.println("isSorted():");
        System.out.println(ArrayUtil.isSorted(tab1));
        System.out.println(ArrayUtil.isSorted(tab2));
        System.out.println(ArrayUtil.isSorted(tab3));
        System.out.println(ArrayUtil.isSorted(tab4));

        // ZAD 4
        System.out.println("\nbinSearch():");
        System.out.println(ArrayUtil.binSearch(tab1, 4));
        System.out.println(ArrayUtil.binSearch(tab1, 9));
        System.out.println(ArrayUtil.binSearch(tab3, LocalDate.of(2000, 10, 2)));
        System.out.println(ArrayUtil.binSearch(tab3, LocalDate.of(2020, 10, 22)));

        // ZAD 5
        System.out.println("\nselectionSort():");
        printArray(tab2);
        ArrayUtil.selectionSort(tab2);
        printArray(tab2);

        printArray(tab4);
        ArrayUtil.selectionSort(tab4);
        printArray(tab4);

        // ZAD 6
        System.out.println("\nmergeSort():");
        printArray(tab2);
        ArrayUtil.mergeSort(tab2);
        printArray(tab2);

        printArray(tab4);
        ArrayUtil.mergeSort(tab4);
        printArray(tab4);
    }

    public static <T> void printArray(T tab[]) {
        for (T element : tab)
            System.out.print(element + " ");
        System.out.println();
    }
}

