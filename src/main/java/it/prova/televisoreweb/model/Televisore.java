package it.prova.televisoreweb.model;

//Televisore: id, marca(R), modello(R), prezzo, pollici, codice - CRUD ecc.

public class Televisore {
	private Long idTelevisore;
	private String marca;
	private String mpdello;
	private String codice;
	private Integer prezzo;
	private Integer pollici;
	
	public Televisore() {
	}

	public Televisore(Long idTelevisore, String marca, String mpdello, String codice, Integer prezzo, Integer pollici) {
		this.marca = marca;
		this.mpdello = mpdello;
		this.codice = codice;
		this.prezzo = prezzo;
		this.pollici = pollici;
		this.idTelevisore = idTelevisore;
	}

	public Long getIdTelevisore() {
		return idTelevisore;
	}

	public void setIdTelevisore(Long idTelevisore) {
		this.idTelevisore = idTelevisore;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return mpdello;
	}

	public void setMpdello(String mpdello) {
		this.mpdello = mpdello;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public Integer getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Integer prezzo) {
		this.prezzo = prezzo;
	}

	public Integer getPollici() {
		return pollici;
	}

	public void setPollici(Integer pollici) {
		this.pollici = pollici;
	}

	@Override
	public String toString() {
		return "Telovisore [idTelevisore=" + idTelevisore + ", marca=" + marca + ", mpdello=" + mpdello + ", codice="
				+ codice + ", prezzo=" + prezzo + ", pollici=" + pollici + "]";
	}
	
	
}
