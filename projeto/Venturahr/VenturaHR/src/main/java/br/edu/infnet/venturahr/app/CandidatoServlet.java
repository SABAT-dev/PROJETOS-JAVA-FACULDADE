
package br.edu.infnet.venturahr.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang.StringUtils;

@WebServlet(name = "CandidatoServlet", urlPatterns = {"/CandidatoServlet"})
public class CandidatoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"ISO-8859-1\">");
		out.println("<title>Página de Confirmação</title>");
		out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">");
		out.println("</head>");
		out.println("<body>");       
				
		//PASSO 1 - OBTEM OS DADOS DO FORMULÁRIO
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		String confirma = request.getParameter("confirma");
		String cpf = request.getParameter("cpf");
				
		//PASSO 2 - VALIDA OS DADOS DO FORMULÁRIO
                List<String> erros = new ArrayList<String>();
                                
		if(StringUtils.isBlank(nome)) {
                    erros.add("O campo NOME é obrigatório!");
		}
		if(StringUtils.isBlank(endereco)) {
                    erros.add("O campo ENDEREÇO é obrigatório!");
                }				
                if(StringUtils.isBlank(telefone)) {
                    erros.add("O campo TELEFONE é obrigatório!");
                }
                if(StringUtils.isNumeric(telefone)) {
                    erros.add("O campo TELEFONE precisa ser numérico!");
                }				
                if(StringUtils.isBlank(email)) {
                    erros.add("O campo E-MAIL é obrigatório!");
                }
                if(StringUtils.isBlank(senha)) {
                    erros.add("O campo SENHA é obrigatório!");
                }
                if(StringUtils.isBlank(confirma)) {
                    erros.add("O campo CONFIRMAR SENHA é obrigatório!");
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
                    out.println("<h3>Trate os seguintes erros:</h3>");
                    for (String erro : erros) {
                        out.println("<div class=\"alert alert-danger\">\r\n"
				    + "  <strong>ERRO!</strong>" + erro + ""
				    + "</div>");	
                    }
		}
		out.println("</body>\r\n");
		out.println("</html>");
        } finally {
            out.close();
        }
    }
}
