package pl.imiajd.hryciuk;
import java.time.*;

public class Flet extends Instrument {
    public Flet(String producent, LocalDate rokProdukcji) {
        super(producent, rokProdukcji);
    }

    public String dzwiek() {
        return "Flet";
    }
}
