import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;


public class Lab9_3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File(args[0]));
        ArrayList<String> tekst = new ArrayList<>();

        while (file.hasNextLine()) {
            String line = file.nextLine();
            tekst.add(line);
        }

        for (String linia : tekst)
            System.out.println(linia);


        tekst.sort(Comparator.naturalOrder());
        System.out.println();
        System.out.println("Po sortowaniu:");

        for (String linia : tekst)
            System.out.println(linia);
    }
}
