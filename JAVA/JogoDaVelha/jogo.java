package JogoDaVelha;

import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //variáveis do jogo;
        char[][] tabuleiro = new char[3][3];
        char sinal, sinal2;
        String player1, player2;
        boolean ganhou = false;
        int jogada = 1;
        int linha, coluna, linha2, coluna2;
        
        //autenticando players;
        System.out.println("player 1, informe seu nome: ");
            player1 = in.nextLine();
                System.out.println();    
        
        System.out.println("player 2, informe seu nome: ");
            player2 = in.nextLine();
                System.out.println();
        System.out.println(player1 + " e " + player2 + ", bem-vindo ao jogo da velha!");

        //escolha dos sinais;
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

        //iniciando o jogo da velha;
        while (!ganhou) {

            //player 1;
            if (jogada % 2 == 1) {
                System.out.println();
                System.out.println("Será a vez do " + player1 + ", escolha a posição da linha [1 - 3]: ");
                linha = in.nextInt();
                linha--;
                    if (linha < 0 || linha > 2) {
                        System.out.println("posição inválida. Tente novamente!");
                            return;
                    }
                System.out.println(player1 + " escolha a posição da coluna [1 - 3]: ");
                coluna = in.nextInt();
                    System.out.println();
                coluna--;
                    if (coluna < 0 || coluna > 2) {
                        System.out.println("posição inválida. Tente novamente!");
                            return;
                    }
                tabuleiro[linha][coluna] = sinal;

            //player 2;
            } else if (jogada % 2 == 0) { 
                System.out.println();       
                System.out.println("Será a vez do " + player2 + ", escolha a posição da linha [1 - 3]: ");
                linha2 = in.nextInt();
                linha2--;
                    if (linha2 < 0 || linha2 > 2) {
                        System.out.println("posição inválida. Tente novamente!");
                            return;
                    }
                System.out.println(player2 + " escolha a posição da coluna [1 - 3]: ");
                coluna2 = in.nextInt();
                    System.out.println();
                coluna2--;
                    if (coluna2 < 0 || coluna2 > 2) {
                        System.out.println("posição inválida. Tente novamente!");
                            return;
                    }
                tabuleiro[linha2][coluna2] = sinal2; 
            }

            //tabuleiro;
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
        }
    }
}