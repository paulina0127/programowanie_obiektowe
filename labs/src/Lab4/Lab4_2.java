import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Lab4_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("E:/" + args[0] + ""));
        int cnt = 0;

        while (file.hasNextLine()) {
            String line = file.nextLine();
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == args[1].charAt(0))
                    cnt++;
            }
        }

        System.out.println("Wynik = " + cnt);
    }
}