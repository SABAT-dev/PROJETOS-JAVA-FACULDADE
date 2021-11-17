<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Esporte Cadastro</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<form action="/esporte/incluir" method="post">		
			
			<div class="form-group">
	    		<label>Time:</label>
	   				<input type="text" class="form-control" placeholder="Digite o seu time">
	  		</div>
			
			<div class="form-group">
	    		<label>Taxa de Adesão:</label>
	   				<input type="text" class="form-control" placeholder="5%, 10%, 15%...">
	  		</div>

			<div class="form-group">
				<label>Premiado:</label>
				<input type="text" class="form-control" placeholder="Premiado/não premiado">
			</div>	  		

			<button type="submit" class="btn btn-warning">Cadastrar</button>
		</form>
	</div>
</body>
</html>