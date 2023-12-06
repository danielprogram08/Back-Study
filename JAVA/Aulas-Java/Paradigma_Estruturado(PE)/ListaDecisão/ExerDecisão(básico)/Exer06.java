package listaDecisao;

//6) Faça um algoritmo que receba um número e informe se ele é par ou ímpar.

import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //recebendo um número;
        int valor;
        System.out.println("Insira um valor: ");
        valor = in.nextInt();
        
        //Informe se ele é par ou impar;
        if (valor % 2 == 0){
            System.out.println("O valor inserido é par.");
        } else {
            System.out.println("O valor inserido é impar.");
        }
    }
}
