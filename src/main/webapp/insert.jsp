<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inserisci nuovo televisore</title>
</head>
<body>
	<% if(request.getAttribute("Errore") != null) {%>
		<p style="color: red;"> <%=request.getAttribute("Errore") %> </p>
	<%} else { %>
		<p>Inserisci i dati del nuovo televisore</p>
	<% } %>
	<form action="ExecuteInsertTelevisoreServlet" method="post">
		<label for="marcaInputId">MARCA:</label><br>
		<input type="text" name="marcaInput" id="marcaInputId">
		<br>
		<label for="modelloInputId">MODELLO:</label><br>
		<input type="text" name="modelloInput" id="modelloInputId">
		<br>
		<label for="codiceInputId">CODICE:</label><br>
		<input type="text" name="codiceInput" id="codiceInputId">
		<br>
		<label for="prezzoInputId">PREZZO:</label><br>
		<input type="number" name="prezzoInput" id="prezzoInputId" value="0">
		<br>
		<label for="polliciInputId">POLLICI:</label><br>
		<input type="number" name="polliciInput" id="polliciInputId" value="0">
		<br><br>
		<input type="submit" value="INSERISCI">
	
	</form>
</body>
</html>