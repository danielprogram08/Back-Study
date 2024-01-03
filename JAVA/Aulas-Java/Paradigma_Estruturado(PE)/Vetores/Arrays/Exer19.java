package Vetores.Arrays;

import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float[] notas = new float[2];
        float[] result = new float[1];
        float media;
        int alunos = 1, ap = 0, rep = 0;

        do {
            System.out.print("Informe sua nota 1: ");
                notas[0] = in.nextFloat();
            System.out.print("Agora, informe sua nota 2: ");
                notas[1] = in.nextFloat();
            
            media = (notas[0] + notas[1]) / 2;

            result[0] = media;
                if (result[0] >= 6) {
                    System.out.println("Aprovado!");
                        ap++;
                } else if (result[0] <= 5) {
                    System.out.println("Reprovado!");
                        rep++;
                }

        alunos++;
        } while (alunos <= 10);

        System.out.println("Total de alunos aprovados: " + ap);
        System.out.println("Total de alunos reprovados: " + rep);
    }
}
