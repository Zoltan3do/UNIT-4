package utils;


public class Util {

	public boolean stringaPariDispari(String s) {
		return s.length() % 2 == 0 ? true : false;
	}

	public boolean annoBisestile(int anno) {
		return ((anno % 4 == 0 &&  anno % 100 != 0) || (anno % 400 == 0));
	}

	public String da0a3(int i) {
		return i == 0 ? "zero" : i == 1 ? "uno" : i == 2 ? "due" : i == 3 ? "tre" : "errore";
	}

	public String virgola(String q) {
		return q.replace("", ",").substring(1, q.replace("", ",").length()-1);
	}

	public String intero (int genoveffa) {
		String result = "";
		for(int i = genoveffa; i >= 0; i--) if(i != 0) result += i + "\n"; else result += i;			
		return result;
	}
	
}
