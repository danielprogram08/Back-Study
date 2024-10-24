package GerenciamentoBiblioteca;

import java.util.Scanner;
import Biblioteca.biblioteca;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

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
            System.out.print("Selecione uma opção para prosseguir.\n" + 
            "\n1. Cadastrar Livro\n" + 
            "\n2. Consultar Livros\n" + 
            "\n3. Atualizar Livro\n" + 
            "\n4. Excluir\n" + 
            "\n5. Emprestimo de Livros:\n" + 
            "\n6. Devolução de Livros:\n" + 
            "\n7. Sair:\n" + "\n");
                opcao = in.nextInt();

            switch (opcao) {
                case 1:
                
                do {
                    biblioteca.adicionarLivro();
                    System.out.println("\nDeseja cadastrar mais livros ? [s/n]");
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
                    biblioteca.excluirLivro();
                break;

                case 5:
                    biblioteca.emprestarLivro();
                break;

                case 6:
                    biblioteca.devolverLivro();
                break;

                case 7:
                System.out.println("\nAté a Próxima! :D");
                menu = false;
                break;

                default:
                System.out.println("Opção inválida! Tente novamente");
                continue;
            }

        }
    }
}
