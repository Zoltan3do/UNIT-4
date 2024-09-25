package mains;

import java.util.Scanner;

import entities.Chiamata;
import entities.Sim;

public class Main2 {

	public static void main(String[] args) {
		/*
		 * Scrivere un'applicazione che simula il funzionamento di un frammento del sistema informativo di un operatore di
		 * telefonia cellulare.
		 * 
		 * Si devono quindi rappresentare i dati relativi ad una carta SIM, ed in particolare:
		 * - il numero di telefono;
		 * - il credito disponibile in euro;
		 * - la lista delle ultime 5 chiamate effettuate;
		 * Per ciascuna Chiamata deve essere rappresentata la durata in minuti e il numero chiamato.
		 * 
		 * La classe SIM dovrà fornire le seguenti funzinalità:
		 * - un costruttore che crea una SIM con numero di telefono passato come parametro, credito a 0 e lista delle
		 * chiamata vuota;
		 * - una funzione per la stampa dei dati della SIM
		 * 
		 * Scrivere un main che crei una istanza di SIM e ne stampi i dati.
		 * 
		 */

		Scanner in = new Scanner(System.in);
		Sim sim1 = new Sim(3252345234f);
		boolean flag = false;
		String opzioniGenerali = "Premi 1) per visualizzare i dati della scheda\n"
				+ "Premi 2) per fare una chiamata\n"
				+ "Premi 3) per fare una ricarica\n"
				+ "Premi 4) per visualizzato il tabulato delle ultime 5 chiamate\n"
				+ "Premi 0) per uscire dal programma";
		do {
			System.out.println(opzioniGenerali);
			switch(Integer.parseInt(in.nextLine())) {
			case 1: System.out.println(sim1.toString());
			break;
			case 2: 
				int durata; 
				float destinatario;
				System.out.println("Quanti minuti dura la chiamata?");
				durata = Integer.parseInt(in.nextLine());
				System.out.println("Qual'è il numero che vuoi chiamare?");
				destinatario = Float.parseFloat(in.nextLine());
				sim1.addCall(new Chiamata(durata, destinatario));
				break;
			case 3:
				double cash;
				System.out.println("Di quanto vuoi ricaricare?");
				cash = Double.parseDouble(in.nextLine());
				sim1.ricarica(cash);
				break;
			case 4:
				System.out.println(sim1.tabulato());
			case 0:
				flag=true;
				break;
			default:System.out.println("Opzione non valida");
			}
		}while(!flag);
		in.close();
		
	}

}
