package Matrizes.Tridimensional;

public class Exemple {
    public static void main(String[] args) {
        
        int[][][] matrizTridimensional = new int[3][3][3];

        //Iterando cada espaço da Matriz;
        for (int i = 0; i < matrizTridimensional.length; i++) {

            for (int j = 0; j < matrizTridimensional[i].length; j++) {

                for (int k = 0; k < matrizTridimensional[i][j].length; k++) {            
                    
                }
            }
        }

        //Exemplo de manipulação da matriz;
        int soma = 0;
        int somaPares = 0;
        int somaImpares = 0;
        for (int i = 0; i < matrizTridimensional.length; i++) {

            for (int j = 0; j < matrizTridimensional[i].length; j++) {

                for (int k = 0; k < matrizTridimensional[i][j].length; k++) {
                    
                 //Acompanhando o algorítmo funcionando;
                 System.out.println("i = " + i + " j = " + j + " k = " + k);
                    
                    soma += matrizTridimensional[i][j][k];
                        if (matrizTridimensional[i][j][k] % 2 == 0) {
                            somaPares += matrizTridimensional[i][j][k];
                        } else {
                            somaImpares += matrizTridimensional[i][j][k];
                        }
                }
            }
        }

        System.out.println("soma total = " + soma);
        System.out.println("soma pares = " + somaPares);
        System.out.println("soma impares = " + somaImpares);
    }
}
