package Exceptions.Stacktrace_Throws;

import java.util.Scanner;

public class Throws {
    public static void main(String[] args) {
        try {
            leNumero();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static double leNumero() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira um número: ");
        double num = in.nextDouble();
        System.out.println("Você digitou: " + num);
        return num;
    }
}
