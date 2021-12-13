<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	
	  <c:if test="${not empty mensagem}">
			<div class="alert alert-danger">
				 <strong>Atenção!</strong> ${mensagem}
			</div>	  
	  </c:if>
	  
	  <c:if test="${not empty canal}">
	  		<div class="alert alert-success">
				<strong>Confirmação!</strong> Canal ${canal} cadastrado(a) com sucesso!!!
			</div>
	  </c:if>
	  
	  <c:if test="${not empty listaServicos}">	  
		  <h4>Listagem de Serviços - ${listaServicos.size()}</h4>
		  
		  <table class="table table-dark table-striped">
		    <thead>
		      <tr>
		        <th>#</th>
		        <th>Canal</th>
		        <th>Dispositivo</th>
		        <th>Preço</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		    	<c:forEach var="sv" items="${listaServicos}">
			      <tr>
			        <td>${sv.id}</td>
			        <td>${sv.canal}</td>
			        <td>${sv.dispositivo}</td>
			        <td>${sv.calcularPreco()}</td>
			        <td><a href="/servico/${sv.id}/excluir">Excluir</a></td>
			      </tr>
			    </c:forEach>
		    </tbody>
		  </table>
	  </c:if>
	  
	  <c:if test="${empty listaServicos}">
	  		<h4>Não existem serviços cadastrados!</h4>
	  </c:if>
	  
	</div>
</body>
</html>