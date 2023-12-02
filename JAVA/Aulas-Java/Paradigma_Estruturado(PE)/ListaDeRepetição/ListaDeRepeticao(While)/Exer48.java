/*índice de mortalidadde infantil em um certo período:
    1. Ler inicialmente, o número de crianças nascidas no período;

    2. Ler em seguida, um número indeterminado de linhas, contendo, cada uma, o sexo de uma criança morta e o número de meses de vida da criança.

    Determinar e Imprimir:
    A) A porcentagem de crianças mortas no período:
    B) A porcentagem de crianças do sexo masculino mortas no período;
    C) A porcentagem de crianças que viveram 24 meses ou menos no período;
*/

import java.util.Scanner;

public class Exer48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cr = 0, mes, i = 0, masc = 0, fem = 0;
        char sexo, resp = 's';
        double result, percent = 15.0/100.0;

        //1. && 2.
        while (resp == 's') {
            System.out.print("Informe o sexo da criança: [m/f]: ");
            sexo = in.next().charAt(0);
            if (sexo == 'm') {
                masc++;
            } else {
                fem++;
            }     

            System.out.println("Informe quantos meses tinha a criança: ");
            mes = in.nextInt();
            i++;
          
        System.out.println("Deseja continuar ? [s/n]: ");
            resp = in.next().charAt(0);      
        cr++;   

        }
        
        //1. && 2.
        System.out.println("Número de crianças nascidas no período: " + cr);
        System.out.println("Número de nascidos entre 24 meses: " + i);
        System.out.println("Número de crianças do sexo masculino: " + masc);
        System.out.println("Número de crianças do sexo feminino: " + fem);
        //A)
        System.out.println("Porcentagem de crianças mortas no período: " + (result = cr/percent));
        //B)
        System.out.println("Porcentagem de crianças mortas do sexo masculino no período: " + (result = masc/percent));
        //C)
        System.out.println("Porcentagem de crianças que viveram no período de 24 meses ou menos: " + (result = i/percent));
        
    }
    
}
