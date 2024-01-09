package Matrizes.Irregulares;

import java.util.Scanner;

public class Exemple {
    public static void main(String[] args) {
        
        //Arrays irregulares não possui uma quantidade de linhas ou colunas definidas;
        int[][] arrayIrregular = new int[3][];
        arrayIrregular[0] = new int[1];
        arrayIrregular[1] = new int[2];
        arrayIrregular[2] = new int[3];

        //Exemplo com um exercício;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Entre com o número de pessoas que serão entrevistadas: ");
            int numEntrev = in.nextInt();

        String[][] nomeFilhos = new String[numEntrev][];

        for (int i = 0; i < nomeFilhos.length; i++) {
            System.out.println("Entre com a quantidade de filhos: ");
                int qtdfilhos = in.nextInt();

            nomeFilhos[i] = new String[qtdfilhos];
            
            for (int j = 0; j < nomeFilhos[i].length; j++) {
                System.out.println("Digite o nome do filho: " + (j+1));

                nomeFilhos[i][j] = in.next();
            }
        }

        for (int i = 0; i < nomeFilhos.length; i++) {
            System.out.println("pessoa " + i + " tem " + nomeFilhos[i].length + " filhos");

            for (int j = 0; j < nomeFilhos[i].length; j++) {
                System.out.println(nomeFilhos[i][j]);
        }
    }
}

}
