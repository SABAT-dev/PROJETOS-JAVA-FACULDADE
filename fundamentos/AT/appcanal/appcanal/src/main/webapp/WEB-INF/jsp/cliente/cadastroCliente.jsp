<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cliente Cadastro</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<form action="/cliente/incluir" method="post">		
			
			<div class="form-group">
	    		<label>Nome:</label>
	   				<input type="text" class="form-control" placeholder="Digite o seu nome">
	  		</div>
			
			<div class="form-group">
	    		<label>Status:</label>
	   				<input type="text" class="form-control" placeholder="Ativo/expirado">
	  		</div>

			<div class="form-group">
				<label>Tela:</label>
				<input type="text" class="form-control" placeholder="Digite a quantidade de telas">
			</div>	  		

			<button type="submit" class="btn btn-warning">Cadastrar</button>
		</form>
	</div>
</body>
</html>