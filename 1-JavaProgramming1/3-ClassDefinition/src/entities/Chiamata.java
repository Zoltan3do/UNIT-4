package entities;

public class Chiamata {
	private int durata;
	private float destinatario;
	
	public Chiamata(int durata, float destinatario) {
		super();
		this.durata = durata;
		this.destinatario = destinatario;
	}
	
	public int getDurata() {
		return durata;
	}
	public void setDurata(int durata) {
		this.durata = durata;
	}
	public float getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(float destinatario) {
		this.destinatario = destinatario;
	}

	@Override
	public String toString() {
		return "Chiamata: " + "\ndurata=" + durata + ",\ndestinatario=" + destinatario+"\n";
	}
	
	
	
}
