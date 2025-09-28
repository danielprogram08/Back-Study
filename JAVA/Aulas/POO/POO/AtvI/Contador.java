package Map.AtvI;

public class Contador {

    public int imprimirPares(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) { System.out.println(i); }
        }
        return n;
    }
}