package tp3;

import constantes.Constante;
import excecoes.NomeIncompletoExcecao;
import excecoes.NumeroNomeExcecao;
import pessoa.Aluno;
import pessoa.Pessoa;
import pessoa.Professor;

import java.util.Scanner;

public class ControleAcademico3 {
    public static Scanner input = new Scanner(System.in);
    public static Constante constante = new Constante();

    public static void menu() {
        System.out.println("[1] Cadastrar Professor");
        System.out.println("[2] Cadastrar Aluno");
        System.out.println("[3] Consultar situação de um docente/discente.");
        System.out.println("[4] Sair");
        System.out.print("Informe uma das opções acima: ");
    }

    public static Professor cadastrarProfessor() throws NomeIncompletoExcecao, NumberFormatException, NumeroNomeExcecao {
        Professor professor = new Professor();
        System.out.print("Informe o nome: ");
        professor.setNome(input.nextLine().trim()); // Acessa e chama NomeIncompletoExcecao

        System.out.print("Informe a idade: ");
        professor.setIdade(Integer.valueOf(input.nextLine()));

        System.out.print("Informe a disciplina: ");
        professor.setDisciplina(input.nextLine().trim());

        System.out.print("Informe o salário: ");
        professor.setSalario(Double.valueOf(input.nextLine()));
        return professor;
    }

    public static Aluno cadastrarAluno() throws NomeIncompletoExcecao, NumberFormatException, NumeroNomeExcecao  {
        Aluno aluno = new Aluno();
        System.out.print("\nInforme o nome: ");
        aluno.setNome(input.nextLine().trim()); // Acessa e chama NomeIncompletoExcecao

        System.out.print("Informe a idade: ");
        aluno.setIdade(Integer.valueOf(input.nextLine()));

        System.out.print("Informe o período: ");
        aluno.setPeriodo(input.nextLine().trim());

        System.out.print("Informe a AV1: ");
        aluno.setNota1(Double.valueOf(input.nextLine()));

        System.out.print("Informe a AV2: ");
        aluno.setNota2(Double.valueOf(input.nextLine()));
        return aluno;
    }

    public static void main(String[] args)  {
        Pessoa[] pessoas = new Pessoa[constante.QUANTIDADE_PESSOAS];
        String opcao = new String("null");
        int index = 0;

        do {
            menu();
            opcao = input.nextLine();
            System.out.println();

            switch (opcao) {
                case "1":
                    if(index < constante.QUANTIDADE_PESSOAS) {
                        try {
                            pessoas[index] = cadastrarProfessor();
                            System.out.printf("O professor(a) foi registrado(a) com o código: [%d]\n", index);
                            index++;
                        } catch (NomeIncompletoExcecao | NumeroNomeExcecao e) {
                            System.out.println(e.getMessage());
                        } catch (NumberFormatException e) {
                            System.out.println("DEVE SER UM NÚMERO!.");
                        }

                    }else {
                        System.err.println("LIMITE EXCEDIDO de doscentes/discentes no sistema!.");
                    }

                    System.out.println();
                    break;

                case "2":
                    if(index < constante.QUANTIDADE_PESSOAS) {
                        try {
                            pessoas[index] = cadastrarAluno();
                            System.out.printf("O(A) aluno(a) foi registrado(a) com o código: [%d]\n", index);
                            index++;
                        } catch (NomeIncompletoExcecao | NumeroNomeExcecao e) {
                            System.out.println(e.getMessage());
                        }

                    }else {
                        System.err.println("\nLIMITE EXCEDIDO de doscentes/discentes no sistema!.\n");
                    }
                    System.out.println();
                    break;

                case "3":
                    try {
                        System.out.print("Informe o código do docente/dicente: \n");
                        int codigo = Integer.valueOf(input.nextLine());
                        pessoas[codigo].consultarSituacao();
                    } catch(ArrayIndexOutOfBoundsException | NumberFormatException | NullPointerException  e) {
                        System.err.println("\nCÓDIGO INVÁLIDO! Tente novamente.\n");
                    }finally {
                        System.out.println("\nRETORNANDO AO MENU...\n");
                        System.out.println();
                    }
                    break;

                case "4":
                    System.out.println("\nSAINDO...\n");
                    break;

                default:
                    System.err.println("\nOPÇÃO INVÁLIDA!. Tente novamente.\n");
                    break;
            }
        }while(!"4".equals(opcao));

    }
}
