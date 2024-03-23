package JogoDaVelha;

import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // variáveis do jogo;
        char[][] tabuleiro = new char[3][3];
        boolean[][] posicoesOcupadas = new boolean[3][3];
        char sinal, sinal2;
        String player1, player2;
        boolean ganhou = false;
        int jogada = 1;
        int linha, coluna, linha2, coluna2;

        // autenticando players;
        System.out.print("player 1, informe seu nome: ");
        player1 = in.next();
        System.out.println();

        System.out.print("player 2, informe seu nome: ");
        player2 = in.next();
        System.out.println();
        System.out.println(player1 + " e " + player2 + ", sejam muito bem-vindos ao jogo da velha!");

        // escolha dos sinais;
        System.out.println();
        System.out.println(player1 + " escolha um sinal entre 'x' e 'o': ");
        sinal = in.next().charAt(0);
        if (sinal == 'x' || sinal == 'X') {
            sinal2 = 'o';
            System.out.println(player2 + " jogará com: " + "'" + sinal2 + "'.");
        } else if (sinal == 'o' || sinal == 'O') {
            sinal2 = 'x';
            System.out.println(player2 + " jogará com: " + "'" + sinal2 + "'.");
        } else {
            System.out.println("sinal inválido. Tente novamente!");
            return;
        }

        // iniciando o jogo da velha;
        while (!ganhou) {

            // player 1;
            if (jogada % 2 == 1) {
                System.out.println();

                do {
                    System.out.println("Será a vez do " + player1 + ", escolha a posição da linha [1 - 3]: ");
                    linha = in.nextInt();
                    linha--;
                    System.out.println();
                    System.out.println("agora, escolha a posiçao da coluna [1 - 3]: ");
                    coluna = in.nextInt();
                    coluna--;
                    System.out.println();
                    if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                        System.out.println("posição inválida. Tente novamente!");
                        continue;
                    } else if (posicoesOcupadas[linha][coluna]) {
                        System.out.println("Posição em uso. Tente novamente!");
                        continue;
                    } else {
                        tabuleiro[linha][coluna] = sinal;
                        posicoesOcupadas[linha][coluna] = true;
                        break;
                    }

                } while (true);

            // player 2;
            } else if (jogada % 2 == 0) {
                System.out.println();
                do {
                    System.out.println("Será a vez do " + player2 + ", escolha a posição da linha [1 - 3]: ");
                    linha2 = in.nextInt();
                    linha2--;
                    System.out.println();
                    System.out.println("agora, escolha a posiçao da coluna [1 - 3]: ");
                    coluna2 = in.nextInt();
                    coluna2--;
                    System.out.println();
                    if (linha2 < 0 || linha2 > 2 || coluna2 < 0 || coluna2 > 2) {
                        System.out.println("posição inválida. Tente novamente!");
                        continue;
                    } else if (posicoesOcupadas[linha2][coluna2]) {
                        System.out.println("Posição em uso. Tente novamente!");
                        continue;
                    } else {
                        tabuleiro[linha2][coluna2] = sinal2;
                        posicoesOcupadas[linha2][coluna2] = true;
                        break;
                    }

                } while (true);
            }

            // tabuleiro;
            for (int i = 0; i < tabuleiro.length; i++) {
                for (int j = 0; j < tabuleiro[i].length; j++) {
                    System.out.print(tabuleiro[i][j]);
                    if (j < tabuleiro[i].length - 1) {
                        System.out.print(" | ");
                    }
                }
                System.out.println();
                if (i < tabuleiro.length - 1) {
                    System.out.println("---" + "---");
                }
            }

            System.out.println();
            jogada++;

            // verificando o vencedor;
            // player1;

            // vertical;
            if (tabuleiro[0][0] == sinal && tabuleiro[0][1] == sinal && tabuleiro[0][2] == sinal) {
                ganhou = true;
                System.out.println("Parabéns " + player1 + " você venceu este jogo!");
            } else if (tabuleiro[1][0] == sinal && tabuleiro[1][1] == sinal && tabuleiro[1][2] == sinal) {
                ganhou = true;
                System.out.println("Parabéns " + player1 + " você venceu este jogo!");
            } else if (tabuleiro[2][0] == sinal && tabuleiro[2][1] == sinal && tabuleiro[2][2] == sinal) {
                ganhou = true;
                System.out.println("Parabéns " + player1 + " você venceu este jogo!");

            // horizontal;
            } else if (tabuleiro[0][0] == sinal && tabuleiro[1][0] == sinal && tabuleiro[2][0] == sinal) {
                ganhou = true;
                System.out.println("Parabéns " + player1 + " você venceu este jogo!");
            } else if (tabuleiro[0][1] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][1] == sinal) {
                ganhou = true;
                System.out.println("Parabéns " + player1 + " você venceu este jogo!");
            } else if (tabuleiro[0][2] == sinal && tabuleiro[1][2] == sinal && tabuleiro[2][2] == sinal) {
                ganhou = true;
                System.out.println("Parabéns " + player1 + " você venceu este jogo!");

            // diagonal;
            } else if (tabuleiro[0][0] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][2] == sinal) {
                ganhou = true;
                System.out.println("Parabéns " + player1 + " você venceu este jogo!");
            } else if (tabuleiro[0][2] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][0] == sinal) {
                ganhou = true;
                System.out.println("Parabéns " + player1 + " você venceu este jogo!");

            // player 2;
            // vertical;
            } else if (tabuleiro[0][0] == sinal2 && tabuleiro[0][1] == sinal2 && tabuleiro[0][2] == sinal2) {
                ganhou = true;
                System.out.println("Parabéns " + player2 + " você venceu este jogo!");
            } else if (tabuleiro[1][0] == sinal2 && tabuleiro[1][1] == sinal2 && tabuleiro[1][2] == sinal2) {
                ganhou = true;
                System.out.println("Parabéns " + player2 + " você venceu este jogo!");
            } else if (tabuleiro[2][0] == sinal2 && tabuleiro[2][1] == sinal2 && tabuleiro[2][2] == sinal2) {
                ganhou = true;
                System.out.println("Parabéns " + player2 + " você venceu este jogo!");

            // horizontal;
            } else if (tabuleiro[0][0] == sinal2 && tabuleiro[1][0] == sinal2 && tabuleiro[2][0] == sinal2) {
                ganhou = true;
                System.out.println("Parabéns " + player2 + " você venceu este jogo!");
            } else if (tabuleiro[0][1] == sinal2 && tabuleiro[1][1] == sinal2 && tabuleiro[2][1] == sinal2) {
                ganhou = true;
                System.out.println("Parabéns " + player2 + " você venceu este jogo!");
            } else if (tabuleiro[0][2] == sinal2 && tabuleiro[1][2] == sinal2 && tabuleiro[2][2] == sinal2) {
                ganhou = true;
                System.out.println("Parabéns " + player2 + " você venceu este jogo!");

            // diagonal;
            } else if (tabuleiro[0][0] == sinal2 && tabuleiro[1][1] == sinal2 && tabuleiro[2][2] == sinal2) {
                ganhou = true;
                System.out.println("Parabéns " + player2 + " você venceu este jogo!");
            } else if (tabuleiro[0][2] == sinal2 && tabuleiro[1][1] == sinal2 && tabuleiro[2][0] == sinal2) {
                ganhou = true;
                System.out.println("Parabéns " + player2 + " você venceu este jogo!");

            //velha;
            } else if (jogada == 10) {
                System.out.println("Velha! Parabéns " + player1 + " e " + player2 + " pelo empate!");
            }
        }
    }
}