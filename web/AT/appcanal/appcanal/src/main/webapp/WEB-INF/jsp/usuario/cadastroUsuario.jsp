<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tela de Cadastro</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">
	
		<form action="/cep" class="form-inline" method="post">
			<div class="form-group">
		      <label>Cep:</label>
		      <input value="12345678" type="text" class="form-control" placeholder="Digite o seu CEP" name="cep">
		    </div>			
			
			<button type="submit" class="btn btn-warning">Buscar</button>			
		</form>
		
		<hr>
		
		<form action="/usuario/incluir" method="post">	
			<div class="form-group">
		      <label>Nome:</label>
		      <input type="text" value="Xaulin Matador de Porco" class="form-control" placeholder="Digite o seu nome" name="nome">
		    </div>			
		
			<div class="form-group">
		      <label>E-mail:</label>
		      <input type="email" value="xaulin@gmail.com" class="form-control" placeholder="Digite o seu e-mail" name="email">
		    </div>			
			
		    <div class="form-group">
		      <label>Senha:</label>
		      <input type="password" value="matador@al.infnet.edu.br" class="form-control" placeholder="Digite a sua senha" name="senha">
		    </div>
			
			<c:import url="/WEB-INF/jsp/endereco.jsp"/>
		    			
			<button type="submit" class="btn btn-warning">Cadastrar</button>
		</form>
	</div>
</body>
</html>