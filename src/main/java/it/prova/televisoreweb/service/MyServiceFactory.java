package it.prova.televisoreweb.service;

import it.prova.televisoreweb.dao.MyDaoFactory;
import it.prova.televisoreweb.model.Televisore;
import it.prova.televisoreweb.service.televisore.TelevisoreService;
import it.prova.televisoreweb.service.televisore.TelevisoreServiceImpl;

public class MyServiceFactory {
	// rendiamo questo factory SINGLETON
	private static TelevisoreService ABITANTE_SERVICE_INSTANCE;

	public static TelevisoreService getTelevisoreServiceInstance() {
		if (ABITANTE_SERVICE_INSTANCE == null)
			ABITANTE_SERVICE_INSTANCE = new TelevisoreServiceImpl();

		ABITANTE_SERVICE_INSTANCE.setTelevisoreDAO(MyDaoFactory.getTelevisoreDAOInstance());

		return ABITANTE_SERVICE_INSTANCE;
	}
}
