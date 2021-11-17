<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Servi�o Cadastro</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<form action="/servico/incluir" method="post">		
			
			<div class="form-group">
	    		<label>Canal:</label>
	   				<input type="text" class="form-control" placeholder="Digite o nome do canal">
	  		</div>
			
			<div class="form-group">
	    		<label>Dispositivo:</label>
	   				<input type="text" class="form-control" placeholder="Celular, smartTV, tvbox...">
	  		</div>

			<div class="form-group">
				<label>Pre�o:</label>
				<input type="text" class="form-control" placeholder="Digite o pre�o do plano">
			</div>	  		

			<button type="submit" class="btn btn-warning">Cadastrar</button>
		</form>
	</div>
</body>
</html>