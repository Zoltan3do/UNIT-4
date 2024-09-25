package entities;

public class Articolo {
	/*
	 *  * Articolo
	 * - codice articolo
	 * - descrizione articolo
	 * - prezzo
	 * - numeri pezzi disponibili a magazzino
	 * 
	 * */
	private float codice;
	private String descrizione;
	private double prezzo;
	private int nPezzi;

	
	public Articolo(float codice, String descrizione, double prezzo, int nPezzi) {
		super();
		this.codice = codice;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.nPezzi = nPezzi;
	}
	
	public float getCodice() {
		return this.codice;
	}
	
	public void setCodice(float codice) {
		this.codice = codice;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getnPezzi() {
		return nPezzi;
	}
	public void setnPezzi(int nPezzi) {
		this.nPezzi = nPezzi;
	}

	@Override
	public String toString() {
		return "codice=" + codice + ",\ndescrizione=" + descrizione + ",\nprezzo=" + prezzo + ",\nPezzi="
				+ nPezzi + "\n";
	}


}
