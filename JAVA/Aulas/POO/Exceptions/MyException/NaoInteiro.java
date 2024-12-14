package Exceptions.MyException;

public class NaoInteiro {
    public static void main(String[] args) {
        int[] vetor = { 4, 8, 16, 21, 32, 64, 128 };
        int[] demon = { 2, 0, 4, 8, 0 };

        for (int i = 0; i < vetor.length; i++) {
            try {
                if (vetor[i] % 2 != 0) {
                    throw new NaoInteiroException(vetor[i], demon[i]);
                }
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NaoInteiroException e) {
                e.printStackTrace();
            }
        }
    }
}