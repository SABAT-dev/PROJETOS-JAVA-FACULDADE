<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tela Login</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>
		
	<div class="container">
		<h2>Login de Usuário</h2>
		
		<c:if test="${not empty mensagem}">
			<div class="alert alert-danger">
				<strong>Erro!</strong> ${mensagem}
			</div>
		</c:if>
		
		<form action="/login" method="post">
			<div class="form-group">
			  <label>Email:</label>
			  <input type="email" value="simon2021@gmail.com" class="form-control" placeholder="Digite o seu e-mail" name="email">
			</div>
			
			<div class="form-group">
			  <label>Senha:</label>
			  <input type="password" value="simon2021@gmail.com" class="form-control" placeholder="Digite a sua senha" name="senha">
			</div>
			
			<button type="submit" class="btn btn-warning">Logar</button>
			
		</form>	
	</div>
</body>
</html>