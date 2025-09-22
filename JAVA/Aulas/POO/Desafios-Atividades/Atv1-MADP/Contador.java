public class Contador {
    private int N;

    public int imprimirPares(int n) {
        this.N = n;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        return N;
    }
}