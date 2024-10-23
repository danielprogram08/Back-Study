package GerenciamentoBiblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    private Scanner in = new Scanner(System.in);
    private List<Livro> acervo;

    public Biblioteca() {
        this.acervo = new ArrayList<>();
    }

    // Adicionar um livro
    public void adicionarLivro() {
        System.out.print("\nInforme o título do Livro: ");
        String titulo = in.nextLine();
        
        System.out.print("Informe o autor do Livro: ");
        String autor = in.nextLine();
        
        System.out.print("Informe a editora: ");
        String editora = in.nextLine();
        
        System.out.print("Informe o ano de publicação: ");
        int anoPublicacao = in.nextInt();
        in.nextLine();

        System.out.print("Informe a quantidade disponível: ");
        int qtdDisponivel = in.nextInt();
        in.nextLine();

        System.out.print("Informe o ISBN: ");
        String isbn = in.nextLine();

        Livro livro = new Livro(titulo, autor, editora, anoPublicacao, isbn, qtdDisponivel);
        acervo.add(livro);
        System.out.println();
        System.out.println("Livro adicionado com sucesso!");
    }

    // Buscar um livro
    public void buscarLivro() {
        System.out.println("\nInforme o livro que você está procurando: ");
        String livroProcurado = in.nextLine();
        boolean encontrado = false;

        for (Livro livro : acervo) {
            if (livro.gettitulo().equalsIgnoreCase(livroProcurado)) {
                System.out.println();
                System.out.println("Livro Encontrado!" + "\n");
                System.out.println("====INFORMAÇÕES DO LIVRO====" + "\n" + "\n" +
                    "Título: " + livro.gettitulo() + "\n" + 
                    "Autor: " + livro.getautor() + "\n" + 
                    "Editora: " + livro.geteditora() + "\n" + 
                    "Ano de Publicação: " + livro.getAnoPublicacao() + "\n" + 
                    "ISBN: " + livro.getISBN() + "\n" + 
                    "Quantidade Disponível: " + livro.getQuantidadeDisponivel());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Livro não Encontrado!");
        }
    }
    
    // Atualizar um livro
    public void atualizarLivro() {
        System.out.println("\nInforme o título do livro que deseja atualizar: ");
        String tituloProcurado = in.nextLine();

        Livro livroParaAtualizar = null;
        for (Livro livro : acervo) {
            if (livro.gettitulo().equalsIgnoreCase(tituloProcurado)) {
                System.out.println("Livro Encontrado!" + "\n");
                livroParaAtualizar = livro;
                break;
            }
        }

        if (livroParaAtualizar == null) {
            System.out.println("Livro não Encontrado!");
            return;
        }

        // Atualização dos dados
        System.out.print("Informe o novo título do Livro: ");
        String titulo = in.nextLine();
        livroParaAtualizar.settitulo(titulo);

        System.out.print("Informe o novo autor do Livro: ");
        String autor = in.nextLine();
        livroParaAtualizar.setautor(autor);

        System.out.print("Informe a nova editora: ");
        String editora = in.nextLine();
        livroParaAtualizar.seteditora(editora);

        System.out.print("Informe o ano de publicação: ");
        int anoPublicacao = in.nextInt();
        in.nextLine();
        livroParaAtualizar.setAnoPublicacao(anoPublicacao);

        System.out.print("Informe a quantidade disponível: ");
        int qtdDisponivel = in.nextInt();
        in.nextLine();
        livroParaAtualizar.setQuantidadeDisponivel(qtdDisponivel);

        System.out.print("Informe o ISBN: ");
        String isbn = in.nextLine();
        livroParaAtualizar.setISBN(isbn);

        System.out.println("\nLivro atualizado com sucesso!");
    }
}
