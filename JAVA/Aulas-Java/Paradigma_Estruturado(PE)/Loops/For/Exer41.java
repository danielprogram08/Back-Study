import java.util.Scanner;

public class Exer41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double altura, altM = 0, MediaMu = 1, maiorAltura = 0, menorAltura = 300;
        char sexo;
        int i, contF = 0, contM = 0;

        for (i = 0; i < 5; i++) {
        System.out.println("Insira sua altura: ");
            altura = in.nextDouble();
        System.out.println("Digite o seu sexo [f/m]: ");
            sexo = in.next().charAt(0);
        if (sexo == 'f' || sexo == 'F') {
            contF++;
            altM = altM + altura;
        } else if (sexo == 'm' || sexo == 'M') {
            contM++;
        } else {
            System.out.println("Entrada inválida.");
        }
        if (altura > maiorAltura) {
            menorAltura = altura;
        } 
        }
        MediaMu = altM / contF;


        System.out.println("A maior e a menor altura do grupo: " + maiorAltura + menorAltura);
        System.out.println("A média de altura das mulheres: " + MediaMu);
        System.out.println("O número de homens: " + contM);
    }
}
