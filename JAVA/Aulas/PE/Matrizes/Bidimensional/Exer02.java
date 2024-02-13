package Matrizes.Bidimensional;

import java.util.Random;

public class Exer02 {
    public static void main(String[] args) {
        Random valores = new Random();
        
        int v1 = valores.nextInt(9), v2 = valores.nextInt(9), v3 = valores.nextInt(9), v4 = valores.nextInt(9);
        int twoV1 = valores.nextInt(9), twoV2 = valores.nextInt(9), twoV3 = valores.nextInt(9), twoV4 = valores.nextInt(9);
        int threeV1 = valores.nextInt(9), threeV2 = valores.nextInt(9), threeV3 = valores.nextInt(9), threeV4 = valores.nextInt(9);
        int FourV1 = valores.nextInt(9), FourV2 = valores.nextInt(9), FourV3 = valores.nextInt(9), FourV4 = valores.nextInt(9); 

        int[][] M = {{v1,v2,v3,v4}, {twoV1,twoV2,twoV3,twoV4}, {threeV1,threeV2,threeV3,threeV4}, {FourV1,FourV2,FourV3,FourV4}};
        int MvalorColuna2 = M[2][0];
        int mvalorColuna2 = M[0][0];
        int colunaMvalor = 0;
        int MvalorLinha3 = M[0][3];
        int mvalorLinha3 = M[0][0];
        int linhaMvalor = 0;
        int valor = 0;
        int valor2 = 0;

        for (int coluna = 0; coluna < M.length; coluna++) {
            System.out.println();

            for (int linha = 0; linha < M.length; linha++) {
                valor = M[2][linha];
                valor2 = M[coluna][3];

                System.out.println("Coluna: " + coluna + " linha: " + linha + " elemento: " + M[coluna][linha]);

                if (valor > MvalorColuna2) {
                    MvalorColuna2 = valor;
                } else if (valor < MvalorColuna2) {
                    mvalorColuna2 = valor;
                }

                if (valor2 > MvalorLinha3) {
                    MvalorLinha3 = valor2;
                } else if (valor2 < mvalorLinha3) {
                    mvalorLinha3 = valor2;
                }
            }

        }

        System.out.println();

        System.out.println("Maior valor da coluna 2 é: " + MvalorColuna2 + ". Já o menor valor da coluna 2 é: " + mvalorColuna2);
            System.out.println();

        System.out.println("Maior valor da linha 3 é: " + MvalorLinha3 + ". Já o menor valor da linha 3 é: " + mvalorLinha3);
    }

}
