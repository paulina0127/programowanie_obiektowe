public class ArrayUtil {
    public static <T extends Comparable<? super T>> boolean isSorted(T tab[]) {
        T prev = tab[0];
        int n = tab.length;

        for (int i = 1; i < n; i++) {
            T cur = tab[i];
            if (prev.compareTo(cur) > 0)
                return false;
            prev = cur;
        }
        return true;
    }

    public static <T extends Comparable<? super T>> int binSearch(T tab[], T x) {
        // ALGORYTM WYSZUKIWANIA BINARNEGO
        int left = 0;
        int right = tab.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;

            if (tab[mid].compareTo(x) == 0)
                return mid;

            if(tab[mid].compareTo(x) > 0)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return -1;
    }

    public static <T extends Comparable<? super T>> void selectionSort(T tab[]) {
        // ALGORYTM SORTOWANIA PRZEZ WYBIERANIE
        for (int i = 0; i < tab.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < tab.length; j++)
                if (tab[j].compareTo(tab[min]) < 0)
                    min = j;

            T temp = tab[min];
            tab[min] = tab[i];
            tab[i] = temp;
        }
    }

    public static <T extends Comparable<? super T>> void mergeSort(T tab[]) {
        // ALGORYTM SORTOWANIA PRZEZ SCALANIE
        if (tab.length < 2)
            return;

        int mid = tab.length / 2;
        T tabL[] = (T[]) new Comparable[mid];
        T tabR[] = (T[]) new Comparable[tab.length - mid];

        for (int i = 0; i < mid; i++)
            tabL[i] = tab[i];

        for (int i = mid; i < tab.length; i++)
            tabR[i - mid] = tab[i];

        mergeSort(tabL);
        mergeSort(tabR);

        merge(tab, tabL, tabR);
    }

    public static <T extends Comparable<? super T>> void merge(T tab[], T tabL[], T tabR[]) {
        int left = tab.length / 2;
        int right = tab.length - left;
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (tabL[i].compareTo(tabR[j]) <= 0)
                tab[k++] = tabL[i++];
            else
                tab[k++] = tabR[j++];
        }

        while (i < left)
            tab[k++] = tabL[i++];

        while (j < right)
            tab[k++] = tabR[j++];
    }
}
