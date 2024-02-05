import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int idade, tf = 0;
            int[] A = new int[3];

            for (int p = 1; p <= 3; p++) {
                System.out.println("insira a sua idade: ");
                    idade = in.nextInt();
                        if (idade > 35) {
                            tf++;
                        }
                for (int i = 0; i < A.length; i++) {
                    A[i] = idade;
                }
            }

            System.out.println("O número de pessoas que são maiores de 35 são: " + tf);
    }
}
