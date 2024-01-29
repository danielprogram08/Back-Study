package Matrizes.Irregulares;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 

        System.out.println("Bem-Vindo! Digite seu nome: ");
            String nome = in.nextLine();
                System.out.println();

        System.out.println("Insira a quantidade de registros que deseja cadastrar: ");
            int registro = in.nextInt();

        String[][] agenda = new String[registro][0];

        for (int i = 0; i < agenda.length; i++) {
            System.out.println("Insira um mês [ex: jan - 1, fev - 2]: ");
                int mes = in.nextInt();
            
            System.out.println("registro (Mês): " + i + " mês: " + mes);

            for (int j = 0; j < agenda[i].length; j++) {
                System.out.println("Insira um dia: ");
                    int dia = in.nextInt();

                System.out.println("registro(mês): " + i + " mês: " + mes + " registro(dia): " + j + " dia: " + dia);
            }
        }
    }
}
