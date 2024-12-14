package Exceptions.Try_Catch.Finally;

public class Exemplo {
    public static void main(String[] args) {
        int[] vetor = { 8, 16, 24, 32, 40, 48 };
        int[] denom = { 2, 4, 6, 0, 0 };

        for (int i = 0; i < vetor.length; i++) {
            try {
                System.out.println(vetor[i] + " / " + denom[i] + " = " + (vetor[i] / denom[i]));
            } catch (java.lang.ArithmeticException e) {
                System.out.println("Erro ao dividir por zero!");
            } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro ao dividir por índice do vetor inexistente!");
            } finally {
                System.out.println("Esta mensagem será exibida após o bloco try ou catch!");
            }
        }
    }
}
