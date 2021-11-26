package pl.imiajd.hryciuk;

public class Adres {
    private String ulica;
    private int numer_domu;
    private int numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;

    public Adres(String ulica, int numer_domu, int numer_mieszkania, String miasto, String kod_pocztowy) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public Adres(String ulica, int numer_domu, String miasto, String kod_pocztowy) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public void pokaz() {
        String print = kod_pocztowy + " " + miasto + "\nul. " + ulica + " " + numer_domu;
        if (numer_mieszkania != 0)
            print += "\\" + numer_mieszkania;

        System.out.println(print);
    }

    public boolean przed(Adres adres) {
        int a = Integer.parseInt(this.kod_pocztowy.substring(0,1) + this.kod_pocztowy.substring(3,5));
        int b = Integer.parseInt(adres.kod_pocztowy.substring(0,1) + adres.kod_pocztowy.substring(3,5));

        if (a > b)
            return true;
        return false;
    }
}
