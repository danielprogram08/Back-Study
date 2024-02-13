package Matrizes.Irregulares;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 

        System.out.println("Bem-Vindo! Digite seu nome: ");
            String nome = in.nextLine();
                System.out.println();

        System.out.println("ATENÇÃO! Ao inserir a quantidade de registros, você irá cadastrar o número de dias de acordo com a quantidade de registros.");
            System.out.println();

        System.out.println(nome + " insira a quantidade de registros que deseja cadastrar: ");
            int registro = in.nextInt();

        String[][] agenda = new String[registro][];

        String mes = "",atividade = "";
        int dia = 0, hora = 0, linha = 0, coluna = 0;

        for (int i = 0; i < agenda.length; i++) {
            System.out.println();
            System.out.println(nome + " insira um mês: ");
            mes = in.next();
            System.out.println();
        
            agenda[i] = new String[registro]; //Inicializa o subarray com o número de dias;
        
            for (int j = 0; j < agenda[i].length; j++) {
                System.out.println();
                System.out.println(nome + " insira um dia: ");
                dia = in.nextInt();
                System.out.println();
        
                System.out.println(nome + " insira uma hora: ");
                hora = in.nextInt();
                System.out.println();
        
                if (hora > 24) {
                    System.out.println("Hora inválida. Tente novamente!");
                    j--; //Volta uma iteração para tentar novamente;
                } else {
                    System.out.println(nome + " adicione um compromisso ou insira uma informação: ");
                    atividade = in.next();
                    System.out.println();
        
                    // Convertendo inteiro para String;
                    agenda[i][j] = Integer.toString(hora);

                    linha = j;  
                    coluna = i;
                }
            }

            System.out.println("Registro (Mês): " + i + " Mês: " + mes);
            System.out.println("Registro (Dia): " + dia);
            System.out.println("Atividade/Compromisso: " + atividade);
            System.out.println("Hora: " + agenda[coluna][linha] + "h");
        }            
    }
}
