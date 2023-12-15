package Vincenzo.entities;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Libro extends CatalogoBibliotecario{
    private String autore;
    private GENERE genere;

    public Libro(){}
    public Libro(java.lang.String titolo, LocalDate annoDiPubblicazione,
                 int numeroDiPagine, java.lang.String autore,
                 GENERE genere) {
        super(titolo, annoDiPubblicazione, numeroDiPagine);
        this.autore = autore;
        this.genere = genere;
    }

    public java.lang.String getAutore() {
        return autore;
    }

    public GENERE getGenere() {
        return genere;
    }

    public void setAutore(java.lang.String autore) {
        this.autore = autore;
    }

    public void setGenere(GENERE genere) {
        this.genere = genere;
    }

    @Override
    public java.lang.String toString() {
        return "Libro{" +
                "autore='" + autore + '\'' +
                ", genere=" + genere +
                '}';
    }
}
