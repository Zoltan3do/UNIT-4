package entities;

public class Rettangolo {
	private double altezza, larghezza;

	public Rettangolo(double altezza, double larghezza) {
		super();
		this.altezza = altezza;
		this.larghezza = larghezza;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(double larghezza) {
		this.larghezza = larghezza;
	}
	
	public double area() {
		return (larghezza * altezza)/2;
	}
	
	public double perimetro() {
		double ipotenusa = Math.sqrt(Math.pow(this.larghezza, 2) + Math.pow(this.altezza, 2));
		return this.altezza + this.larghezza + ipotenusa;
	}

	@Override
	public String toString() {
		return "area=" + area() + ",\nperimetro()=" + perimetro();
	}
	

}
