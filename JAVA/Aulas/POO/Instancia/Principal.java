package POO.Instancia;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor;
        System.out.println("Digite um número: ");
        valor = in.nextInt();

        //Chamar o método;
        Calculadora.calcularDobro(valor);
        in.close();
    }
}
