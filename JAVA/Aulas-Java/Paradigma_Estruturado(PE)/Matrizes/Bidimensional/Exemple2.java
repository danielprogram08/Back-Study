package Matrizes.Bidimensional;

public class Exemple2 {
    public static void main(String[] args) {

        double[][] notaAlunos = new double[2][4];

        //Nota do aluno 1;
        notaAlunos[0][0] = 10;
        notaAlunos[0][1] = 7;
        notaAlunos[0][2] = 8;
        notaAlunos[0][3] = 6;

        //Nota do aluno 2;
        notaAlunos[1][0] = 7;
        notaAlunos[1][1] = 9;
        notaAlunos[1][2] = 7;
        notaAlunos[1][3] = 10;

        notaAlunos[1][2] = 8;

        //Simplificado;
        double[][] notaAlunos2 = {{10,7,8,9.5}, {9,8,7,9}};

        //Quebra de linha;
        System.out.println();

        //Exemplo de manipulação da Matriz;
        double soma;
        for (int i = 0; i < notaAlunos.length; i++) {
            soma = 0;

            for (int j = 0; j < notaAlunos[i].length; j++) {
                soma += notaAlunos[i][j];
            }

            System.out.println("Média do aluno: " + i + " é = " + (soma/4));
        }
    }
}
