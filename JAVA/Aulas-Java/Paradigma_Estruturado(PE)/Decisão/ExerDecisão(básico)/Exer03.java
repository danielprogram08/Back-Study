package listaDecisao;

import java.util.Scanner;

/*3) Criar um algoritmo que leia dois números e imprimir uma mensagem dizendo se são 
iguais ou diferentes.*/
public class Exer03 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       //Dois números inteiros;
       int valor1, valor2;
        System.out.println("Insira o valor1: ");
        valor1 = in.nextInt();
        System.out.println("Insira o valor2: ");
        valor2 = in.nextInt();
        
        //São iguais ou Diferentes ?
        if (valor1 == valor2){
            System.out.println("Os valores inseridos são iguais.");
        } else if (valor1 > valor2){
            System.out.println("O valor 1 é maior que o valor 2.");
        } else {
            System.out.println("Os valores são diferentes.");
        }
    }
}
