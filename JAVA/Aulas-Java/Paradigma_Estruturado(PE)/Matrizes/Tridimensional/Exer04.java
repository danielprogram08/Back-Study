package Matrizes.Tridimensional;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String mes,periodo;
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};  
        int dia, hora;

        for (int coluna = 0; coluna < meses.length; coluna++) {
            System.out.println("Insira um mês válido: ");
                mes = in.nextLine();
                
                if (mes != meses[coluna]) {
                    System.out.println("Mês inválido! Tente novamente!");
                        continue;
                } else {
                    meses[coluna] = mes;
                }
        }
    }
}
