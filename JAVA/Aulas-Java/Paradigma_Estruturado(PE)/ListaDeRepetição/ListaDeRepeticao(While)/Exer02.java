import java.util.Scanner;

//Faça o algoritmo definido acima apresentar somente os números pares.

public class Exer02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, valor;
        System.out.println("Insira um valor: ");
        valor = in.nextInt();
        i = 0;
        while (i <= valor) {
            if (i % 2 == 0) {
               System.out.print(i + " "); 
            } 
            i++;
        }
    }
}
