package entities;

public class Cliente {

	/*
	 * 		 * Cliente
	 * - codice cliente
	 * - nome e cognome
	 * - email
	 * - data iscrizione
	 * 
	 */
	private float codiceCliente;
	private String nome,cognome,email,data;

	public Cliente(float codiceCliente, String nome, String cognome, String email, String data) {
		super();
		this.codiceCliente = codiceCliente;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.data = data;
	}

	public void setCodiceCliente(float codiceCliente) {
		this.codiceCliente = codiceCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "codiceCliente=" + codiceCliente + ",\nnome=" + nome + ",\ncognome=" + cognome + ",\nemail="
				+ email + ",\ndata=" + data + "\n";
	}

	public float getClienteAssociato() {
		return codiceCliente;
	}






}
