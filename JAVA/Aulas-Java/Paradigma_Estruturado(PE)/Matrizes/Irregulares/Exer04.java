package Matrizes.Irregulares;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        String nome,mes,resp;

        System.out.println("Bem-Vindo! Digite seu nome: ");
            nome = in.nextLine();
                System.out.println();
        
        System.out.println(nome + " selecione um mês válido relacionado ao 1 semestre [Janeiro - Julho]: ");
            mes = in.nextLine();

        switch (mes) {
            case "janeiro":
                System.out.println("mês selecionado: " + mes);
                    int[] jan = new int[31];
                    int dia,dia2;

                    System.out.println(nome + " insira um dia válido: ");
                        dia = in.nextInt();
                        jan[0] = dia;

                    System.out.println(nome + " deseja adicionar mais algum outro dia ? ");
                        resp = in.nextLine();
                            if (resp == "não") {
                                break;
                            }

                    System.out.println(" insira outro dia válido: ");
                        dia2 = in.nextInt();
                        jan[1] = dia2;
            
            case "fevereiro":
                System.out.println("mês selecionado: " + mes);
                    int[] fev = new int[29];
                        break;

            case "março":
                System.out.println("mês selecionado: " + mes);
                    int[] mar = new int[31];
                        break;
            
            case "abril":
                System.out.println("mês selecionado: " + mes);
                    int[] abr = new int[30];
                        break;

            case "maio":
                System.out.println("mês selecionado: " + mes);
                    int[] mai = new int[31];
                        break;

            case "junho":
                System.out.println("mês selecionado: " + mes);
                    int[] jun = new int[30];
                        break;

            case "julho":
                System.out.println("mês selecionado: " + mes);
                    int[] jul = new int[31];
                        break;

            default:
                System.out.println("Mês inválido! Tente novamente!");
        }

    }
}
