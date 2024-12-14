package Exceptions.Stacktrace_Throws;

public class stackTrace {
    public static void main(String[] args) {
        int[] vetor = { 4, 8, 12, 16, 20 };
        int[] demon = { 2, 4, 0, 0 };

        for (int i = 0; i < vetor.length; i++) {
            try {
                System.out.println(vetor[i] + " / " + demon[i] + " = " + (vetor[i] / demon[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
