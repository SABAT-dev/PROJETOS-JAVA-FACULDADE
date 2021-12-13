<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Plano</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<c:set var="botao" value=""/>

	<div class="container">
		<form action="/plano/incluir" method="post">		
			
			<h2>Cadastramento de Plano</h2>	

			<div class="form-group">
	    		<label>Duração do Plano:</label>
	   				<input type="text" class="form-control" placeholder="1 mês, 2 meses, 5 meses..." name="duracao" value="Minha Duração">
	  		</div>
			
			<div class="form-group">
			<c:if test="${not empty servicos}">
		      <label>Serviços:</label>
		      <c:forEach var="sv" items="${servicos}">
				<div class="form-check-inline">
				  <label class="form-check-label">
				    <input type="checkbox" class="form-check-input" name="servicoIds" value="${sv.id}"> ${sv.canal}
				  </label>
				</div>
			  </c:forEach>
			</c:if>  			
			<c:if test="${empty servicos}">
		      <label>Não existem serviços cadastrados!!!</label>	
		      <c:set var="botao" value="disabled"/>		
			</c:if>
			</div>
			
			<div class="form-group">
		    <c:if test="${not empty clientes}">
		      <label>Cliente:</label>
				<select class="form-control" name="cliente.id">
				  <c:forEach var="c" items="${clientes}">
					<option value="${c.id}">${c.nome}</option>
				  </c:forEach>
				</select>
			</c:if>
		    <c:if test="${empty clientes}">
		      <label>Não existem clientes cadastrados!!!</label>
		      <c:set var="botao" value="disabled"/>
		    </c:if>
			</div>
			
			<button ${botao} type="submit" class="btn btn-warning">Cadastrar</button>
		</form>
	</div>
</body>
</html>