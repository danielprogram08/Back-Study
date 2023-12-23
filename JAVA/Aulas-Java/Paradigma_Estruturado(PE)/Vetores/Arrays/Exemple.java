package Vetores.Arrays;

import java.util.Scanner;

public class Exemple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //Dias da semana;
        String dia01 = "Domingo";
        String dia02 = "Segunda";
        String dia03 = "Terça";
        String dia04 = "Quarta";
        String dia05 = "Quinta";
        String dia06 = "Sexta";
        String dia07 = "Sábado";

        System.out.println(dia01);

        //Dias da semana com Arrays;
        String[] diasSemana = new String[7];
        diasSemana[0] = "Domingo";
        diasSemana[1] = "Segunda";
        diasSemana[2] = "Terça";
        diasSemana[3] = "Quarta";
        diasSemana[4] = "Quinta";
        diasSemana[5] = "Sexta";
        diasSemana[6] = "Sábado";

        System.out.println(diasSemana[0]);
    }
}
