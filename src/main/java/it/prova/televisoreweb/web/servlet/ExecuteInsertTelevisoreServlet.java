package it.prova.televisoreweb.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.televisoreweb.model.Televisore;
import it.prova.televisoreweb.service.MyServiceFactory;
import it.prova.televisoreweb.service.televisore.TelevisoreService;


@WebServlet("/ExecuteInsertTelevisoreServlet")
public class ExecuteInsertTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String destinazione = "insert.jsp";
		
		Televisore televisore = new Televisore();
		televisore.setMarca(request.getParameter("marcaInput"));
		televisore.setModello(request.getParameter("modelloInput"));
		televisore.setCodice(request.getParameter("codiceInput"));
		televisore.setPrezzo(Integer.parseInt(request.getParameter("prezzoInput")));
		televisore.setPollici(Integer.parseInt(request.getParameter("polliciInput")));
		
		if (validateTelevisore(televisore)) {
			request.setAttribute("Errore", "Dati inseriti non validi.");
			request.setAttribute("televisore", televisore);
			RequestDispatcher rd = request.getRequestDispatcher(destinazione);
			rd.forward(request, response);
		}
		List<Televisore> list = new ArrayList<Televisore>();
		TelevisoreService televisoreService = MyServiceFactory.getTelevisoreServiceInstance();
		try {
			televisoreService.inserisci(televisore);
			list = televisoreService.listAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		destinazione = "results.jsp";
		request.setAttribute("listTelevisori", list);
		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);
	}

	private boolean validateTelevisore(Televisore televisore) {
		return televisore == null || televisore.getMarca() == null || televisore.getMarca().isEmpty()
				|| televisore.getModello() == null || televisore.getModello().isEmpty()
				|| televisore.getCodice() == null || televisore.getCodice().isEmpty() || televisore.getPrezzo() == null
				|| televisore.getPrezzo() < 1 || televisore.getPollici() == null || televisore.getPollici() < 1;
	}
}
