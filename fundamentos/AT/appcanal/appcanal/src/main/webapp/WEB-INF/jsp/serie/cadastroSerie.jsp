<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Série Cadastro</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<form action="/serie/incluir" method="post">		
			
			<div class="form-group">
	    		<label>Gênero:</label>
	   				<input type="text" class="form-control" placeholder="Digite o seu gênero">
	  		</div>
			
			<div class="form-group">
	    		<label>Taxa de Adesão:</label>
	   				<input type="text" class="form-control" placeholder="5%, 10%, 15%...">
	  		</div>

			<div class="form-group">
				<label>Lançamento:</label>
				<input type="text" class="form-control" placeholder="Lançamento/não lançamento">
			</div>	  		

			<button type="submit" class="btn btn-warning">Cadastrar</button>
		</form>
	</div>
</body>
</html>