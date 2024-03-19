package JogoDaVelha;

import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //variáveis do jogo;
        char[][] tabuleiro = new char[1][3];
        String player1, player2;
        char sinal1, sinal2;
        int jogadas, col, col2, lin1, lin2;
        boolean ganhou = false;
        
        //tabuleiro
        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.println();

            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.println(i + " | " + j + " | " + '9');
                System.out.println("--"+"--");
            }
        }

        //autenticando os players;
        System.out.println("Identifique-se Player 1: ");
            player1 = in.nextLine();
        System.out.println("Identifique-se Player 2: ");
            player2 = in.nextLine();
        System.out.println(player1 + " e " + player2 + ". Bem-Vindo ao jogo da velha!");

        //validando os sinais;
        System.out.println(player1 + " escolha um sinal entre X e O: ");
            sinal1 = in.next().charAt(0);

            do {
                if (sinal1 == 'o' || sinal1 == 'O') {
                    sinal2 = 'x';
                    System.out.println(player2 + " jogará com o " + sinal2);
                } else if (sinal1 == 'x' || sinal1 == 'X') {
                    sinal2 = 'o';
                    System.out.println(player2 + " jogará com o " + sinal2);
                } else {
                    System.out.println("Sinal inválido. Tente novamente!");
                }
            } while (sinal1 != 'x' && sinal1 != 'o');

        //iniciando o jogo;
        while (!ganhou) {
            jogadas = 1;   
            
            //player 1;
            if (jogadas % 2 == 1) {
                System.out.println(player1 + " escolha uma coluna [1 - 3]: ");
                    col = in.nextInt();
                    if (col < 1 && col > 3) {
                        System.out.println("insira um valor válido de 1 a 3!");
                            continue;
                    }
                
                System.out.println(player1 + " escolha uma linha [1 - 3]: ");
                    lin1 = in.nextInt();
                    if (lin1 < 1 && lin1 > 3) {
                        System.out.println("insira um valor válido de 1 a 3!");
                            continue;
                    }
            } 

                /*player 2;
                } else if (jogadas % 2 == 0) {
                    for (int k = 0; k < tabuleiro.length; k++) {
                        System.out.println();

                        for (int k2 = 0; k2 < tabuleiro[k].length; k2++) {
                            System.out.println(player2 + " escolha uma coluna [1 - 3]: ");
                                col2 = in.nextInt();
                                    if (col2 < 1 && col2 > 3) {
                                        System.out.println("insira um valor válido de 1 a 3!");
                                            continue;
                                    }
                            System.out.println(player2 + " escolha uma linha [1 - 3]: ");
                                lin2 = in.nextInt();
                                    if (lin2 < 1 && lin2 > 3) {
                                        System.out.println("insira um valor válido de 1 a 3!");
                                            continue;
                                    }       
                        }
                    }*/         
        }       
    }
    
}