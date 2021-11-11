import java.util.Scanner;
import java.util.Objects;
import java.io.File;
import java.io.FileNotFoundException;

public class Lab4_3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("E:/" + args[0] + ""));
        int cnt = 0;

        while (file.hasNextLine()) {
            String line = file.nextLine();
            for(int i = 0; i < line.length() - args[1].length() + 1; i++) {
                if (Objects.equals(line.substring(i, i + args[1].length()), args[1]))
                    cnt++;
            }
        }

        System.out.println("Wynik = " + cnt);
    }
}
