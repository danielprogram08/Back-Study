package Exceptions.MultiplosCatch;

public class Catch3 {
    public static void main(String[] args) {

        int[] vetor = { 4, 8, 12, 16, 20 };
        int[] denom = { 2, 0, 4, 2 };

        for (int i = 0; i < vetor.length; i++) {
            try {
                System.out.println(vetor[i] + " / " + denom[i] + " = " + (vetor[i] / denom[i]));
            } catch (Throwable exception) {
                System.out.println("Erro na operação!");
            }
        }
    }
}
