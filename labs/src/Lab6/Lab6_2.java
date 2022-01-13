public class Lab6_2 {
    public static void main(String[] args) {
        // ZAD 2
        IntegerSet a = new IntegerSet();
        IntegerSet b = new IntegerSet();
        a.insertElement(1);
        a.insertElement(3);
        b.insertElement(1);
        b.insertElement(3);

        System.out.println("Pierwszy zbiór: " + a.toString());
        System.out.println("Drugi zbiór: " + b.toString());

        System.out.println("Metoda equals (równe): " + a.equals(b));
        b.deleteElement(3);
        System.out.println("Metoda equals (nierówne): " + a.equals(b));

        System.out.println("Metoda union: " + IntegerSet.union(a,b).toString());
        System.out.println("Metoda intersection: " + IntegerSet.intersection(a,b).toString());
    }
}

class IntegerSet {
    public boolean set[] = new boolean[100];

    public IntegerSet() {
        for (int i = 0; i < 100; i++)
            set[i] = false;
    }

    public static IntegerSet union(IntegerSet a, IntegerSet b) {
        IntegerSet union = new IntegerSet();

        for (int i = 0; i < 100; i++) {
            if (a.set[i] == false && b.set[i] == false)
                union.set[i] = false;
            else
                union.set[i] = true;
        }

        return union;
    }

    public static IntegerSet intersection(IntegerSet a, IntegerSet b) {
        IntegerSet intersection = new IntegerSet();

        for (int i = 0; i < 100; i++) {
            if (a.set[i] == true && b.set[i] == true)
                intersection.set[i] = true;
            else
                intersection.set[i] = false;
        }

        return intersection;
    }

    public void insertElement(int element) {
        set[element - 1] = true;
    }

    public void deleteElement(int element) {
        set[element - 1] = false;
    }

    public String toString() {
        String print = "";

        for (int i = 0; i < 100; i++) {
            if (set[i])
                print += set[i] + " ";
        }

        return print;
    }

    public boolean equals(IntegerSet check) {
        for (int i = 0; i < 100; i++)
            if (set[i] != check.set[i]) {
                return false;
            }

        return true;
    }
}
