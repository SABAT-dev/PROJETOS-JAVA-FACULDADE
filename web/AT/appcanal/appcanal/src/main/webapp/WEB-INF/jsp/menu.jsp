<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

	<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="/app">App IPTV</a>
	    </div>
	    
	    <ul class="nav navbar-nav">
	      <li class="active"><a href="/home">Home</a></li>
	      
	      <c:if test="${not empty user}"> 
	      	<li><a href="/usuarios">Usuário</a></li>     
	      	<li><a href="/clientes">Cliente</a></li>
	      	<li><a href="/filmes">Filme</a></li>
	      	<li><a href="/series">Série</a></li>
	      	<li><a href="/esportes">Esporte</a></li>
	      	<li><a href="/servicos">Serviço</a></li>
	      	<li><a href="/planos">Plano</a></li>
	      </c:if>
	    </ul>
	    
	    <ul class="nav navbar-nav navbar-right">
	      <c:if test="${empty user}">
	      	<li><a href="/usuario"><span class="glyphicon glyphicon-user"></span> Cadastrar</a></li>
	      </c:if>
	      
	      <c:if test="${empty user}">
	      	<li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
		  </c:if>
		  
	      <c:if test="${not empty user}">
	      	<li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Sair, ${user.nome}</a></li>
	      </c:if>
	    </ul>
	  </div>
	</nav>
