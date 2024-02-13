import java.util.Scanner;

//Faça um algoritmo que apresente todos os números de 0 ao número recebido pelo teclado.

public class Exer01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, valor;
        System.out.println("Insira um valor: ");
        valor = in.nextInt();
        i = 0;
        while(i <= 10) {
            System.out.print(i + " ");
            i++;
        }
    }
}
