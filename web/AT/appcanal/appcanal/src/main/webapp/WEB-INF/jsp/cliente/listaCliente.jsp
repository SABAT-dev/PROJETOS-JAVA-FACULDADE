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
	
	  <a href="/cliente">Cadastrar Novo Cliente</a>
	  
	  <hr>
	  
	  <c:if test="${not empty mensagem}">
			<div class="alert alert-danger">
				 <strong>Atenção!</strong> ${mensagem}
			</div>	  
	  </c:if>	
	    
	  <c:if test="${not empty nome}">
			<div class="alert alert-success">
				 <strong>Confirmação!</strong> Cliente ${nome} cadastrado(a) com sucesso!!!
			</div>	  
	  </c:if>
	  
	  
	  <c:if test="${not empty listaClientes}">	  
		  <h4>Listagem de Clientes - ${listaClientes.size()}</h4>
		  
		  <table class="table table-dark table-striped">
		    <thead>
		      <tr>
		        <th>#</th>
		        <th>Nome</th>
		        <th>Status</th>
		        <th>Tela</th>
		        <th>Usuário</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		    	<c:forEach var="c" items="${listaClientes}">
			      <tr>
			        <td>${c.id}</td>
			        <td>${c.nome}</td>
			        <td>${c.status}</td>
			        <td>${c.tela}</td>
			        <td>${c.usuario.nome}</td>
			        <td><a href="/cliente/${c.id}/excluir">Excluir</a></td>
			      </tr>
			    </c:forEach>
		    </tbody>
		  </table>
	  </c:if>
	  
	  <c:if test="${empty listaClientes}">
	  		<h4>Não existem clientes cadastrados!</h4>
	  </c:if>
	  
	</div>
</body>
</html>