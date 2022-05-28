<%@page import="java.util.List"%>
<%@page import="it.prova.televisoreweb.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tabella Televisori</title>
</head>
<body>
	<table class="center">
		<thead>
			<tr>
				<th>Marca</th>
				<th>Modello</th>
				<th>Azione</th>
			</tr>
		</thead>
		
		<%	List<Televisore> listaDaServlet = (List<Televisore>)request.getAttribute("listTelevisori");
			for(Televisore televisore : listaDaServlet){ %>
				<tr>
					<td><%=televisore.getMarca() %></td>
					<td><%=televisore.getModello() %></td>
					<td>
						<a href="ExecuteShowTelevisoreServlet?idTelevisore=<%=televisore.getIdTelevisore() %>">Dettaglio</a>
						<a href="?idTelevisore=<%=televisore.getIdTelevisore() %>">Modifica</a>
						<a href="?idTelevisore=<%=televisore.getIdTelevisore() %>">Elimina</a>
					</td>
				</tr>
		<%	}%>
	
	</table>
	
	<a href="">Inserisci nuovo televisore.</a>
</body>
</html>