import java.util.Random;
import java.util.Scanner;

public class Exer16 {
    public static void main(String[] args) {
        Random valores = new Random();
        Scanner in = new Scanner(System.in);
        int[] A = new int[10];
        int valorA,valor,valorL,valorL2;
        int soma,media,line,line2;
        int mquinze = 0, iquinze = 0, Mquinze = 0;

        do {
            System.out.print("insira um valor limite superior a 15: ");
            valor = in.nextInt();
                if (valor < 15) {
                    System.out.println("limite inválido! Tente novamente!");   
                }    
        } while (valor < 15);
        
            valorA = valores.nextInt(valor);

        // Gerando um índice aleatório dentro do intervalo do array    
        line = valores.nextInt(10);
        line2 = valores.nextInt(10);

        for (int count = 0; count < A.length; count++) {
            A[count] = valores.nextInt(valorA);
            System.out.println(A[count]);
                if (A[count] == 15) {
                    iquinze++;
                } else if (A[count] > 15) {
                    Mquinze++;
                }
        }

        // Acessando o valor na posição sorteada
        valorL = A[line];
        valorL2 = A[line2];

        soma = valorL + valorL2;
            if (soma < 15) {
                mquinze++;
            }

        System.out.println("Soma de elementos armazenados neste vetor que são inferiores a 15: " + mquinze);
        System.out.println("Quantidade de elementos que são iguais a 15: " + iquinze);
        System.out.println("A média dos elementos armazenados no vetor que são superiores a 15: " + Mquinze);
        
    }
}
