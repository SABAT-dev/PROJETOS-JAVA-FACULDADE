<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Serviço Cadastro</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>


	<div class="container">
		<form action="/servico/incluir" method="post">		
			
			<h2>Cadastramento de Serviço</h2>	
			
			<div class="form-group">
	    		<label>Canal:</label>
	   				<input type="text" class="form-control" placeholder="Digite o nome do canal">
	  		</div>
			
			<div class="form-group">
	    		<label>Dispositivo:</label>
	   				<input type="text" class="form-control" placeholder="Celular, smartTV, tvbox...">
	  		</div>

			<div class="form-group">
				<label>Preço:</label>
				<input type="text" class="form-control" placeholder="Digite o preço do plano">
			</div>	  		

			<button type="submit" class="btn btn-warning">Cadastrar</button>
		</form>
	</div>
</body>
</html>