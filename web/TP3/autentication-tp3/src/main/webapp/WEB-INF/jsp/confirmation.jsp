<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="br.edu.infnet.autenticationtp3.model.domain.Cadastro"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página de Confirmação</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
		
	<div class="container">
		<form action="/cadastro" method="get">
			<div class="alert alert-success">
				<h4><strong>Sucesso!</strong> ${nome} foi cadastrado com perfeição!</h4>
			</div>
			
			<button type="submit" class="btn btn-success">Voltar</button>
			<hr>
			
			<c:if test="${not empty cadastroLista}">
				<h4>Lista de ${cadastroLista.size()} pessoa(s) cadastrada(s):</h4>
				
			  	<table class="table table-dark table-striped">
			    	<thead>
			      		<tr>
			      			<th>#</th>
			        		<th>Nome</th>
			        		<th>E-mail</th>
			      		</tr>
			    	</thead>
			    	<tbody>
			    		<c:forEach var="c" items="${cadastroLista}">
				      		<tr>
				      			<td>${c.id}</td>
				        		<td>${c.nome}</td>
				        		<td>${c.email}</td>
				      		</tr>
			      		</c:forEach>
			    	</tbody>
			  	</table>
		  	</c:if>
		  	
		  	<c:if test="${empty cadastroLista}">
		  		<h4>Não existem usuários cadastrados!</h4>
		  	</c:if>
		</form>
	</div>
</body>
</html>