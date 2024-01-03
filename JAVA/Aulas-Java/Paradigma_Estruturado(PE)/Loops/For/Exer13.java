import java.util.Scanner;

//Entrar com 15 números e imprimir a raiz quadrada de cada número.
public class Exer13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor, raiz, mul;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Insira uma raiz: ");
                valor = in.nextInt();
            
            raiz = (valor * valor);

            System.out.println("Elemento da raiz inserida: " + raiz);

        }
    }
}
