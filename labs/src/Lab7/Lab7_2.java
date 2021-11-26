import pl.imiajd.hryciuk.*;

public class Lab7_2 {
    public static void main(String[] args) {
        Adres adres1 = new Adres("Kwiatowa", 45, 9, "Warszawa", "56-112");
        Adres adres2 = new Adres("Warszawska", 60, "Olsztyn", "65-002");

        adres1.pokaz();
        System.out.println();
        adres2.pokaz();

        System.out.println(adres2.przed(adres1));
    }
}
