package Map.AtvII;

public class ArrayUtils {

    public int somaArray (int[] numeros) {
        int soma = 0;
        int total = 0;
        for (int i : numeros) {
            total = soma+=i;
        }
        System.out.println(total);
        return total;
    }
}