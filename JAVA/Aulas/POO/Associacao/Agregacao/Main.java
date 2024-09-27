package POO.Associacao.Composicao.Agregacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nome, matricula, turma = "ads";
        String[] alunos = new String[2];

        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Insira seu nome: ");
            nome = in.nextLine();
            System.out.print("Insira sua matricula: ");
            matricula = in.nextLine();
            System.out.println();

            Turma Turma = new Turma(turma, nome, matricula);
            alunos[i] = Turma.listarTurma();
        }

        System.out.println("Aluno1 \n" + alunos[0]);
        System.out.println();
        System.out.println("Aluno2 \n" + alunos[1]);
    }
}
