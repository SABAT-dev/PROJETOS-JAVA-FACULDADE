<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Esporte Cadastro</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">
		<form action="/esporte/incluir" method="post">		
			
			<h2>Cadastramento de Esporte</h2>	

			<div class="form-group">
	    		<label>Canal:</label>
	   				<input type="text" class="form-control" placeholder="Digite o nome do seu canal" name="canal" value="Globo">
	  		</div>
	  		
	  		<div class="form-group">
	    		<label>Dispositivo:</label>
	   				<input type="text" class="form-control" placeholder="TVbox, computador, celular, smartTV" name="dispositivo" value="SmartTv">
	  		</div>
	  		
	  		<div class="form-group">
	    		<label>Preço:</label>
	   				<input type="text" class="form-control" placeholder="Digite o preço da sua série" name="preco" value="180">
	  		</div>
			
			<div class="form-group">
	    		<label>Time:</label>
	   				<input type="text" class="form-control" placeholder="Digite o nome do seu time" name="time" value="Flamengo">
	  		</div>
			
			<div class="form-group">
	    		<label>Taxa de Adesão:</label>
	   				<input type="number" class="form-control" placeholder="5%, 10%, 15%..." name="taxaAdesaoEsporte" value="20">
	  		</div>

			<div class="form-group">
	    		<label>Informações:</label>
	    			<div class="form-check-inline">
	    				<label class="form-check-label">
		   					<input type="checkbox" class="form-check-input" name="premiado" value="true"> Premiado
		   				</label>
	   				</div>
	  		</div>	  		

			<button type="submit" class="btn btn-warning">Cadastrar</button>
		</form>
	</div>
</body>
</html>