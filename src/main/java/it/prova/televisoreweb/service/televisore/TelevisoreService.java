package it.prova.televisoreweb.service.televisore;

import java.util.List;

import it.prova.televisoreweb.dao.televisore.TelevisoreDAO;
import it.prova.televisoreweb.model.Televisore;


public interface TelevisoreService {
	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO);

	public List<Televisore> cercaPerMarcaEModello(String marca, String modello);

	public Televisore caricaSingolo(int parseInt) throws Exception;

	public int inserisci(Televisore insertInput) throws Exception;

	public List<Televisore> listAll() throws Exception;

	public void elimina(Televisore televisore) throws Exception;

	public void aggiorna(Televisore televisore) throws Exception;
}
