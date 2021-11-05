
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página de Login</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<form action="" method="post">
			<h3>Login</h3>
						
			<div class="form-group">
				<label>Email:</label>
				<input type="email" class="form-control" placeholder="Digite o seu email" name="email">
			</div>
						
			<div class="form-group">
				<label>Senha:</label>
				<input type="password" class="form-control" placeholder="Digite a sua senha" name="senha">
			</div>
			
			<button type="submit" class="btn btn-danger">Logar</button>
			
			<hr>
		</form>
		
		<h5>Cadastre-se em nosso site:</h5>
		
		<div class="cadastro-link">
			<a href="cadastroCandidato.jsp">Conta candidato</a>
		</div>
		
		<div class="cadastro-link">
			<a href="cadastroEmpresa.jsp">Conta empresa</a>
		</div>		
	</div>
</body>
</html>