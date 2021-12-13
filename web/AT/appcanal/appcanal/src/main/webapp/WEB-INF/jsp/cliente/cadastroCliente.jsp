<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cliente Cadastro</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">
		<form action="/cliente/incluir" method="post">		
			
			<h2>Cadastramento de Cliente</h2>	
			
			<div class="form-group">
	    		<label>Nome:</label>
	   				<input type="text" class="form-control" placeholder="Digite o seu nome" name="nome" value="Jonas Marques">
	  		</div>
			
			<div class="form-group">
	    		<label>Status:</label>	
	   				<input type="text" class="form-control" placeholder="True/False" name="status" value="True">
	  		</div>

			<div class="form-group">
				<label>Tela:</label>
				<input type="text" class="form-control" placeholder="Digite a quantidade de telas" name="tela" value="2">
			</div>	  		

			<button type="submit" class="btn btn-warning">Cadastrar</button>
		</form>
	</div>
</body>
</html>