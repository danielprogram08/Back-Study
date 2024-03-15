package JogoDaVelha;

import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //variáveis do jogo;
        boolean ganhou = false;
        char sinal, sinal2, pos, pos2;
        char[][] posicao = new char[3][3];
        String player1, player2;

        //players;
        while (!ganhou) {
            System.out.println("Bem-Vindo ao jogo da velha! Identifique-se player 1: ");
                player1 = in.next();
            System.out.println("Bem-Vindo ao jogo da velha! Identifique-se player 2: ");
                player2 = in.next();

            //escolha do sinal;
            System.out.println(player1 + " escolha um valor entre 'o' e 'x': ");
                sinal = in.next().charAt(0);
                do {
                    if (sinal == 'o') {
                        System.out.println(player2 + " você jogará com 'x'.");
                            sinal2 = 'x';
                    } else if (sinal == 'x') {
                        System.out.println(player2 + " você jogará com 'o'.");
                            sinal2 = 'o';
                    } else {
                        System.out.println("Sinal inválido! Tente novamente!");
                    }
                } while (sinal != 'x' && sinal != 'o');

            //jogada;
            int jogada = 1;
            
            if (jogada % 2 == 1) {
                System.out.println("Vez do " + player1 + "!" + " Insira uma coluna e uma linha [1 - 3]: ");
            } else {
                System.out.println("Vez do " + player2 + "!" + " Insira uma coluna e uma linha [1 - 3]: ");
            }
                
        }
    }
}