package Vincenzo;


import Vincenzo.dao.CatalogoBibliotecarioDAO;
import Vincenzo.dao.RentDAO;
import Vincenzo.dao.UtenteDAO;
import Vincenzo.entities.*;
import com.github.javafaker.Faker;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("U4-W3-D5");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();
        CatalogoBibliotecarioDAO cbd = new CatalogoBibliotecarioDAO(em);
        UtenteDAO us = new UtenteDAO(em);
        RentDAO rs = new RentDAO(em);



        Utente user1 = new Utente("Remo","Labarca", LocalDate.of(1995,2,8),489454);
        us.save(user1);

        Utente user2 = new Utente("Guido","Lavespa", LocalDate.of(1998,2,9),489454);
        us.save(user2);
        Libro book1 = new Libro("Harry Potter e la pietra filosofale ",1990,300,"Rowling", GENERE.FANTASY);
        cbd.save(book1);

        Libro book2 = new Libro("Il Signore degli anelli",1990,200,"Tolkien", GENERE.FANTASY);
        cbd.save(book2);



        Rent rent1= new Rent(user1,book2);
        rs.save(rent1);
        Rent rent2 = new Rent(user1, book1);
        rs.save(rent2);



        cbd.rimuoviElementoPerISBN(38);

        System.out.printf("Cerca per anno di pubblicazione: ");

        cbd.cercaPerAnnoPubblicazione(1990).forEach(System.out::println);

        System.out.printf("Cerca per autore: ");

        cbd.cercaPerAutore("Rowling").forEach(System.out::println);

        System.out.println("Cerca per id e cancella: ");
        rs.findByIdAndDelete(5);


        em.close();
        emf.close();
    }
}
