<%@page import="it.prova.televisoreweb.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Inserisci i dati del nuovo abitante</p>
	
	<% if(request.getAttribute("Errore") != null){	%>
		<p style="color: red;"><%=request.getAttribute("Errore")%></p>
	<% };
		Televisore televisore = (Televisore)request.getAttribute("televisore"); %>
		
	<form action="ExecuteUpdateTelevisoreServlet" method="post">
		<label for="marcaInputId">MARCA:</label><br>
		<input type="text" name="marcaInput" id="marcaInputId" value="<%=televisore.getMarca() %>">
		<br>
		<label for="modelloInputId">MODELLO:</label><br>
		<input type="text" name="modelloInput" id="modelloInputId" value="<%=televisore.getModello() %>">
		<br>
		<label for="codiceInputId">CODICE:</label><br>
		<input type="text" name="codiceInput" id="codiceInputId" value="<%=televisore.getCodice() %>">
		<br>
		<label for="prezzoInputId">PREZZO:</label><br>
		<input type="number" name="prezzoInput" id="prezzoInputId" value="<%=televisore.getPrezzo() %>">
		<br>
		<label for="polliciInputId">POLLICI:</label><br>
		<input type="number" name="polliciInput" id="polliciInputId" value="<%=televisore.getPollici() %>">
		<br>
		<input type="hidden" name="idInput" value="<%=televisore.getIdTelevisore() %>">
		<br>
		<input type="submit" value="MODIFICA">
	
	</form>
</body>
</html>