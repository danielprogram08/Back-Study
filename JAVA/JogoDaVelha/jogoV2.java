package JogoDaVelha;

import java.util.Random;
import java.util.Scanner;

public class jogoV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random computer = new Random();

        // variáveis do jogo;
        char[][] tabuleiro = new char[3][3];
        boolean[][] posicoesOcupadas = new boolean[3][3];
        char sinal, sinalC;
        String player1;
        boolean ganhou = false;
        int jogada = 1;
        int linha, coluna, linhaC, colunaC;

        // autenticando player;
        System.out.print("player 1, informe seu nome: ");
        player1 = in.next();
        System.out.println();
        System.out.println(player1 + " seja muito bem-vindo ao jogo da velha!");

        // escolha dos sinais;
        System.out.println();
        System.out.println(player1 + " escolha um sinal entre 'x' e 'o': ");
        sinal = in.next().charAt(0);
        System.out.println();
        if (sinal == 'x' || sinal == 'X') {
            sinalC = 'o';
            System.out.println("A máquina jogará com: " + "'" + sinalC + "'.");
        } else if (sinal == 'o' || sinal == 'O') {
            sinalC = 'x';
            System.out.println("A máquina jogará com: " + "'" + sinalC + "'.");
        } else {
            System.out.println("sinal inválido. Tente novamente!");
            return;
        }

        // iniciando o jogo da velha;
        while (!ganhou) {

            // player 1;
            if (jogada % 2 == 1) {
                do {
                    System.out.println();
                    System.out.println(player1 + ", escolha a posição da linha [1 - 3]: ");
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

            //Computer;
            } else if (jogada % 2 == 0) {
                do {
                    linhaC = computer.nextInt(3);
                    colunaC = computer.nextInt(3);
                    System.out.println();
                    if (!posicoesOcupadas[linhaC][colunaC]) {
                        tabuleiro[linhaC][colunaC] = sinalC;
                        posicoesOcupadas[linhaC][colunaC] = true;
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

            jogada++;
            System.out.println();

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

            // Computer;
            // vertical;
            } else if (tabuleiro[0][0] == sinalC && tabuleiro[0][1] == sinalC && tabuleiro[0][2] == sinalC) {
                ganhou = true;
                System.out.println("A máquina venceu este jogo!");
            } else if (tabuleiro[1][0] == sinalC && tabuleiro[1][1] == sinalC && tabuleiro[1][2] == sinalC) {
                ganhou = true;
                System.out.println("A máquina venceu este jogo!");
            } else if (tabuleiro[2][0] == sinalC && tabuleiro[2][1] == sinalC && tabuleiro[2][2] == sinalC) {
                ganhou = true;
                System.out.println("A máquina venceu este jogo!");

            // horizontal;
            } else if (tabuleiro[0][0] == sinalC && tabuleiro[1][0] == sinalC && tabuleiro[2][0] == sinalC) {
                ganhou = true;
                System.out.println("A máquina venceu este jogo!");
            } else if (tabuleiro[0][1] == sinalC && tabuleiro[1][1] == sinalC && tabuleiro[2][1] == sinalC) {
                ganhou = true;
                System.out.println("A máquina venceu este jogo!");
            } else if (tabuleiro[0][2] == sinalC && tabuleiro[1][2] == sinalC && tabuleiro[2][2] == sinalC) {
                ganhou = true;
                System.out.println("A máquina venceu este jogo!");

            // diagonal;
            } else if (tabuleiro[0][0] == sinalC && tabuleiro[1][1] == sinalC && tabuleiro[2][2] == sinalC) {
                ganhou = true;
                System.out.println("A máquina venceu este jogo!");
            } else if (tabuleiro[0][2] == sinalC && tabuleiro[1][1] == sinalC && tabuleiro[2][0] == sinalC) {
                ganhou = true;
                System.out.println("A máquina venceu este jogo!");

            //velha;
            } else if (jogada == 10) {
                System.out.println("Velha! Parabéns " + player1 + " pelo empate!");
                break;
            }

        }
    }
}