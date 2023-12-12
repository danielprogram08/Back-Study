package listaDecisao;

//5) Ler um número e dizer se ele é múltiplo de três

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //Ler um número;
        int valor;
        System.out.println("Insira um valor: ");
        valor = in.nextInt();
        
        //Dizer se ele é múltiplo de três;
        if(valor % 3 == 0){
            System.out.println("O valor inserido é múltiplo de 3.");
        } else {
            System.out.println("O valor inserido não é múltiplo de 3");
        }
    }
}
