package it.prova.televisoreweb.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.televisoreweb.service.MyServiceFactory;


@WebServlet("/ExecuteSearchTelevisoreServlet")
public class ExecuteSearchTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String destinazione = "searchForm.jsp";

		String marcaInput = request.getParameter("marcaInput");
		String modelloInput = request.getParameter("modelloInput");

		if (marcaInput.isEmpty() && modelloInput.isEmpty()) {
			request.setAttribute("messaggioDiErrore", "Errore! E' necessario valorizzare almeno un campo.");
			
		} else {
			request.setAttribute("listTelevisori",
					MyServiceFactory.getTelevisoreServiceInstance().cercaPerMarcaEModello(marcaInput, modelloInput));
			destinazione = "results.jsp";
		}

		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);
	}

}
