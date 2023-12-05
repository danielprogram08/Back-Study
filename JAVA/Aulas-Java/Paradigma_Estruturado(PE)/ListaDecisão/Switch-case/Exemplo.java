import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int DiaSemana = 1;
         System.out.println("Insira um número correspondente ao dia da semana: ");
            DiaSemana = in.nextInt();
            
        //Dias da semana usando If & Else;
                if (DiaSemana == 1) {
                    System.out.println("Domingo");
                } else if (DiaSemana == 2) {
                    System.out.println("Segunda");
                } else if (DiaSemana == 3) {
                    System.out.println("Terça");
                } else if (DiaSemana == 4) {
                    System.out.println("Quarta");
                } else if (DiaSemana == 5) {
                    System.out.println("Quinta");
                } else if (DiaSemana == 6) {
                    System.out.println("Sexta");
                } else if (DiaSemana == 7) {
                    System.out.println("Sábado");
                } else {
                    System.out.println("Valor inválido!");
                }

         //Dias da semana usando Switch-Case;
            switch (DiaSemana) {
                case 1: System.out.println("Domingo");
                    break;
                case 2: System.out.println("Segunda"); 
                    break;
                case 3: System.out.println("Terça");
                    break;
                case 4: System.out.println("Quarta");
                    break;
                case 5: System.out.println("Quinta");
                    break;
                case 6: System.out.println("Sexta");
                    break;
                case 7: System.out.println("Sábado");
                    break;
                default: System.out.println("Valor inválido!");
                    break;
            }
    }
}  