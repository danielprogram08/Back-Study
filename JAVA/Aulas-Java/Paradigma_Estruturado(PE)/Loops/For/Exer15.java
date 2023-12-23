import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valorAnterior = 0, valorAtual = 1, fibonacci;

        for (int i = 1; i <= 10; i++) {
            fibonacci = valorAnterior + valorAtual;
            valorAnterior = valorAtual;
            valorAtual = fibonacci;
            System.out.println(fibonacci);
        }
    }
}