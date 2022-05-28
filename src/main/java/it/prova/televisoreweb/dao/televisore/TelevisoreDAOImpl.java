package it.prova.televisoreweb.dao.televisore;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import it.prova.televisoreweb.dao.DB_Mock;
import it.prova.televisoreweb.model.Televisore;

public class TelevisoreDAOImpl implements TelevisoreDAO{

	@Override
	public List<Televisore> list() throws Exception {
		return null;
	}

	@Override
	public Televisore get(Long id) throws Exception {
		for (Televisore abitante : DB_Mock.LISTA_TELEVISORI) {
			if (abitante.getIdTelevisore() == id) {
				return abitante;
			}
		}
		
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
		List<Televisore> result = new ArrayList<>();

		for (Televisore televisore : DB_Mock.LISTA_TELEVISORI) {
			if (televisore.getMarca().startsWith(marca) && televisore.getModello().startsWith(modello))
				result.add(televisore);
		}
		return result;
	}

}
