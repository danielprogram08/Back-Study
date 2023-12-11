import java.util.Scanner;

//Faça um algoritmo que apresente a soma de todos os número inteiros até o número recebido pelo teclado.

public class Exer03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor, i, soma;
        System.out.println("Insira um valor: ");
        valor = in.nextInt();
        i = 0;
        soma = 0;
        while (i <= valor) {
            soma = soma + i;
            i++;
        }
        System.out.println("soma total: " + soma); 
    }
}
