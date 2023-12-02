import java.util.Scanner;

//Entrar com 15 números e imprimir a raiz quadrada de cada número.
public class Exer13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num, i;
        double raiz;

        System.out.println("Insira um valor: ");
        num = in.nextInt();
        raiz = Math.sqrt(num);

        System.out.println("Sua raiz é: " + raiz);
    }
}
