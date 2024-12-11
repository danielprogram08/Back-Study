package Exceptions.Try_Catch;

public class Exemplo2 {
    public static void main(String[] args) {

        try {    

            int[] vetor = new int[4];
            vetor[4] = 1;
            System.out.println("Esse texto não será impresso!");

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Erro ao acessar um índice do vetor que não existe!");
        }

        System.out.println("Texto após a exception.");
    }
}
