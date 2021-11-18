public class Lab6_1 {
    public static void main(String[] args) {
        RachunekBankowy saver1 = new RachunekBankowy(2000.00);
        RachunekBankowy saver2 = new RachunekBankowy(3000.00);

        saver1.setRocznaStopaProcentowa(0.04);
        saver2.setRocznaStopaProcentowa(0.04);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println("Pierwszy rachunek (4%): " + saver1.wypisz());
        System.out.println("Drugi rachunek (4%): " + saver2.wypisz());

        saver1.setRocznaStopaProcentowa(0.05);
        saver2.setRocznaStopaProcentowa(0.05);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println("Pierwszy rachunek (5%): " + saver1.wypisz());
        System.out.println("Drugi rachunek (5%): " + saver2.wypisz());
    }
}

class RachunekBankowy {
    static double rocznaStopaProcentowa;
    private double saldo;

    public RachunekBankowy(double saldo) {
        saldo = saldo;
    }

    public void obliczMiesieczneOdsetki() {
        saldo += (saldo * rocznaStopaProcentowa) / 12;

    }

    public static void setRocznaStopaProcentowa(double rsp) {
        rocznaStopaProcentowa = rsp;
    }

    public double wypisz() {
        return saldo;
    }
}