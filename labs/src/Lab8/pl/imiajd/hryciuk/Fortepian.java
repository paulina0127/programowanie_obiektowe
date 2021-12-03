package pl.imiajd.hryciuk;
import java.time.*;

public class Fortepian extends Instrument {
    public Fortepian(String producent, LocalDate rokProdukcji) {
        super(producent, rokProdukcji);
    }

    public String dzwiek() {
        return "Fortepian";
    }
}
