package Matrizes.Bidimensional;

import java.util.Random;

public class Exer01 {
    public static void main(String[] args) {
        Random valores = new Random();

        int v1 = valores.nextInt(9), v2 = valores.nextInt(9), v3 = valores.nextInt(9), v4 = valores.nextInt(9);
        int twoV1 = valores.nextInt(9), twoV2 = valores.nextInt(9), twoV3 = valores.nextInt(9), twoV4 = valores.nextInt(9);
        int threeV1 = valores.nextInt(9), threeV2 = valores.nextInt(9), threeV3 = valores.nextInt(9), threeV4 = valores.nextInt(9);
        int FourV1 = valores.nextInt(9), FourV2 = valores.nextInt(9), FourV3 = valores.nextInt(9), FourV4 = valores.nextInt(9); 

        int[][] M = {{v1,v2,v3,v4}, {twoV1,twoV2,twoV3,twoV4}, {threeV1,threeV2,threeV3,threeV4}, {FourV1,FourV2,FourV3,FourV4}};
        int Mvalor = M[0][0];
        int linhaMvalor = 0;
        int colunaMvalor = 0;
        int valor = 0;

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {

                //valores do Array;
                valor = M[i][j];

                //Algorítmo para descobrir o maior valor, sua coluna e linha;
                if (valor > Mvalor) {
                    Mvalor = valor;
                    linhaMvalor = i;
                    colunaMvalor = j;
                }    
            }
        }

        System.out.println("Maior valor: " + Mvalor + " linha: " + linhaMvalor + " coluna: " + colunaMvalor);
    }
}