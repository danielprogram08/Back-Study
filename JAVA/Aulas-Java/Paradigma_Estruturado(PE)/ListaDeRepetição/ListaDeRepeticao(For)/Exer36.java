import java.util.Scanner;

/*Num frigorífico existem 90 bois. Cada boi traz preso em seu pescoço um cartão
contendo seu número de identificação e seu peso. Fazer um algoritmo que escreva
o número e peso do boi mais gordo e do boi mais magro.
*/

public class Exer36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int  i,id, idGordo = 0, idMagro;
        double maisGordo = 0, maisMagro = 1000, peso;
         
        for(i = 1; i <= 5; i++){
            System.out.println(i + "- Digite o peso: ");
            peso = in.nextDouble();
            System.out.print("Identifição: ");
            id = in.nextInt();

            if (peso > maisGordo) {
                maisGordo = peso;
                idGordo = id;
            } if (peso < maisMagro) {
                maisMagro = peso;
                idMagro = id;
            }

        }
        System.out.println(idGordo + " é o boi mais gordo.");
    }
}
