package pl.imiajd.hryciuk;
import java.time.*;

public class Skrzypce extends Instrument {
    public Skrzypce(String producent, LocalDate rokProdukcji) {
        super(producent, rokProdukcji);
    }
    public String dzwiek() {
        return "Skrzypce";
    }
}
