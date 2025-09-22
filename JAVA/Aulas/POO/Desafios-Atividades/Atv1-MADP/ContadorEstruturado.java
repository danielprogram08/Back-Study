public class ContadorEstruturado {
    public static void main(String[] args) {
        imprimirPares(10);
    }

    public static void imprimirPares(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}