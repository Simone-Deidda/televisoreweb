package it.prova.televisoreweb.service.televisore;

import java.util.List;

import it.prova.televisoreweb.dao.televisore.TelevisoreDAO;
import it.prova.televisoreweb.model.Televisore;

public class TelevisoreServiceImpl implements TelevisoreService {

	private TelevisoreDAO televisoreDAO;

	@Override
	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO) {
		this.televisoreDAO = televisoreDAO;
	}

	@Override
	public List<Televisore> cercaPerMarcaEModello(String marca, String modello) {
		return televisoreDAO.findByMarcaAndModello(marca, modello);
	}

	@Override
	public Televisore caricaSingolo(int parseInt) throws Exception {
		return televisoreDAO.get((long) parseInt);
	}

	@Override
	public int inserisci(Televisore insertInput) throws Exception {
		return 0;
	}

	@Override
	public List<Televisore> listAll() throws Exception {
		return televisoreDAO.list();
	}

	@Override
	public void elimina(Televisore televisore) throws Exception {
		televisoreDAO.delete(televisore);
	}

	@Override
	public void aggiorna(Televisore televisore) throws Exception {
	}

}
