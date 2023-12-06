package listaDecisao;

import java.util.Scanner;

/*14)Entrar com um número e imprimir uma das mensagens: maior do que 20, igual a 20 
ou menor do que 20.*/


public class Exer15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //Entrar com um valor;
        int valor;
        System.out.println("Insira um valor: ");
        valor = in.nextInt();
        
        //imprimir uma das mensagens: maior do que 20, igual a 20 ou menor do que 20.
        if (valor > 20){
            System.out.println("O valor inserido é maior do que 20.");
        } else if (valor == 20) {
            System.out.println("O valor inserido é igual a 20.");
        } else {
            System.out.println("O valor inserido é menor do que 20.");
        }
    }
    
}
