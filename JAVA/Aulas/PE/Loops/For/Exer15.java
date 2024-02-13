public class Exer15 {
    public static void main(String[] args) {
        int valorAnterior = 0, valorAtual = 1, fibonacci;

        for (int i = 1; i <= 10; i++) {
            fibonacci = valorAnterior + valorAtual;
            valorAnterior = valorAtual;
            valorAtual = fibonacci;
            System.out.println(fibonacci);
        }
    }
}