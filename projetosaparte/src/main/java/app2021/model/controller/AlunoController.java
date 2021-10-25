package app2021.model.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app2021.model.domain.Aluno;

public class AlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AlunoController() {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Estou no doGet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Aluno aluno = new Aluno(request.getParameter("nome"), request.getParameter("email"));
		aluno.setEscolaridade(request.getParameter("escolaridade"));
		aluno.setDisciplinas(request.getParameterValues("disciplinas"));
		aluno.setRegiao(request.getParameter("regiao"));
		aluno.impressao();
		
		request.getRequestDispatcher("confirmation.html").forward(request, response);
	}
}
