package Map.AtvVI;

public class ArrayUtils {
    
    public int[] inverterArray(int[] numeros) {
        int[] novoArray = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            novoArray[i] = numeros[numeros.length - 1 - i];
            System.out.println("\n" + novoArray[i]);
        }

        return novoArray;

    }
}