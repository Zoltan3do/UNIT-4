package entities;


import java.util.Map;


public class Carrello {

	/*
	 * 	 * Carrello
	 * - Cliente associato
	 * - elenco articoli (Articolo[])
	 * - totale costo articoli
	 * 
	 */

	private float clienteAssociato;
	private Map<String,Articolo> elencoArticoli;
	private double totCost;


	public Carrello(float codiceCliente, Map<String, Articolo> articoli) {
		super();
		this.clienteAssociato = codiceCliente;
		this.elencoArticoli = articoli;
	}

	public float getClienteAssociato() {
		return clienteAssociato;
	}

	public void setClienteAssociato(float clienteAssociato) {
		this.clienteAssociato = clienteAssociato;
	}

	public String getElencoArticoli() {
		String a="";
		for(String articolo:elencoArticoli.keySet()) {
			a+=elencoArticoli.get(articolo).toString()+"\n";
		}
		return a;
	}


	public double getTotCost() {
		double tot = 0;
		for(String a:elencoArticoli.keySet()) 
			tot += elencoArticoli.get(a).getPrezzo();
		return tot;
	}

	public void addArticle(String nome, Articolo a) {
		elencoArticoli.put(nome,a);
	}

	public void removeArticle(float code) {
		for(String k: elencoArticoli.keySet()) {
			if(elencoArticoli.get(k).getCodice() == code) 
				elencoArticoli.remove(k);
			else 
				System.out.println("Questo numero non esiste");
		}
	}

	@Override
	public String toString() {
		return "clienteAssociato=" + clienteAssociato + ",\nelencoArticoli=" + elencoArticoli + ",\ntotCost="
				+ totCost + "\n";
	}


}
