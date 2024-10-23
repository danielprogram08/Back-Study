package GerenciamentoBiblioteca;

import java.util.Scanner;

import Biblioteca.biblioteca;

public class Menu {
    Scanner in = new Scanner(System.in);
    Biblioteca biblioteca = new Biblioteca();

    //Menu da Biblioteca;
    public void MenuBiblioteca() {
        int opcao;
        boolean menu = true;
        char opcaoCase;

        while (menu == true) {
            System.out.println();
            System.out.println("====BEM-VINDO AO MENU BIBLIOTECÁRIO!=====");
            System.out.println();
            System.out.print("Selecione uma opção para prosseguir." + "\n" +"\n" + "1. Cadastrar Livro" + "\n" + "2. Consultar Livros" + "\n" + "3. Atualizar Livro" + "\n" + "4. Excluir" + "\n" + "5. Sair " + "\n" + "\n");
                opcao = in.nextInt();

            switch (opcao) {
                case 1:
                
                do {
                    biblioteca.adicionarLivro();
                    System.out.println();
                    System.out.print("Deseja cadastrar mais livros ? ");
                    opcaoCase = in.next().charAt(0);
                } while (opcaoCase == 's');
                break;
                
                case 2:
                    biblioteca.buscarLivro();
                break;

                case 3:
                    biblioteca.atualizarLivro();
                break;

                case 4:

                break;

                case 5:
                System.out.println();
                System.out.println("Até a Próxima! :D");
                menu = false;
                break;

                default:
                System.out.println("Opção inválida! Tente novamente");
                continue;
        }

        }
    }
}
