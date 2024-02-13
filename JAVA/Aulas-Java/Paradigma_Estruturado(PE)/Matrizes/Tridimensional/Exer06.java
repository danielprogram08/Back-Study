package Matrizes.Tridimensional;

import java.util.Random;
import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random maquina = new Random();

        System.out.println("Bem-Vindo ao Jogo da Velha!");
        
        System.out.println("Insira o seu nome, PLayer 1: ");
            String nome = in.nextLine();

        System.out.println(nome + " você jogará contra a máquina!");

        //jogo 1;
        

        int[][] game = {{},{},{}};

        for (int i = 0; i < game.length; i++) {
            System.out.println();

            for (int j = 0; j < game[i].length; j++) {
                System.out.println("coluna: " + i + " Linha: " + j + " Elemento: " + game[i][j]);
            }
        }
    }
}
