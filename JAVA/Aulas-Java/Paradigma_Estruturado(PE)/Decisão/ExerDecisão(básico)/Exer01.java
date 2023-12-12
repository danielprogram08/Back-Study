
package listaDecisao;

/*1) Receba dois números pelo teclado, some os dois. Se o resultado for maior que 10 
mostre a soma no vídeo;*/

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        //Valores:
        int soma, valorA, valorB;
        System.out.print("Insira o valor A: ");
        valorA = in.nextInt();
        System.out.print("Insira o valor B: ");
        valorB = in.nextInt();
        
        //Soma
        soma = (valorA + valorB);
        System.out.println("A soma dos valores inseridos é: " + soma);
        
        //Se o resultado for maior que 10 mostre a soma na tela;
        if (soma > 10){
            System.out.println("A soma é maior que 10");
        } else {
            System.out.println("A soma não é maior que 10");
        }
    }
}
