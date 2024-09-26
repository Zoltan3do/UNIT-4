package entities;

import customExceptions.ParametroErratoException;

public class DipendenteFullTime extends Dipendente {

	public DipendenteFullTime(String matricola, double stipendio, String dipartimento) throws ParametroErratoException {
		super(matricola, stipendio, dipartimento);
		calculateSalary();
	}

	@Override
	public void calculateSalary() {
		switch(this.getDipartimento()) {
		case "vendita": 
			this.setStipendio(500);
			break;
		case "amministrazione": 
			this.setStipendio(1000);
			break;
		case "produzione": 
			this.setStipendio(1500);
			break;
		default:break;
		}
	}

	@Override
	public void checkIn(String orario) {
		System.out.println("Questo dipendente full time mette mano alle: " + orario);
	}

}
