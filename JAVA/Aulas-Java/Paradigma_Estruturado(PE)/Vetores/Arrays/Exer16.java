package Vetores.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Exer16 {
    public static void main(String[] args) {
        Random valores = new Random();
        Scanner in = new Scanner(System.in);
        int[] A = new int[10];
        int[] position = new int[2];
        int valorA,valor,soma,media;
        int mquinze = 0, i = 0, iquinze = 0, Mquinze = 0;

        System.out.print("insira um valor limite: ");
            valor = in.nextInt();
            valorA = valores.nextInt(valor);

        for (int count = 0; count < A.length; count++) {
            A[count] = valores.nextInt(valorA);
            
        }

        //System.out.println("Soma de elementos armazenados neste vetor que são inferiores a 15: " + mquinze);
        //System.out.println("Quantidade de elementos que são iguais a quinze: " + iquinze);
        //System.out.println("A média dos elementos armazenados no vetor que são superiores a 15: " + Mquinze);
        
    }
}
