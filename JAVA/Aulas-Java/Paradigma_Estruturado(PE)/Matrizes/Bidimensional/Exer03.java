package Matrizes.Bidimensional;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ColV1,ColV2,ColV3;
        int Col2V1,Col2V2,Col2V3;
        int Col3V1,Col3V2,Col3V3;

        //Recebendo valores para o preenchimento da matriz;
        System.out.println("Coluna 1.");
        System.out.print("Insira um valor na linha 1: ");
            ColV1 = in.nextInt();
        System.out.print("Insira um valor na linha 2: ");
            ColV2 = in.nextInt();
        System.out.print("Insira um valor na linha 3: ");
            ColV3 = in.nextInt();
                System.out.println();

        System.out.println("Coluna 2.");
        System.out.print("Insira um valor na linha 1: ");
            Col2V1 = in.nextInt();
        System.out.print("Insira um valor na linha 2: ");
            Col2V2 = in.nextInt();
        System.out.print("Insira um valor na linha 3: ");
            Col2V3 = in.nextInt();
                System.out.println();

        System.out.println("Coluna 3.");
        System.out.print("Insira um valor na linha 1: ");
            Col3V1 = in.nextInt();
        System.out.print("Insira um valor na linha 2: ");
            Col3V2 = in.nextInt();
        System.out.print("Insira um valor na linha 3: ");
            Col3V3 = in.nextInt();
                System.out.println();

        //Preenchimento da matriz;
        int[][] M = {{ColV1, ColV2, ColV3}, {Col2V1, Col2V2, Col2V3}, {Col3V1, Col3V2, Col3V3}};
        int elemento = 0;
        int ElementosP = 0, ElementosI = 0;

        for (int coluna = 0; coluna < M.length; coluna++) {
            System.out.println();

            for (int linha = 0; linha < M.length; linha++) {
                elemento = M[coluna][linha];
                System.out.println("Coluna: " + coluna + " Linha: " + linha + " elemento: " + elemento);

                if (elemento % 2 == 0) {
                    ElementosP++;
                } else if (elemento % 2 == 1) {
                    ElementosI++;
                }
            }
        }

        System.out.println();
        System.out.println("Quantidade de elementos pares: " + ElementosP);
        System.out.println("Quantidade de elementos ímpares: " + ElementosI);
    }
}