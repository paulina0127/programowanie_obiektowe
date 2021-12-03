package pl.imiajd.hryciuk;
import java.time.*;

abstract public class Instrument {
    private String producent;
    private LocalDate rokProdukcji;

    // KONSTRUKTOR
    public Instrument(String producent, LocalDate rokProdukcji) {
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }

    public abstract String dzwiek();

    public String toString() {
        return "Producent: " + producent + ", rok produkcji: " + rokProdukcji;
    }

    public boolean equals(Instrument instrument) {
        if (this.producent == instrument.producent && this.rokProdukcji == instrument.rokProdukcji)
            return true;
        return false;
    }

    // METODY DOSTĘPOWE
    public String getProducent() {
        return producent;
    }

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }
}
