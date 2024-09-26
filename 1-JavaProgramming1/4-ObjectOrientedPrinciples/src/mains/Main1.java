//package mains;
//
//import customExceptions.ParametroErratoException;
//import entities.Dipendente;
//
//public class Main1 {
//
//	public static void main(String[] args) throws ParametroErratoException {
//		/*
//		 * Esercizio 1#
//		 * Scrivere la classe Dipendente cha ha i seguenti attributi:
//		 * 
//		 * - matricola - identificativo univoco del dipendente
//		 * - stipendio - numero decimale con stipendio base mensile calcolato per  il dipendente
//		 * - Dipartimento - Valori possibili [PRODUZIONE, AMMINISTRAZIONE, VENDITE]
//		 * 
//		 * Le proprietà devono essere accessibili solo dalla classe Dipendente e deve essere possibile leggerle tramite
//		 * opportuni metodi getter ma non modificarle, tranne la proprietà Dipartimento che può essere modificata da altre
//		 * classi tramite setter.
//		 * Instanziare 3 Dipendenti nel main, creare un array con essi ed iterare su ognuno di essi stampando la matricola di
//		 * ogni dipendente.
//		 * */
//
//		
//		Dipendente d1 = new Dipendente("Ciaoatutti0", 200.0, "amministrazione");
//		Dipendente d2 = new Dipendente("Ciaoatutti1", 300.0, "vendite");
//		Dipendente d3 = new Dipendente("Ciaoatutti2", 400.0, "produzione");
//		Dipendente[] dipendenti = {d1,d2,d3};
//		for(Dipendente d: dipendenti) {
//			System.out.println(d.getMatricola());
//		}
//	}
//
//}
