package entities;

import customExceptions.ParametroErratoException;

public class Dirigente extends Dipendente {

	public Dirigente(String matricola, double stipendio, String dipartimento) throws ParametroErratoException {
		super(matricola, stipendio, dipartimento);
		calculateSalary();
	}
	
	@Override
	public void calculateSalary() {
		switch(this.getDipartimento()) {
		case "vendita": 
			this.setStipendio(5000);
			break;
		case "amministrazione": 
			this.setStipendio(10000);
			break;
		case "produzione": 
			this.setStipendio(15000);
			break;
		default:break;
		}
	}

	
	@Override
	public void checkIn(String orario) {
		System.out.println("Questo dirigente part time mette mano alle: " + orario);
		
	}



}
