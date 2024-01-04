package Vetores.Arrays;

import java.util.Random;

public class Exer16 {
    public static void main(String[] args) {
        Random valores = new Random();
        int valor,soma;

        valor = valores.nextInt(10);
        int[] A = {valor, valor, valor, valor, valor, valor, valor, valor, valor, valor};

        soma = ((A[0] + A[1]) + (A[2] + A[3]) + (A[4] + A[5]));
    }
}
