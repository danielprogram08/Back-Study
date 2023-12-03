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
        int nascidas = 0, meses, countM = 0, crmasculina = 0, crfeminina = 0, crMortas;
        char sexo, resp = 's';

        while (resp == 's' || (crmasculina + crfeminina) <= nascidas) {
            System.out.println("Informe o número de crianças nascidas no período: ");
                nascidas = in.nextInt();   
            System.out.println("Informe o sexo de uma criança morta [m/f]: ");
                sexo = in.next().charAt(0);
                    if (sexo == 'm') {
                        crmasculina++;
                    } else if (sexo == 'f') {
                        crfeminina++; 
                    }

            System.out.println("Informe o número de meses de vida da criança: ");
                meses = in.nextInt();
                    if (meses <= 24) {
                        countM++;
                    }

            System.out.println("Deseja continuar ? [s/n]: ");
                resp = in.next().charAt(0);
                    if (resp == 'n') {
                        break;
                    }                       
        }

        System.out.println("O número de crianças mortas no período: " + (crMortas = crmasculina + crfeminina));
        System.out.println("O número de crianças do sexo masculino mortas no período: ");
        System.out.println("O número de crianças que viveram 24 meses ou menos no período: ");
    }
}
