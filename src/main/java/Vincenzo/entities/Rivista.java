package Vincenzo.entities;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Rivista extends CatalogoBibliotecario{
    private PERIODICITA periodicita;


    public Rivista(){}
    public Rivista(java.lang.String titolo, LocalDate annoDiPubblicazione, int numeroDiPagine, PERIODICITA periodicita) {
        super(titolo, annoDiPubblicazione, numeroDiPagine);
        this.periodicita = periodicita;
    }

    public PERIODICITA getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(PERIODICITA periodicita) {
        this.periodicita = periodicita;
    }

    @Override
    public java.lang.String toString() {
        return "Rivista{" +
                "periodicita=" + periodicita +
                '}';
    }
}
