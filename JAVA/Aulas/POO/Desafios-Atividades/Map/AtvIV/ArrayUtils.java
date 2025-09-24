package Map.AtvIV;

public class ArrayUtils {

    public int MaiorValor(int[] numeros) {
        int maior = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) { maior = numeros[i]; }
        }

        System.out.println("O maior valor é: " + maior + ".");

        return maior;
    }
}