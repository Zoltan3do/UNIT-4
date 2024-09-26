package mains;

import customExceptions.ParametroErratoException;
import entities.DipendenteFullTime;
import entities.DipendentePartTime;
import entities.Dirigente;
import entities.Volontario;
import interfaces.ChekkiamoTutto;

public class Main3 {

	public static void main(String[] args) throws ParametroErratoException {
		/*
		 * Esercizio #3
		 * Estendere il punto 2 aggiungendo la classe Volontario con le seguenti caratteristiche:
		 * - nome
		 * - età
		 * - CV
		 * 
		 * Definire un'interfaccia con un metodo checkIn() comune a Dipendente e Volontario che indica quando un
		 * dipendente inizia il suo turno di lavoro o quando un volontario inizia il suo servizio (basta un print in console)
		 * 
		 * Nel main creare un array con dipendenti e volontari e chiamare il metodo checkIn per ognuno di essi.
		 * 
		 * */
		
		ChekkiamoTutto dft = new DipendenteFullTime("iubdsgd", 543.0, "amministrazione");
		ChekkiamoTutto dpt = new DipendentePartTime("iubdsgsdgdd", 543234, "vendita", 5);
		ChekkiamoTutto dd = new Dirigente("iubdssdgtsdgfdgdgd", 542353, "produzione");
		ChekkiamoTutto vo = new Volontario("Gianfranco", 67, "Padre di Federico II me!");
		ChekkiamoTutto[] lavoratori = {dft, dpt, dd, vo};
		
		for(ChekkiamoTutto p: lavoratori )
			p.checkIn("5:00");

	}

}
