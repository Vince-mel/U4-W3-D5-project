package Vincenzo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Rent {
    @Id
    @GeneratedValue
    private Long id;
    private Utente utente;
    private LocalDate dataInizioPrestito = LocalDate.now();
    private LocalDate dataRestituzionePrevista;

    private LocalDate dataRestituzioneEffettiva;

    public Rent() {
    }

    public Rent(Utente utente) {
        this.utente = utente;
        this.dataRestituzionePrevista = this.dataInizioPrestito.plusDays(30);
    }

    public Long getId() {
        return id;
    }

    public Utente getUtente() {
        return utente;
    }

    public LocalDate getDataInizioPrestito() {
        return dataInizioPrestito;
    }

    public LocalDate getDataRestituzionePrevista() {
        return dataRestituzionePrevista;
    }

    public LocalDate getDataRestitutioneEffettiva() {
        return dataRestituzioneEffettiva;
    }

    public void setDataRestitutioneEffettiva(LocalDate dataRestitutioneEffettiva) {
        this.dataRestituzioneEffettiva = dataRestitutioneEffettiva;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "id=" + id +
                ", utente=" + utente +
                ", dataInizioPrestito=" + dataInizioPrestito +
                ", dataRestituzionePrevista=" + dataRestituzionePrevista +
                ", dataRestitutioneEffettiva=" + dataRestituzioneEffettiva +
                '}';
    }
}