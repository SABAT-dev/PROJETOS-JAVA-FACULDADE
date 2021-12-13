<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tela de Lista</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">
	
	  <a href="/filme">Cadastrar Novo Filme</a>
	  
	  <hr>

	  <c:if test="${not empty mensagem}">
			<div class="alert alert-danger">
				 <strong>Atenção!</strong> ${mensagem}
			</div>	  
	  </c:if>
	  
	  <c:if test="${not empty categoria}">
	  		<div class="alert alert-success">
				<strong>Confirmação!</strong> Categoria ${categoria} cadastrado(a) com sucesso!!!
			</div>
	  </c:if>	  
	  
	  <c:if test="${not empty listaFilmes}">	  
		  <h4>Listagem de Filmes - ${listaFilmes.size()}</h4>
		  
		  <table class="table table-dark table-striped">
		    <thead>
		      <tr>
		      	<th>#</th>
		      	<th>Canal</th>
		      	<th>Dispositivo</th>
		      	<th>Preço</th>		      
		        <th>Categoria</th>
		        <th>Taxa de Adesão</th>
		        <th>Oscar</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		    	<c:forEach var="f" items="${listaFilmes}">
			      <tr>
			      	<td>${f.id}</td>
			      	<td>${f.canal}</td>
			      	<td>${f.dispositivo}</td>
			      	<td>${f.calcularPreco()}</td>			      
			        <td>${f.categoria}</td>
			        <td>${f.taxaAdesaoFilme}</td>
			        <td>${f.oscar}</td>
			        <td><a href="/filme/${f.id}/excluir">Excluir</a></td>
			      </tr>
			    </c:forEach>
		    </tbody>
		  </table>
	  </c:if>
	  
	  <c:if test="${empty listaFilmes}">
	  		<h4>Não existem filmes cadastrados!</h4>
	  </c:if>
	  
	</div>
</body>
</html>