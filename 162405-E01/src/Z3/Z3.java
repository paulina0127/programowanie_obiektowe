package Z3;
import java.io.File;
import java.util.*;

public class Z3 {
    public static void main(String[] args) {
        File files[] = new File("E:/").listFiles();

        // nieposortowane
        for (File e : files)
            System.out.print(e.getName() + ", ");
        System.out.println();

        // posortowane
        sort(files);
        for (File e : files)
            System.out.print(e.getName() + ", ");
    }

    public static void sort(File files[]) {
        Comparator<File> comparator = (x, y) -> {
            if (x.isDirectory() && y.isFile())
                return 1;
            else if (x.isFile() && y.isDirectory())
                return -1;
            else
                return x.getName().compareTo(y.getName());
        };
        Arrays.sort(files, comparator);
    }
}
