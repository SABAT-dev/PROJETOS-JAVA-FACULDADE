<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Plano Cadastro</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<form action="/plano/incluir" method="post">		
			
			<div class="form-group">
	    		<label>Cliente:</label>
	   				<input type="text" class="form-control" placeholder="Digite o nome do cliente">
	  		</div>
			
			<div class="form-group">
	    		<label>Duração do Plano:</label>
	   				<input type="text" class="form-control" placeholder="1 mês, 2 meses, 5 meses...">
	  		</div>

			<button type="submit" class="btn btn-warning">Cadastrar</button>
		</form>
	</div>
</body>
</html>