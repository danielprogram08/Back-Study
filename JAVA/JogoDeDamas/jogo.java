package JogoDeDamas;

import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //variáveis do jogo;
        String player1, player2;

        //identificação dos players;
        System.out.print("Identifique-se player 1: ");
            player1 = in.next();
        System.out.print("Identifique-se player 2: ");
            player2 = in.next();
            System.out.println();
        System.out.println(player1 + player2 + " sejam bem-vindos ao jogo de damas!");
    }
}