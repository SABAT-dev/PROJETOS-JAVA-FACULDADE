<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>S�rie Cadastro</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<form action="/serie/incluir" method="post">		
			
			<div class="form-group">
	    		<label>G�nero:</label>
	   				<input type="text" class="form-control" placeholder="Digite o seu g�nero">
	  		</div>
			
			<div class="form-group">
	    		<label>Taxa de Ades�o:</label>
	   				<input type="text" class="form-control" placeholder="5%, 10%, 15%...">
	  		</div>

			<div class="form-group">
				<label>Lan�amento:</label>
				<input type="text" class="form-control" placeholder="Lan�amento/n�o lan�amento">
			</div>	  		

			<button type="submit" class="btn btn-warning">Cadastrar</button>
		</form>
	</div>
</body>
</html>