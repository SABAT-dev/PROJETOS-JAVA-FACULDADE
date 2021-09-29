package tp2;

import constantes.Constante;
import pessoa.Aluno;
import pessoa.Pessoa;
import pessoa.Professor;
import java.util.Scanner;

public class ControleAcademico2 {
    public static Scanner input = new Scanner(System.in);
    public static Professor cadastrarProfessor() {
        Professor professor = new Professor();
        System.out.print("\nInforme o nome: ");
        professor.setNome(input.next());

        System.out.print("Informe a idade: ");
        professor.setIdade(input.nextInt());

        System.out.print("Informe a disciplina: ");
        professor.setDisciplina(input.next());

        System.out.print("Informe o salário: ");
        professor.setSalario(input.nextDouble());
        return professor;
    }

    public static Aluno cadastrarAluno(){
        Aluno aluno = new Aluno();
        System.out.print("\nInforme o nome: ");
        aluno.setNome(input.next());

        System.out.print("Informe a idade: ");
        aluno.setIdade(input.nextInt());

        System.out.print("Informe o período: ");
        aluno.setPeriodo(input.next());

        System.out.print("Informe a AV1: ");
        aluno.setNota1(input.nextDouble());

        System.out.print("Informe a AV2: ");
        aluno.setNota2(input.nextDouble());
        return aluno;
    }

    public static void main(String[] args){
        Constante constante = new Constante();

        Pessoa[] pessoas = new  Pessoa[constante.QUANTIDADE_PESSOAS];
        String opcao = null;
        int index = 0;

        do {
            System.out.println("\033[1;35m*****************************************\033[m");
            System.out.println("\033[[1] Cadastrar professor.");
            System.out.println("\033[[2] Cadastrar aluno.");
            System.out.println("\033[[3] Consultar situação de um docente/discente.");
            System.out.println("\033[[4] Sair.");
            System.out.println("\033[1;35m*****************************************\033[m");
            System.out.print("Informe uma das opções acima: ");
            opcao = input.next();

            switch (opcao) {
                case "1": //CADASTRAR PROFESSOR
                    if (index < constante.QUANTIDADE_PESSOAS) {
                        pessoas[index] = cadastrarProfessor();
                        System.out.println("\nREGISTRANDO PROFESSOR(A)...");
                        try {
                            Thread.sleep(1500);
                        } catch (Exception erro) {
                        }

                        System.out.printf("O professor(a) foi registrado(a) com o código: %d\n", index);
                        try {
                            Thread.sleep(1500);
                        } catch (Exception erro) {
                        }
                    } else {
                        System.out.println("LIMITE EXCEDIDO de doscentes/discentes no sistema!.");
                        try {
                            Thread.sleep(2000);
                        } catch (Exception erro) {
                        }
                    }
                    index++;
                    break;
                case "2": //CADASTRAR ALUNO
                    if (index < constante.QUANTIDADE_PESSOAS) {
                        pessoas[index] = cadastrarAluno();
                        System.out.println("\nREGISTRANDO ALUNO(A)...");
                        try {
                            Thread.sleep(1500);
                        } catch (Exception erro) {
                        }
                        System.out.printf("O aluno(a) foi registrado(a) com o código: %d\n", index);
                        try {
                            Thread.sleep(1500);
                        } catch (Exception erro) {
                        }
                    } else {
                        System.out.println("LIMITE EXCEDIDO de doscentes/discentes no sistema!.");
                        try {
                            Thread.sleep(2000);
                        } catch (Exception erro) {
                        }
                    }
                    index++;
                    break;
                case "3": //CONSULTAR
                    System.out.print("Informe o código do docente/dicente: \n");
                    int codigo = input.nextInt();
                    if (codigo >= 0 && codigo < index) {
                        pessoas[codigo].consultarSituacao();
                        System.out.println("\nCONSULTANDO DOCENTE/DICENTE\n");
                        try {
                            Thread.sleep(1500);
                        } catch (Exception erro) {
                        }
                    } else {
                        System.out.println("\nCÓDIGO INVÁLIDO! Tente novamente.\n");
                        try {
                            Thread.sleep(1500);
                        } catch (Exception erro) {
                        }
                        System.exit(0);
                    }
                    break;
                case "4":
                    System.out.println("\nSAINDO...\n");
                    try {
                        Thread.sleep(1500);
                    } catch (Exception erro) {
                    }
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!. Tente novamente.\n");
                    try {
                        Thread.sleep(2000);
                    } catch (Exception erro) {
                    }
                    break;
            }
        } while(!"4".equals(opcao));
        input.close();
    }
}
