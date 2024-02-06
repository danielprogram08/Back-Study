package Loops.ForEach;

import java.util.Random;

public class Exemple {
    public static void main(String[] args) {

        //Array usando o For tradicional;
        int[] notas = new int[10];

        Random random = new Random();

        for (int i = 0; i < notas.length; i++) {
            
            notas[i] = random.nextInt(10);

        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println();
            System.out.println(notas[i]);
        }

        //Usando o ForEach;
        for (int nota : notas) {
            System.out.println(nota);
        }

        //Exemplo 2 com ForEach;
        int[][] notasAlunos = new int[1][4];
            notasAlunos[0][0] = 10;
            notasAlunos[0][1] = 9;
            notasAlunos[0][2] = 8;
            notasAlunos[0][3] = 7;

        for (int[] notasAluno : notasAlunos) {
            System.out.println();

            for (int nota : notasAluno) {
                System.out.println(nota);
            }
        }
    }
}
