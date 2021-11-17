<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Filme Cadastro</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<form action="/filme/incluir" method="post">		
			
			<div class="form-group">
	    		<label>Categoria:</label>
	   				<input type="text" class="form-control" placeholder="Digite a sua categoria">
	  		</div>
			
			<div class="form-group">
	    		<label>Taxa de Adesão:</label>
	   				<input type="text" class="form-control" placeholder="5%, 10%, 15%...">
	  		</div>

			<div class="form-group">
				<label>Oscar:</label>
				<input type="text" class="form-control" placeholder="Oscar/não oscar">
			</div>	  		

			<button type="submit" class="btn btn-warning">Cadastrar</button>
		</form>
	</div>
</body>
</html>