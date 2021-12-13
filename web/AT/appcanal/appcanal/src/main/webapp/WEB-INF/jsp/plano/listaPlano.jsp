<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="br.edu.infnet.appcanal.model.domain.Cliente"%>
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
	
	  <a href="/plano">Cadastrar Novo Plano</a>
	  
	  <hr>

	  <c:if test="${not empty mensagem}">
			<div class="alert alert-danger">
				 <strong>Atenção!</strong> ${mensagem}
			</div>	  
	  </c:if>
	  
	  <c:if test="${not empty duracaoPlano}">
			<div class="alert alert-success">
				 <strong>Confirmação!</strong> Duração do plano de ${duracaoPlano} cadastrado com sucesso!!!
			</div>	  
	  </c:if>
	  
	  
	  <c:if test="${not empty listaPlanos}">	  
		  <h4>Listagem de Planos - ${listaPlanos.size()}</h4>
		  
		  <table class="table table-dark table-striped">
		    <thead>
		      <tr>
		        <th>#</th>
		        <th>Duração do Plano</th>
		        <th>Cliente</th>		     
		        <th>Serviços</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		    	<c:forEach var="p" items="${listaPlanos}">
			      <tr>
			        <td>${p.id}</td>
			        <td>${p.duracaoPlano}</td>
			        <td>${p.cliente.nome}</td>			        
			        <td>${p.servicos.size()}</td>
			        <td><a href="/plano/${p.id}/excluir">Excluir</a></td>
			      </tr>
			    </c:forEach>
		    </tbody>
		  </table>
	  </c:if>
	  
	  <c:if test="${empty listaPlanos}">
	  		<h4>Não existem planos cadastrados!</h4>
	  </c:if>
	  
	</div>
</body>
</html>