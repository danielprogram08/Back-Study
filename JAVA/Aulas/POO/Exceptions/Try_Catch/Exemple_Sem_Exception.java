package Exceptions.Try_Catch;

public class Exemple_Sem_Exception {
    public static void main(String[] args) {

        int[] vetor = new int[4];

        System.out.println("Antes da excessão");

        vetor[4] = 1;

        System.out.println("Este texto não será executado");
    }
}
