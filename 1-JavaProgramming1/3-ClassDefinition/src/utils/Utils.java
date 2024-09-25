package utils;

import entities.Rettangolo;

public class Utils {
	
	public static String stampa2rettangoli(Rettangolo a, Rettangolo b) {
		return "Rettangolo 1: " + a.toString() +
				"\nRettangolo 2: " + b.toString() + 
				"\nSomma aree:" + (a.area() + b.area()) + 
				"\nSomma perimetri: " + (b.perimetro() + a.perimetro());
	}

}
