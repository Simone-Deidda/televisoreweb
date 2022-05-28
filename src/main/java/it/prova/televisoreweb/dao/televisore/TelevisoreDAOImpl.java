package it.prova.televisoreweb.dao.televisore;

import java.sql.Connection;
import java.util.List;

import it.prova.televisoreweb.model.Televisore;

public class TelevisoreDAOImpl implements TelevisoreDAO{

	@Override
	public List<Televisore> list() throws Exception {
		return null;
	}

	@Override
	public Televisore get(Long id) throws Exception {
		return null;
	}

	@Override
	public int update(Televisore input) throws Exception {
		return 0;
	}

	@Override
	public int insert(Televisore input) throws Exception {
		return 0;
	}

	@Override
	public int delete(Televisore input) throws Exception {
		return 0;
	}

	@Override
	public void setConnection(Connection connection) {
	}

	@Override
	public List<Televisore> findByMarcaAndModello(String marca, String modello) {
		return null;
	}

}
