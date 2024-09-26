package entities;

import java.util.ArrayList;

import customExceptions.ParametroErratoException;
import interfaces.ChekkiamoTutto;

public abstract class Dipendente implements ChekkiamoTutto{
	
	private String matricola;
	private double stipendio;
	private String dipartimento;
	
	@SuppressWarnings("serial")
	private static final ArrayList<String> DIPARTIMENTI_POSSIBILI = 
			new ArrayList<>(){{add("produzione");add("amministrazione");add("vendita");}};
	
	public Dipendente(String matricola, double stipendio, String dipartimento)throws ParametroErratoException {
		super();
		this.matricola = matricola;
		this.stipendio = stipendio;
		if(!DIPARTIMENTI_POSSIBILI.contains(dipartimento)) 
			throw new ParametroErratoException("Dipartimento non valido " + dipartimento );
		this.dipartimento = dipartimento;
	}


	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	public String getDipartimento() {
		return dipartimento;
	}

	public void setDipartimento(String dipartimento) {
		this.dipartimento = dipartimento;
	}
	
	@Override
	public String toString() {
		return "matricola=" + matricola + ",\nstipendio=" + stipendio + ",\ndipartimento=" + dipartimento
				+ "\n";
	}

	public abstract void calculateSalary();
	

}
