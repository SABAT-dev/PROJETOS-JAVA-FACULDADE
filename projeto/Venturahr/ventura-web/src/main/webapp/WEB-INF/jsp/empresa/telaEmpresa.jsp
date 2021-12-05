<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página de Empresa</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<form action="/login/autenticacaoE" method="get"> <!-- OLHAR O MÉTODO -->
			<h2>VenturaHR - Empresa</h2>
			<br>
			<h4>Bem vindo(a), empresário(a)</h4> <!-- OLHAR O NOME DE EMPRESA -->
			<hr>
			
<%-- 			<c:if test="${not empty cadastroLista}"> --%>
<%-- 				<h4>Lista de ${cadastroLista.size()} pessoa(s) cadastrada(s):</h4> --%>
				
<!-- 			  	<table class="table table-dark table-striped"> -->
<!-- 			    	<thead> -->
<!-- 			      		<tr> -->
<!-- 			      			<th>Cargo</th> -->
<!-- 			        		<th>Cidade</th> -->
<!-- 			        		<th>Forma de</th> -->
<!-- 			      		</tr> -->
<!-- 			    	</thead> -->
<!-- 			    	<tbody> -->
<%-- 			    		<c:forEach var="c" items="${cadastroLista}"> --%>
<!-- 				      		<tr> -->
<%-- 				      			<td>${c.id}</td> --%>
<%-- 				        		<td>${c.nome}</td> --%>
<%-- 				        		<td>${c.email}</td> --%>
<!-- 				      		</tr> -->
<%-- 			      		</c:forEach> --%>
<!-- 			    	</tbody> -->
<!-- 			  	</table> -->
<%-- 		  	</c:if> --%>
		  	
<%-- 		  	<c:if test="${empty cadastroLista}"> --%>
<!-- 		  		<h4>Não existem usuários cadastrados!</h4> -->
<%-- 		  	</c:if>			 --%>
			
			<hr>
			<button type="submit" class="btn btn-danger">Voltar</button>
		</form>
	</div>	
</body>
</html>