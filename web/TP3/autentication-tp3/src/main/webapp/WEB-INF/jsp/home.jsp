<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>P?gina de Cadastro</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
	
		<h2>Cadastramento de Usu?rio</h2>
	
		<form action="/cadastro" method="post">
			<div class="form-group">
	    		<label>Nome:</label>
	   			<input type="text" class="form-control" placeholder="Digite o seu nome" name="nome" value="Simon Assagra">
	  		</div>
			
			<div class="form-group">
	    		<label>E-mail:</label>
	   			<input type="email" class="form-control" placeholder="Digite o seu e-mail" name="email" value="simon1515@gmail.com">
	  		</div>

			<div class="form-group">
				<label>Senha:</label>
				<input type="password" class="form-control" placeholder="Digite a sua senha" name="senha" value="1234567890">
			</div>
			
			<button type="submit" class="btn btn-success">Salvar</button>
			
		</form>
	</div>
</body>
</html>