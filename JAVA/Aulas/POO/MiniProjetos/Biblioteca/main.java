package Biblioteca;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String livro, genero, autor;

        System.out.print("Insira o nome do livro: ");
        livro = in.nextLine();
        System.out.print("Informe o gênero: ");
        genero = in.nextLine();
        System.out.print("Informe o autor: ");
        autor = in.nextLine();

        biblioteca Biblioteca = new biblioteca(autor, livro, genero);
        
        System.out.println();
        System.out.println("==============Library-List==============");
        Biblioteca.listar();
        System.out.println();
        System.out.println("==============Library-Info==============");
        Biblioteca.remover();
    }
}
