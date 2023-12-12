import java.util.Scanner;

public class Exer21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valoresIn = 0, quadrado = 2, resultado, valores;

        while (valoresIn <= 4) {
            System.out.println("Insira um valor: ");
            valores = in.nextInt();
            resultado = valores * quadrado;
            System.out.println("O quadrado do valor inserido é: " + resultado);
        valoresIn++;
        }    
        System.out.println("Foram inseridos: " + valoresIn + " valores");
    }
}
