package Vetores.Arrays;

import java.util.Random;

class Exer16 {
    public static void main(String[] args) {
        Random valores = new Random();

        int[] A = new int[10];
        int mquinze = 0, iquinze = 0, Mquinze = 0;
        int valor,valor2,valor3,valor4,valor5,valor6,valor7,valor8,valor9,valor10;
        int soma, soma2, soma3, soma4, soma5;

        valor = valores.nextInt(10);
        valor2 = valores.nextInt(10);
        valor3 = valores.nextInt(10);
        valor4 = valores.nextInt(10);
        valor5 = valores.nextInt(10);
        valor6 = valores.nextInt(10);
        valor7 = valores.nextInt(10);
        valor8 = valores.nextInt(10);
        valor9 = valores.nextInt(10);
        valor10 = valores.nextInt(10);

        A[0] = valor;
            System.out.println("Valor1: " + A[0]);
        A[1] = valor2;
            System.out.println("Valor2: " + A[1]);
        soma = A[0] + A[1];
            if (soma < 15) {
                mquinze++;
            } else if (soma == 15) {
                iquinze++;
            } else if (soma > 15) {
                Mquinze++;
            }

        A[2] = valor3;
            System.out.println("Valor3: " + A[2]);
        A[3] = valor4;
            System.out.println("Valor4: " + A[3]);
        soma2 = A[2] + A[3];
            if (soma2 < 15) {
                mquinze++;
            } else if (soma2 == 15) {
                iquinze++;
            } else if (soma2 > 15) {
                Mquinze++;
            }           
        
        A[4] = valor5;
            System.out.println("Valor5: " + A[4]);
        A[5] = valor6;
            System.out.println("Valor6: " + A[5]);
        soma3 = A[4] + A[5];
            if (soma3 < 15) {
                mquinze++;
            } else if (soma3 == 15) {
                iquinze++;
            } else if (soma3 > 15) {
                Mquinze++;
            }

        A[6] = valor7;
            System.out.println("Valor7: " + A[6]);
        A[7] = valor8;
            System.out.println("Valor8: " + A[7]);
        soma4 = A[6] + A[7];
            if (soma4 < 15) {
                mquinze++;
            } else if (soma4 == 15) {
                iquinze++;
            } else if (soma4 > 15) {
                Mquinze++;
            }

        A[8] = valor9;
            System.out.println("Valor9: " + A[8]);
        A[9] = valor10;
            System.out.println("Valor10: " + A[9]);
        soma5 = A[8] + A[9];
            if (soma5 < 15) {
                mquinze++;
            } else if (soma5 == 15) {
                iquinze++;
            } else if (soma5 > 15) {
                Mquinze++;
            }

        System.out.println("Elementos menor que 15: " + mquinze);
        System.out.println("Elementos igual a 15: " + iquinze);
        System.out.println("Elementos maior que 15: " + Mquinze);

    }
    
}