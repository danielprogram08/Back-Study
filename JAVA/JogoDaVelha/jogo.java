package JogoDaVelha;

import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //variáveis do jogo;
        boolean ganhou = false;
        char dado;
        int[][] posicao = new int[3][3];
        String player1, player2;

        //players;
        while (!ganhou) {
            System.out.println("Bem-Vindo ao jogo da velha! Identifique-se player 1: ");
                player1 = in.next();
            System.out.println("Bem-Vindo ao jogo da velha! Identifique-se player 2: ");
                player2 = in.next();

            //escolha do dado;
            System.out.println(player1 + " escolha um valor entre 'o' e 'x': ");
                dado = in.next().charAt(0);
                do {
                    if (dado == 'o') {
                        System.out.println(player2 + " você jogará com 'x'.");
                    } else if (dado == 'x') {
                        System.out.println(player2 + " você jogará com 'o'.");
                    } else {
                        System.out.println("Dado inválido! Tente novamente!");
                    }
                } while (dado != 'x' && dado != 'o');
                
        }
    }
}