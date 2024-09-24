package main;

import java.util.Scanner;

import utils.Util;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Util u = new Util();
		
		System.out.println("Inserisci una stringa");
		System.out.println(u.stringaPariDispari(in.nextLine()));
		
		System.out.println("Inserisci un annata");
		System.out.println(u.annoBisestile(Integer.parseInt(in.nextLine())));
		
		System.out.println("Inserisci un numero tra 0 e 3");
		System.out.println(u.da0a3(Integer.parseInt(in.nextLine())));
		
		String ris;
		do {
			System.out.println("Inserisci una stringa");
			ris = in.nextLine();  
			System.out.println(u.virgola(ris));
		}while(!ris.equalsIgnoreCase(":q"));
		
		System.out.println("Inserisci un numero ");
		System.out.println(u.intero(Integer.parseInt(in.nextLine())));
		
		in.close();
		
	}

}
