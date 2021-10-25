package br.edu.infnet.model.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.infnet.model.domain.Cadastro;

public class CadastroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private List<Cadastro> cadastroLista;
       
    public CadastroController() {
    	cadastroLista = new ArrayList<Cadastro>();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("home.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cadastro cadastro = new Cadastro(request.getParameter("nome"),
				request.getParameter("email"),
				request.getParameter("senha"));
		
		cadastroLista.add(cadastro);
		
		PrintWriter prinout = response.getWriter();
		
		prinout.println("<!DOCTYPE html>"
				+ "<html>"
				+ "<head>"
				+ "<meta charset=\"ISO-8859-1\">"
				+ "<title>Página de Confirmação</title>"
				+ "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">"
				+ "</head>"
				+ "<body>"
				+ "	<div class=\"container\">"
				+ "		<form action=\"cadastro\" method=\"get\">"
				+ "			<h2>" + cadastro.getNome() + " cadastrado(a) com sucesso!</h2>"
				+ "			<button type=\"submit\" class=\"btn btn-success\">Voltar</button>"
				+ "		</form>");
		
		prinout.println("<hr>");
		prinout.println("<h4>Lista de " + cadastroLista.size() + " pessoa(s) cadastrada(s):<h4>");
		
		for (Cadastro cadastrados : cadastroLista) {
			prinout.println("<h5>Nome: " 
					+cadastrados.getNome() + " | E-mail: "
					+ cadastrados.getEmail() + " | Senha: "
					+ cadastrados.getSenha() + "</h5>");
		}
		
		prinout.println("</div>"
				+ "</body>"
				+ "</html>");

/*		request.getRequestDispatcher("confirmation.html").forward(request, response);*/
	}

}
