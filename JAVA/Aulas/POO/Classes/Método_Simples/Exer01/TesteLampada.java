package Método_Simples.Exer01;

import java.util.Scanner;

public class TesteLampada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Lampada Convencional = new Lampada();
        System.out.println("Interruptor [1/0]: ");
        Convencional.luz = in.nextInt();
        Convencional.interruptor();
    }
}
