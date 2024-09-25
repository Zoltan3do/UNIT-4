package mains;

import entities.Rettangolo;
import utils.Utils;

public class Main1 {

	public static void main(String[] args) {
		
		/*
		 * ESERCIZIO #1
		 * Creare una classe Rettangolo che permetta di rappresentare dei rettangoli. Per ogni rettangolo deve essere
		 * possibile specificare altezza e larghezza in fase di costruzione dell'istanza e devono essere realizzati i metodi per
		 * calcolare perimetro ed area.
		 * Realizzare un metodo stampaRettangolo che, dato un Rettangolo, stampi a video area e perimetro.
		 * Realizzare un metodo stampaDueRettangoli che, dati due rettangoli, stampi area e perimetro di ognuno e quindi la
		 * somma delle aree e dei perimetri.
		 * Scrivere un main che utilizzi tutte queste funzioni.
		 * 
		 */
		Rettangolo r1 = new Rettangolo(53, 65);
		Rettangolo r2 = new Rettangolo(23, 54);
		System.out.println(Utils.stampa2rettangoli(r1, r2));
		
		
	}

}
