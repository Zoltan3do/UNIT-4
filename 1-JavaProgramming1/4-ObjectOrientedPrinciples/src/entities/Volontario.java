package entities;

import interfaces.ChekkiamoTutto;

public class Volontario implements ChekkiamoTutto{
	private String nome;
	private int eta;
	private String CV;
	
	
	public Volontario(String nome, int eta, String cV) {
		super();
		this.nome = nome;
		this.eta = eta;
		CV = cV;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public String getCV() {
		return CV;
	}
	public void setCV(String cV) {
		CV = cV;
	}
	
	@Override
	public String toString() {
		return "Volontario [nome=" + nome + ", eta=" + eta + ", CV=" + CV + "]";
	}

	@Override
	public void checkIn(String orario) {
		System.out.println("Questo volontario mette mano alle: " + orario);
		
	}

	
	
	
}
