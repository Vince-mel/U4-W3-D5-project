package Vincenzo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.rmi.server.UID;
import java.time.LocalDate;

@Entity
public abstract class CatalogoBibliotecario {
    @Id
    @GeneratedValue
    private UID uid;
    private String titolo;
    private LocalDate annoDiPubblicazione;
    private int numeroDiPagine;

    public CatalogoBibliotecario(){}
    public CatalogoBibliotecario(java.lang.String titolo, LocalDate annoDiPubblicazione, int numeroDiPagine) {
        this.titolo = titolo;
        this.annoDiPubblicazione = annoDiPubblicazione;
        this.numeroDiPagine = numeroDiPagine;
    }

    public UID getString() {
        return uid;
    }

    public java.lang.String getTitolo() {
        return titolo;
    }

    public LocalDate getAnnoDiPubblicazione() {
        return annoDiPubblicazione;
    }

    public int getNumeroDiPagine() {
        return numeroDiPagine;
    }

    public void setTitolo(java.lang.String titolo) {
        this.titolo = titolo;
    }

    public void setAnnoDiPubblicazione(LocalDate annoDiPubblicazione) {
        this.annoDiPubblicazione = annoDiPubblicazione;
    }

    public void setNumeroDiPagine(int numeroDiPagine) {
        this.numeroDiPagine = numeroDiPagine;
    }

    @Override
    public java.lang.String toString() {
        return "CatalogoBibliotecario{" +
                "String=" + uid +
                ", titolo='" + titolo + '\'' +
                ", annoDiPubblicazione=" + annoDiPubblicazione +
                ", numeroDiPagine=" + numeroDiPagine +
                '}';
    }
}
