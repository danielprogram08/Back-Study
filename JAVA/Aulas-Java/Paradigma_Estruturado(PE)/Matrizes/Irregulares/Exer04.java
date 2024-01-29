package Matrizes.Irregulares;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 

        System.out.println("Bem-Vindo! Digite seu nome: ");
            String nome = in.nextLine();
                System.out.println();

        System.out.println(nome + " insira o número de registros que deseja cadastrar: ");
            int registros = in.nextInt();

        String[][] agenda = new String[registros][];

        for (int i = 0; i < agenda.length; i++) {
            System.out.println(nome + " insira um dia: ");
                int dia = in.nextInt();
            
            agenda[i] = new String[dia];

            for (int j = 0; j < agenda[i].length; j++) {
                System.out.println(nome + " insira um mês: [ex: jan = 1, fev = 2]");
                    int mes = in.nextInt();

                agenda[j] = new String[mes];
            }
        }

    }
}
