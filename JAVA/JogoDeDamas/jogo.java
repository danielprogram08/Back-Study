package JogoDeDamas;

import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // variáveis do jogo;
        String player1, player2;
        char peca, peca2;
        char[][] tabuleiro = new char[10][10];

        // identificação dos players;
        System.out.print("Identifique-se player 1: ");
        player1 = in.next();
        System.out.println();
        System.out.print("Identifique-se player 2: ");
        player2 = in.next();
        System.out.println();
        System.out.println(player1 + " " + player2 + " sejam bem-vindos ao jogo de damas!");

        // escolha das peças;
        System.out.println();
        System.out.print(player1 + " escolha uma peça válida [O/0]: ");
        peca = in.next().charAt(0);
        System.out.println();
        if (peca == 'O') {
            peca2 = '0';
            System.out.println(player2 + " irá jogar com a peça " + peca2);
        } else if (peca == '0') {
            peca2 = 'O';
            System.out.println(player2 + " irá jogar com a peça " + peca2);
        } else {
            System.out.println("Sinal inválido, tente novamente!");
            return;
        }

        // tabuleiro;
        System.out.println();
        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.println(" ---------------------------- ");
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < tabuleiro[i].length) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < tabuleiro.length) {
                System.out.println(" ---------------------------- ");
            }
        }

    }
}