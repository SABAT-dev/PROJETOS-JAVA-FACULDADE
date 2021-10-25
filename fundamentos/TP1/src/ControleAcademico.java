import java.util.Scanner;

public class ControleAcademico {
    private static String[] nomes;
    private static float[] nota1;
    private static float[] nota2;

    private final static int QUANTIDADE_ALUNOS = 100;
    private final static int QUANTIDADE_NOTAS = 2;

    private static void impressao(int posicao){
        System.out.println("\033[1;37m***********************************************************\033[m");
        System.out.printf("Posição - \033[1;37;40m{%d}\033[m | Nome - \033[1;37;40m%s\033[m" +
                        " | AV1 - \033[1;37;40m%.1f\033[m | AV2 - \033[1;37;40m%.1f\033[m | Média - \033[1;37;40m%.1f\033[m\n",
                posicao, nomes[posicao], nota1[posicao], nota2[posicao], calcularMedia(posicao));
        System.out.println("\033[1;37m***********************************************************\033[m");
    }

    private static float calcularMedia(int posicao){
        return (nota1[posicao] + nota2[posicao]) /  QUANTIDADE_NOTAS;
    }

    public static void main(String[] args){
        nomes = new String[QUANTIDADE_ALUNOS];
        nota1 = new float[QUANTIDADE_ALUNOS];
        nota2 = new float[QUANTIDADE_ALUNOS];
        Scanner input = new Scanner(System.in);

        String opcao = null;

        int index = 0;
        do {
            System.out.println("\033[1;35m*****************************************\033[m");
            System.out.println("\033[7;35;40m[1] Registrar as notas de um novo aluno.\033[m");
            System.out.println("\033[7;35;40m[2] Consultar boletim de um aluno.\033[m");
            System.out.println("\033[7;35;40m[3] Consultar notas da turma.\033[m");
            System.out.println("\033[7;35;40m[4] Sair.\033[m");
            System.out.println("\033[1;35m*****************************************\033[m");
            System.out.print("Informe uma das \033[4;36mopções\033[m acima: ");
            opcao = input.next();

            switch (opcao){
                case "1":
                    if(index < QUANTIDADE_ALUNOS) {
                        System.out.print("\nInforme o seu nome: ");
                        nomes[index] = input.next();

                        System.out.print("Informe a nota da AV1: ");
                        nota1[index] = input.nextFloat();

                        System.out.print("Informe a nota da AV2: ");
                        nota2[index] = input.nextFloat();

                        System.out.println("\n\033[1;35mREGISTRANDO ALUNO(A)...\033[m");
                        try {Thread.sleep(1500);} catch (Exception erro){}

                        System.out.printf("O aluno(a) foi \033[4;36mregistrado(a)\033[m com o código: \033[1;36m%d\033[m\n", index);
                        try {Thread.sleep(1500);} catch (Exception erro){}
                    } else {
                        System.out.println("\033[1;31mLIMITE EXCEDIDO! Não foi possível realizar novo registro de aluno.\033[m\n");
                        try {Thread.sleep(2000);} catch (Exception erro){}
                    }

                    index ++;
                    break;
                case "2":
                    System.out.print("Informe o código do aluno: ");
                    int codigo = input.nextInt();
                     if(codigo >=0 && codigo < index) {
                         //impressao(codigo);
                         System.out.println("\n\033[1;35mCONSULTANDO BOLETIM DO ALUNO(A)...\033[m\n");
                         try {Thread.sleep(1500);} catch (Exception erro){}
                     } else{
                         System.out.println("\n\033[1;31mCÓDIGO INVÁLIDO! Tente novamente.\033[m\n");
                         try {Thread.sleep(1500);} catch (Exception erro){}
                         System.exit(0);
                     }

                     System.out.printf("Nome do aluno: \033[1;36m%s\033[m \n", nomes[codigo]);
                     System.out.printf("Nota da AV1: \033[1;36m%.1f\033[m \n", nota1[codigo]);
                     System.out.printf("Nota da AV2: \033[1;36m%.1f\033[m \n", nota2[codigo]);
                     System.out.printf("Média final: \033[1;36m%.1f\033[m \n", calcularMedia(codigo));

                     if (calcularMedia(codigo) < 4 ) {
                         System.out.println("Situação: \033[4;31mReprovado(a)\033[m\n");
                     } else if (calcularMedia(codigo) >= 4 && calcularMedia(codigo) < 7){
                        System.out.println("Situação: \033[4;33mProva final\033[m\n");
                    }else{
                        System.out.println("Situação: \033[4;32mAprovado(a)\033[m\n");
                    }

                    break;
                case "3":
                    System.out.println("\n\033[1;35mCONSULTANDO NOTAS DA TURMA...\033[m\n");
                    try {Thread.sleep(1500);} catch (Exception erro){}

                    for (int z = 0; z  < index; z++) {
                        impressao(z);
                    }
                    break;
                case "4":
                    System.out.println("\n\033[1;35mSAINDO...\033[m\n");
                    try {Thread.sleep(1500);} catch (Exception erro){}
                    break;
                default:
                    System.out.println("\033[1;31mOPÇÃO INVÁLIDA!. Tente novamente.\033[m\n");
                    try {Thread.sleep(2000);} catch (Exception erro){}
                    break;
            }
        } while(!"4".equals(opcao));
        input.close();
    }
}