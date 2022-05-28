<%@page import="it.prova.televisoreweb.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conferma Rimozione televisore</title>
</head>
<body>
	<% if(request.getAttribute("televisore") == null)	{%>
		<p style="color: red;"> Errore: televisore non trovato </p>
	<%	} else { 
		Televisore televisore = (Televisore)request.getAttribute("televisore");
	%>
		<p>Stai per cancellare definitivamente questo televisore:</p>
	
		<label>MARCA: <%=televisore.getMarca() %></label><br>
		<br>
		<label>MODELLO: <%=televisore.getModello() %></label><br>
		<br>
		<label>CODICE: <%=televisore.getCodice() %></label><br>
		<br>
		<label>PREZZO: <%=televisore.getPrezzo() %></label><br>
		<br>
		<label>POLLICI: <%=televisore.getPollici() %></label><br>
		<br><br>
		<form action="ExecuteDeleteTelevisoreServlet" method="post">
		<input type="hidden" name="idTelevisore" value="<%=televisore.getIdTelevisore()%>">
		<input type="submit" value="Elimina" >
		</form>
	<% } %>
</body>
</html>