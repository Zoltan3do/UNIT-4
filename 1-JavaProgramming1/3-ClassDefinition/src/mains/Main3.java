package mains;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import entities.Articolo;
import entities.Carrello;
import entities.Cliente;

public class Main3 {

	public static void main(String[] args) {
		/*
		 * Scrivere un'applicazione che simula il funzionamento di un e-commerce.
		 * Si devono quindi rappresentare i dati relativi i seguenti elementi:
		 * 
		 * Articolo
		 * - codice articolo
		 * - descrizione articolo
		 * - prezzo
		 * - numeri pezzi disponibili a magazzino
		 * 
		 * Cliente
		 * - codice cliente
		 * - nome e cognome
		 * - email
		 * - data iscrizione
		 * 
		 * Carrello
		 * - Cliente associato
		 * - elenco articoli (Articolo[])
		 * - totale costo articoli
		 * 
		 */

		Scanner in = new Scanner(System.in);
		boolean flag = false;

		Map<String, Articolo> articoli = new HashMap<String, Articolo>();
		articoli.put("Microfono", new Articolo(4234523f, "Serve a farti sentire", 50.5, 3));



		String nome, cognome, email;

		System.out.println("Come ti chiami?");
		nome = in.nextLine();
		System.out.println("Cognome?");
		cognome = in.nextLine();
		System.out.println("Email?");
		email = in.nextLine();
		Cliente cliente = new Cliente(1000000 + new Random().nextInt(9000000),
				nome, cognome, email, LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Iscrizione completata!");
		int n;
		Articolo a;
		Carrello c = new Carrello(cliente.getClienteAssociato(), articoli);

		do {
			System.out.println("1)aggiungi qualcosa al carrelllo\n"
					+ "2)rimuovi qualcosa da carrello\n"
					+ "3)Visualizza carrello\n"
					+ "0)esci dal programma");
			switch(Integer.parseInt(in.nextLine())) {
			case 1:
				String ris;
				System.out.println("Cosa vuoi aggiungere al carrello?\n");

				for(String k : articoli.keySet()) 
					System.out.println(k);

				ris = in.nextLine();

				if(articoli.keySet().contains(ris)) {
					a = articoli.get(ris);
					System.out.println("Quanti pezzi vuoi acquistare?");
					n = Integer.parseInt(in.nextLine());
					if(a.getnPezzi() >= n) {
						System.out.println("Aggiunto con successo");
					}else {
						System.out.println("Non abbiamo questa disponibilità al momento");
						n=0;
						break;
					}
				}else {
					System.out.println("Articolo inesistente!"); break;
				}
				break;

			case 2:
				String art;
				float code = 0;
				System.out.println("Quale articolo vuoi rimuovere?");
				art = in.nextLine();
				for(String k : articoli.keySet()) {
					System.out.println(k);
					code = articoli.get(k).getCodice();
					c.removeArticle(articoli.get(k).getCodice());
				}
				break;

			case 3: 
				System.out.println(c.getElencoArticoli());
				break;

			case 0:
				System.out.println("Arrivederci!"); 
				flag = true;
				break;
			default:System.out.println("Questa opzione non è disponibile");
			}

		}while(!flag);


		in.close();

	}

}
