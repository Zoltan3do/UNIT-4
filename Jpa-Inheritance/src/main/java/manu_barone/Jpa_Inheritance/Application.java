package manu_barone.Jpa_Inheritance;

import java.time.LocalDate;

import dao.GenericDAO;
import entities.Evento;
import entities.Partecipazione;
import entities.Persona;
import entities.Stato;
import entities.TipoEvento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
	
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("eventi");

    public static void main(String[] args) {
    	
    	EntityManager em =  emf.createEntityManager();
    	GenericDAO dao = new GenericDAO(em);
    	
    	Persona persona1 = new Persona("Luca", "Rossi", "luca.rossi@example.com", LocalDate.of(1990, 5, 10), 'M', null);
    	Persona persona2 = new Persona("Maria", "Bianchi", "maria.bianchi@example.com", LocalDate.of(1985, 3, 15), 'F', null);
    	Persona persona3 = new Persona("Giovanni", "Verdi", "giovanni.verdi@example.com", LocalDate.of(2000, 8, 21), 'M', null);
    	Persona persona4 = new Persona("Chiara", "Neri", "chiara.neri@example.com", LocalDate.of(1995, 12, 30), 'F', null);
    	Persona persona5 = new Persona("Alessandro", "Gialli", "alessandro.gialli@example.com", LocalDate.of(1992, 7, 25), 'M', null);
    	Persona persona6 = new Persona("Sara", "Blu", "sara.blu@example.com", LocalDate.of(1988, 4, 5), 'F', null);
    	Persona persona7 = new Persona("Matteo", "Viola", "matteo.viola@example.com", LocalDate.of(2001, 9, 11), 'M', null);
    	Persona persona8 = new Persona("Francesca", "Marrone", "francesca.marrone@example.com", LocalDate.of(1980, 11, 20), 'F', null);
    	Persona persona9 = new Persona("Paolo", "Rosa", "paolo.rosa@example.com", LocalDate.of(1993, 6, 18), 'M', null);
    	Persona persona10 = new Persona("Laura", "Grigio", "laura.grigio@example.com", LocalDate.of(1997, 10, 2), 'F', null);
    	
    	dao.save(persona1);
    	dao.save(persona2);
    	dao.save(persona3);
    	dao.save(persona4);
    	dao.save(persona5);
    	dao.save(persona6);
    	dao.save(persona7);
    	dao.save(persona8);
    	dao.save(persona9);
    	dao.save(persona10);
    	
    	
    	Partecipazione partecipazione1 = new Partecipazione(1, persona1, evento1, Stato.CONFERMATA);
    	Partecipazione partecipazione2 = new Partecipazione(2, persona2, evento2, Stato.CONFERMATA);
    	Partecipazione partecipazione3 = new Partecipazione(3, persona3, evento3, Stato.DA_CONFERMARE);
    	Partecipazione partecipazione4 = new Partecipazione(4, persona4, evento4, Stato.CONFERMATA);
    	Partecipazione partecipazione5 = new Partecipazione(5, persona5, evento5, Stato.CONFERMATA);
    	Partecipazione partecipazione6 = new Partecipazione(6, persona6, evento6, Stato.DA_CONFERMARE);
    	Partecipazione partecipazione7 = new Partecipazione(7, persona7, evento7, Stato.CONFERMATA);
    	Partecipazione partecipazione8 = new Partecipazione(8, persona8, evento8, Stato.CONFERMATA);
    	Partecipazione partecipazione9 = new Partecipazione(9, persona9, evento9, Stato.DA_CONFERMARE);
    	Partecipazione partecipazione10 = new Partecipazione(10, persona10, evento10, Stato.CONFERMATA);

    }
}
