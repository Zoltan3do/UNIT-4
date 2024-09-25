package entities;

import java.util.ArrayList;

public class Sim {

	private float numTelefono;
	private double credito = 0;
	private ArrayList<Chiamata> ultimeChiamate = new ArrayList<>();

	public Sim(float numTelefono) {
		super();
		this.numTelefono = numTelefono;
	}

	public float getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(float numTelefono) {
		this.numTelefono = numTelefono;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public ArrayList<Chiamata> getUltimeChiamate() {
		return ultimeChiamate;
	}

	public void setUltimeChiamate(ArrayList<Chiamata> ultimeChiamate) {
		this.ultimeChiamate = ultimeChiamate;
	}

	public void addCall(Chiamata c) {
		if(c.getDurata() > credito / 10) {
			System.out.println("Non hai il credito sufficiente!");
		}else { 
			this.credito -= c.getDurata()*10;
			if(this.ultimeChiamate.size() == 5) {
				this.ultimeChiamate.remove(0);
				this.ultimeChiamate.add(c);
			}else {
				this.ultimeChiamate.add(c);
			}
		}
	}

	public void ricarica(double carica) {
		this.credito += carica;
	}

	public String tabulato() {
		String ret = "";
		if(ultimeChiamate.size()<=0) 
			return "Non ci sono chiamate effettuate";
		else {
			for(int i = 0; i<ultimeChiamate.size();i++) 
				ret += "Chiamata " + (i + 1) +":\n"+ultimeChiamate.get(i).toString();
			return ret;
		}
	}

	@Override
	public String toString() {
		return "numTelefono=" + numTelefono + ",\ncredito=" + credito + ",\nultimeChiamate=" + ultimeChiamate;
	}


}
