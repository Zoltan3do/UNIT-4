package entities;

import customExceptions.ParametroErratoException;

public class DipendentePartTime extends Dipendente {
	private int oreLavorate;

	public DipendentePartTime(String matricola, double stipendio, String dipartimento,int ore) throws ParametroErratoException {
		super(matricola, stipendio, dipartimento);
		this.oreLavorate = ore;
	}
	
	public int getOreLavorate() {
		return oreLavorate;
	}

	public void setOreLavorate(int oreLavorate) {
		this.oreLavorate = oreLavorate;
		calculateSalary();
	}

	@Override
	public void calculateSalary() {
		switch(getDipartimento()) {
		case "vendita":
			this.setStipendio(this.oreLavorate*5);
			break;
		case "amministrazione":
			this.setStipendio(this.oreLavorate*10);
			break;
		case "produzione":
			this.setStipendio(this.oreLavorate*15);break;
		default:System.out.println("Non sei un mio dipendente");
		}
	}
	
	@Override
	public void checkIn(String orario) {
		System.out.println("Questo dipendente part time mette mano alle: " + orario);
		
	}


}
