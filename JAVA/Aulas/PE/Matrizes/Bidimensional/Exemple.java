package Matrizes.Bidimensional;

public class Exemple {
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

        //Quebra de linha;
        System.out.println();

        //Imprimindo matrizes na tela;
        for (int i = 0; i < notaAlunos.length; i++) {

            for (int j = 0; j < notaAlunos[i].length; j++) {
                System.out.println(notaAlunos[i][j] + " ");
            }

            System.out.println();
        }
    }
}
