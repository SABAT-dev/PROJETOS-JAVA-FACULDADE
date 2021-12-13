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
	
	  <a href="/serie">Cadastrar Nova S�rie</a>
	  
	  <hr>

	  <c:if test="${not empty mensagem}">
			<div class="alert alert-danger">
				 <strong>Aten��o!</strong> ${mensagem}
			</div>	  
	  </c:if>
	  
	  <c:if test="${not empty genero}">
	  		<div class="alert alert-success">
				<strong>Confirma��o!</strong> G�nero ${genero} cadastrado com sucesso!!!
			</div>
	  </c:if>
	  
	  <c:if test="${not empty listaSeries}">
	  	  
		  <h4>Listagem de S�ries - ${listaSeries.size()}</h4>
		  
		  <table class="table table-dark table-striped">
		    <thead>
		      <tr>
		      	<th>#</th>
		      	<th>Canal</th>
		      	<th>Dispositivo</th>
		      	<th>Pre�o</th>
		      	<th>G�nero</th>
		      	<th>Taxa de Ades�o</th>		        		 
		        <th>Lan�amento</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		    	<c:forEach var="s" items="${listaSeries}">
			      <tr>
			      	<td>${s.id}</td>
			      	<td>${s.canal}</td>
			      	<td>${s.dispositivo}</td>
			      	<td>${s.calcularPreco()}</td>
			        <td>${s.genero}</td>
			        <td>${s.taxaAdesaoSerie}</td>
			        <td>${s.lancamento}</td>
			        <td><a href="/serie/${s.id}/excluir">Excluir</a></td>
			      </tr>
			    </c:forEach>
		    </tbody>
		  </table>
	  </c:if>
	  
	  <c:if test="${empty listaSeries}">
	  		<h4>N�o existem s�ries cadastradas!</h4>
	  </c:if>
	  
	</div>
</body>
</html>