package it.prova.televisoreweb.dao.televisore;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import it.prova.televisoreweb.dao.DB_Mock;
import it.prova.televisoreweb.model.Televisore;

public class TelevisoreDAOImpl implements TelevisoreDAO {

	@Override
	public List<Televisore> list() throws Exception {
		return DB_Mock.LISTA_TELEVISORI;
	}

	@Override
	public Televisore get(Long id) throws Exception {
		for (Televisore televisore : DB_Mock.LISTA_TELEVISORI) {
			if (televisore.getIdTelevisore() == id) {
				return televisore;
			}
		}

		return null;
	}

	@Override
	public int update(Televisore input) throws Exception {
		for (Televisore televisore : DB_Mock.LISTA_TELEVISORI) {
			if (televisore.getIdTelevisore().equals(input.getIdTelevisore())) {
				DB_Mock.LISTA_TELEVISORI.remove(televisore);
				DB_Mock.LISTA_TELEVISORI.add(input);
				return 1;
			}
		}
		return 0;
	}

	@Override
	public int insert(Televisore input) throws Exception {
		input.setIdTelevisore(DB_Mock.getNexIdAvailable());
		return DB_Mock.LISTA_TELEVISORI.add(input)?1:0;
	}

	@Override
	public int delete(Televisore input) throws Exception {
		return DB_Mock.LISTA_TELEVISORI.remove(input) ? 1 : 0;
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
