package it.prova.televisoreweb.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import it.prova.televisoreweb.model.Televisore;


public class DB_Mock {
	public static final List<Televisore> LISTA_TELEVISORI = new ArrayList<>();

	static {
		// preparo una lista mock perché ancora non ho il collegamento alla
		// base dati
		LISTA_TELEVISORI.add(new Televisore(1l, "marca", "modello", "0011AB3", 400, 60));
		LISTA_TELEVISORI.add(new Televisore(2l, "marca2", "modello2", "0011AB4", 450, 65));
		LISTA_TELEVISORI.add(new Televisore(3l, "marca3", "modello3", "0011AB5", 550, 70));
		LISTA_TELEVISORI.add(new Televisore(4l, "Samsung", "Serie MU645", "M77UP9", 429, 60));
		LISTA_TELEVISORI.add(new Televisore(5l, "Sony", "Numero PQ789", "1444PQL", 375, 55));
		LISTA_TELEVISORI.add(new Televisore(6l, "Sony", "Numero M410K", "K2684MM", 450, 65));
		LISTA_TELEVISORI.add(new Televisore(7l, "LG", "Modello 115A", "115A321", 670, 80));
	}

	public static Long getNexIdAvailable() {
		Long resultId = null;
		if (LISTA_TELEVISORI == null || LISTA_TELEVISORI.isEmpty()) {
			resultId = 1L;
		}
		resultId=LISTA_TELEVISORI.stream().max(Comparator.comparing(Televisore::getIdTelevisore)).get().getIdTelevisore();
		return ++resultId;
	}

}
