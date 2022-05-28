<%@page import="it.prova.televisoreweb.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dettagli Televisore</title>
</head>
<body>
	<% Televisore televisore = (Televisore)request.getAttribute("abitante");
		if(televisore != null) {
	%>
		<p>Marca: <%=televisore.getMarca() %></p>
		<p>Modello: <%=televisore.getModello() %></p>
		<p>Codice: <%=televisore.getCodice() %></p>
		<p>Prezzo: <%=televisore.getPrezzo() %></p>
		<p>Pollici: <%=televisore.getPollici() %></p>
	<% } else  {%>
		<p style="color: red;">Errore di caricamento dati dal DB</p>
		<% } %>
		<a href="searchForm.jsp">Home</a>
</body>
</html>