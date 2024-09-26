package mains;

import customExceptions.ParametroErratoException;
import entities.Dipendente;
import entities.DipendenteFullTime;
import entities.DipendentePartTime;
import entities.Dirigente;

public class Main2 {

	public static void main(String[] args) throws ParametroErratoException {
		
		/**
		 * Estendere il punto 1 aggiungendo 3 ulteriori classi:
		 * - DipendenteFullTime
		 * - DipendentePartTime
		 * - Dirigente
		 * 
		 * La classe Dipendente deve diventare astratta e le 3 classi di sopra devono ereditare da essa.
		 * Ogni classe concreta deve implementare il metodo calculateSalary() in modo appropriato per il 
		 * tipo di dipendente
		 * specifico. Ad esempio, il salario di un dipendente a tempo pieno potrebbe essere calcolato 
		 * come uno stipendio
		 * mensile fisso, mentre il salario di un dipendente part-time potrebbe essere calcolato in 
		 * base alle ore lavorate.
		 * 
		 * Nel main, crea diverse istanze di dipendente (ad esempio, dipendenti a tempo pieno,
		 *  dipendendi part time e dirigenti)
		 *  mettendoli in un unico array e calcola i loro stipendi totali. Utilizza il polimorfismo
		 *   per trattare tutti i dipendenti
		 *  in modo uniforme.
		 * 
		 */
		
		Dipendente dft = new DipendenteFullTime("iubdsgd", 543.0, "amministrazione");
		Dipendente dpt = new DipendentePartTime("iubdsgsdgdd", 543234, "vendita", 5);
		Dipendente dd = new Dirigente("iubdssdgtsdgfdgdgd", 542353, "produzione");
		Dipendente[] dipendenti = {dft, dpt, dd};
		
		double stip = 0;
		for(Dipendente d: dipendenti) 
			stip += d.getStipendio();
		System.out.println(stip + " € ");

		
	}

}
