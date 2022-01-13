import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lab5 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 4, 9, 16));
        ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(9, 7, 4, 9, 11));
        // ZAD 1
        //System.out.println(append(a,b));
        
        // ZAD 2
        //System.out.println(merge(a,b));
        
        // ZAD 3
        //System.out.println(mergeSorted(a,b));
        
        // ZAD 4
        //System.out.println(reversed(a));
        
        // ZAD 5
        reverse(a);
        System.out.println(a);
    }

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> lista = a;

        for (int i = 0; i < b.size(); i++)
            lista.add(b.get(i));

        return lista;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        ArrayList<Integer> s;
        ArrayList<Integer> x;
        int i = 0;

        if (a.size() > b.size()) {
            s = b;
            x = a;
        }
        else {
            s = a;
            x = b;
        }

        for (i = 0; i < s.size(); i++) {
            lista.add(a.get(i));
            lista.add(b.get(i));
        }

        lista.addAll(x.subList(i, x.size()));
        return lista;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> lista = append(a,b);
        Collections.sort(lista);

        return lista;
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> a) {
        ArrayList<Integer> lista = new ArrayList<Integer>();

        for (int i = a.size() - 1; i >= 0; i--)
            lista.add(a.get(i));

        return lista;
    }

    public static void reverse(ArrayList<Integer> a) {
        int temp;
        int j = a.size() - 1;

        for (int i = 0; i < a.size()/2; i++) {
            temp = a.get(i);
            a.set(i, a.get(j));
            a.set(j, temp);
            j--;
        }
    }
}
