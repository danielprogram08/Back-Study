package POO.Associacao.agregacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nome, matricula, turma = "ads";
        String[] alunos = new String[2];

        for (int nAlunos = 0; nAlunos < alunos.length; nAlunos++) {
            System.out.println();
            System.out.print("Insira seu nome: ");
            nome = in.nextLine();
            System.out.print("Insira sua matricula: ");
            matricula = in.nextLine();
            System.out.println();

            Turma Turma = new Turma(turma, nome, matricula);
            Turma.removerTurma();
            alunos[nAlunos] = Turma.listarTurma();
        }

        System.out.println();
        System.out.println("Aluno1 \n" + alunos[0]);
        System.out.println();
        System.out.println("Aluno2 \n" + alunos[1]);

    }
}
