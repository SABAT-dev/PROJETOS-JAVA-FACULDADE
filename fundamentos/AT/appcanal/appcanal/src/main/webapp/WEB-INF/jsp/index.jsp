<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<form action="confirmation.html" method="post">		
			
			<div class="form-group">
	    		<label>Nome:</label>
	   				<input type="text" class="form-control" placeholder="Digite o seu nome" value="Simon Assagra">
	  		</div>
			
			<div class="form-group">
	    		<label>E-mail:</label>
	   				<input type="email" class="form-control" placeholder="Digite o seu e-mail" value="simon2015@gmail.com">
	  		</div>

			<div class="form-check-inline">
				<label class="form-check-label">Escolaridade:
				<br>
					<input checked type="radio" class="form-check-input" name="escolaridade" value="G"> Graduação
					<input type="radio" class="form-check-input" name="escolaridade" value="E"> Especialização
					<input type="radio" class="form-check-input" name="escolaridade" value="M"> Mestrado
					<input type="radio" class="form-check-input" name="escolaridade" value="D"> Doutorado
				</label>
			</div>
			<br>
			<br>
			
			<div class="form-check-inline">
				<label class="form-check-label">Disciplinas:
				<br>
					<input type="checkbox" class="form-check-input" name="disciplinas" value="FJ"> Fundamentos Java
					<input type="checkbox" class="form-check-input" name="disciplinas" value="POO"> Programação Orientada a Objetos
					<input checked type="checkbox" class="form-check-input" name="disciplinas" value="PB"> Projeto de Bloco
					<input checked type="checkbox" class="form-check-input" name="disciplinas" value="JW"> Java Web
					<input checked type="checkbox" class="form-check-input" name="disciplinas" value="JN"> Java Nuvem
				</label>
			</div>
			<br>
			<br>

			<div class="form-group">
				<label>Regiões:</label>
				<select class="form-control"name="regiao">
					<option value="N">Norte</option>
					<option value="Ne">Nordeste</option>
					<option selected value="C">Centro-Oeste</option>
					<option value="S">Sul</option>
					<option value="Se">Sudeste</option>
				</select>
			</div>

			<button type="submit" class="btn btn-warning">Cadastrar</button>
		</form>
	</div>
</body>
</html>