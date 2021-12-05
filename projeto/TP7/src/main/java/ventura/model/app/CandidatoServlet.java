package ventura.model.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

@WebServlet("/cadastro-candidato")
public class CandidatoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html:charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Página de Cadastro</title>\r\n"
				+ "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n"
				+ "</head>\r\n"
				+ "<body>"
				+ "		<div class=\"container\">\r\n"
				+ "		<form action=\"confirmacao.html\" method=\"post\">\r\n"
				+ "			<h3>Cadastramento de Candidato</h3>\r\n"
				+ "			\r\n"
				+ "			<div class=\"form-group\">\r\n"
				+ "				<label>Nome:</label>\r\n"
				+ "				<input type=\"text\" class=\"form-control\" placeholder=\"Digite o seu nome\" name=\"nome\">\r\n"
				+ "			</div>\r\n"
				+ "				\r\n"
				+ "			<div class=\"form-group\">\r\n"
				+ "				<label>Endereço:</label>\r\n"
				+ "				<input type=\"text\" class=\"form-control\" placeholder=\"Digite o seu endereço\" name=\"endereco\">\r\n"
				+ "			</div>\r\n"
				+ "	\r\n"
				+ "			<div class=\"form-group\">\r\n"
				+ "				<label>Telefone:</label>\r\n"
				+ "				<input type=\"text\" class=\"form-control\" placeholder=\"(99)99999-9999\" name=\"telefone\">\r\n"
				+ "			</div>\r\n"
				+ "			\r\n"
				+ "			<div class=\"form-group\">\r\n"
				+ "				<label>Email:</label>\r\n"
				+ "				<input type=\"email\" class=\"form-control\" placeholder=\"Digite o seu email\" name=\"email\">\r\n"
				+ "			</div>\r\n"
				+ "\r\n"
				+ "			<div class=\"form-group\">\r\n"
				+ "				<label>Senha:</label>\r\n"
				+ "				<input type=\"password\" class=\"form-control\" placeholder=\"Digite a sua senha\" name=\"senha\">\r\n"
				+ "			</div>\r\n"
				+ "\r\n"
				+ "			<div class=\"form-group\">\r\n"
				+ "				<label>Confirma Senha:</label>\r\n"
				+ "				<input type=\"password\" class=\"form-control\" placeholder=\"Digite novamente a senha\" name=\"confirma\">\r\n"
				+ "			</div>\r\n"
				+ "\r\n"
				+ "			<div class=\"form-group\">\r\n"
				+ "				<label>CPF:</label>\r\n"
				+ "				<input type=\"text\" class=\"form-control\" placeholder=\"000.000.000-00\" name=\"cpf\">\r\n"
				+ "			</div>			\r\n"
				+ "			\r\n"
				+ "			<hr>\r\n"
				+ "			\r\n"
				+ "			<button type=\"submit\" class=\"btn btn-danger\">Criar Conta</button>\r\n"
				+ "		</form>\r\n"
				+ "	</div>\r\n");
				
				//PASSO 1 - OBTEM OS DADOS DO FORMULÁRIO
				String nome = request.getParameter("nome");
				String endereco = request.getParameter("endereco");
				String telefone = request.getParameter("telefone");
				String email = request.getParameter("email");
				String senha = request.getParameter("senha");
				String confirma = request.getParameter("confirma");
				String cpf = request.getParameter("cpf");
				
				//PASSO 2 - VALIDA OS DADOS DO FORMULÁRIO
				ArrayList<String> erros = new ArrayList<String>();
				
				if(StringUtils.isBlank(nome)) {
					erros.add("O campo nome é obrigatório!");
				}
				if(StringUtils.isBlank(endereco)) {
					erros.add("O campo endereço é obrigatório!");
				}
				
				if(StringUtils.isBlank(telefone)) {
					erros.add("O campo telefone é obrigatório!");
				}
				if(StringUtils.isBlank(telefone) && StringUtils.isNumeric(telefone)) {
					erros.add("O campo telefone precisa ser numérico!");
				}
				
				if(StringUtils.isBlank(email)) {
					erros.add("O campo email é obrigatório!");
				}
				if(StringUtils.isBlank(senha)) {
					erros.add("O campo senha é obrigatório!");
				}
				if(StringUtils.isBlank(confirma)) {
					erros.add("O campo confirmar senha é obrigatório!");
				}
				
				if(StringUtils.isBlank(cpf)) {
					erros.add("O campo CPF é obrigatório!");
				}
				if(StringUtils.isBlank(cpf) && StringUtils.isNumeric(cpf)) {
					erros.add("O campo CPF precisa ser numérico!");
				}
				
				//PASSO 3 - PROCESSAR A REQUISIÇÃO (ACESSA O BANCO)

				//PASSO 4 - GERAR O CÓDIGO DE RESPOSTA
				if(erros.isEmpty()) {
					out.println("<div class=\"alert alert-success\">\r\n"
							+ "  <strong>SUCESSO!</strong> O usuário " + nome + " foi cadastrado com sucesso!.\r\n"
							+ "</div>");
				} else {
					out.println("<div class=\"alert alert-danger\">\r\n"
							+ "  <strong>ERRO!</strong>" + erros + ""
							+ "</div>");	
				}
			
							
		out.println("</body>\r\n");
		out.println("</html>");
	}

}
