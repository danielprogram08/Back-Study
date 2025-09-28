package Map.AtvVIII;

public class ArrayUtils {

    public double calcularMedia(int[] numeros) {
        double soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }

        double media = soma / numeros.length;
        System.out.println("\n A média dos números é: " + media);
        return media;
    }
}