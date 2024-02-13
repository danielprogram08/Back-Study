import java.util.Random;

public class sorteio {
    public static void main(String[] args) {
        Random sorteio = new Random();
        int dado1, dado2, jogadas = 0, soma;
        while (jogadas < 10) {
            dado1 = sorteio.nextInt(10);
            System.out.println("Dado 1: " + dado1);
            dado2 = sorteio.nextInt(10);
            System.out.println("Dado 2: " + dado2);
            soma = dado1 + dado2;
            if (soma == 7) {
                System.out.println("Ganhei");
            }
            jogadas++;
        }
        System.out.println("Total de jogadas: " + jogadas);

    }
}
