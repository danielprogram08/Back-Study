package JogoDeDamas;

import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // variáveis do jogo;
        String player1, player2;
        char peca, peca2;
        int jogadas = 0, linha = 0, linha2 = 0, coluna = 0, coluna2 = 0;
        boolean ganhou = false;
        char[][] tabuleiro = new char[8][8];
        boolean[][] posicao = new boolean[8][8];

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
        do {
            System.out.print(player1 + " escolha uma peça válida [O/0]: ");
            peca = in.next().charAt(0);
            tabuleiro[0][1] = peca; tabuleiro[0][3] = peca; tabuleiro[0][5] = peca; tabuleiro[0][7] = peca; tabuleiro[1][0] = peca; tabuleiro[1][2] = peca; tabuleiro[1][4] = peca; tabuleiro[1][6] = peca; tabuleiro[2][1] = peca; tabuleiro[2][3] = peca; tabuleiro[2][5] = peca; tabuleiro[2][7] = peca; 
            System.out.println();
            if (peca == 'O') {
                peca2 = '0';
                tabuleiro[5][0] = peca2; tabuleiro[5][2] = peca2;
                tabuleiro[5][4] = peca2; tabuleiro[5][6] = peca2;
                tabuleiro[6][1] = peca2; tabuleiro[6][3] = peca2;
                tabuleiro[6][5] = peca2; tabuleiro[6][7] = peca2;
                tabuleiro[7][0] = peca2; tabuleiro[7][2] = peca2;
                tabuleiro[7][4] = peca2; tabuleiro[7][6] = peca2;
                System.out.println(player2 + " irá jogar com a peça " + peca2);
            } else if (peca == '0') {
                peca2 = 'O';
                tabuleiro[5][0] = peca2; tabuleiro[5][2] = peca2;
                tabuleiro[5][4] = peca2; tabuleiro[5][6] = peca2;
                tabuleiro[6][1] = peca2; tabuleiro[6][3] = peca2;
                tabuleiro[6][5] = peca2; tabuleiro[6][7] = peca2;
                tabuleiro[7][0] = peca2; tabuleiro[7][2] = peca2;
                tabuleiro[7][4] = peca2; tabuleiro[7][6] = peca2;
                System.out.println(player2 + " irá jogar com a peça " + peca2);
            } else if (peca != 'O' && peca != '0'){
                System.out.println("Sinal inválido, tente novamente!");
                System.out.println();
            }
        } while (peca != 'O' && peca != '0');

        // jogo;
        do {
            // player 1;
            if (jogadas % 2 == 1) {
                System.out.println("vez do " + player1 + ". Escolha uma linha válida [1 - 8]: ");
                linha = in.nextInt();
                linha--;
                System.out.println("Agora, escolha uma coluna válida: ");
                coluna = in.nextInt();
                coluna--;
                while (posicao[linha][coluna] == false) {
                    if (linha > 7 && coluna > 7 || posicao[linha][coluna] == true) {
                        System.out.println("Posição inválida ou em uso, tente novamente!");
                    } else if (linha == 1 && coluna == 2 || linha == 0 && coluna == 1) {
                        System.out.println("Posição inválida, tente novamente!");
                    } else {
                        tabuleiro[linha][coluna] = peca;
                        posicao[linha][coluna] = true;
                    }
                }
            } else if (jogadas % 2 == 0) {
                System.out.println("teste!");
            }
            jogadas++;

            // tabuleiro;
            System.out.println();
            for (int i = 0; i < tabuleiro.length; i++) {
                System.out.println(" ---------------------------- ");
                for (int j = 0; j < tabuleiro[i].length; j++) {
                    if (j <= tabuleiro[i].length) {
                        System.out.print(" | ");
                    }
                    System.out.print(tabuleiro[i][j]);
                }
                System.out.println();
                if (i <= tabuleiro.length) {
                    System.out.println(" ---------------------------- ");
                }
            }
        } while (ganhou == false || jogadas == 3);
    }
}