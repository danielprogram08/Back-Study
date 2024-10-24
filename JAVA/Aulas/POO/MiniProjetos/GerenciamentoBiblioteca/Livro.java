package GerenciamentoBiblioteca;

import Biblioteca.livros;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private String ISBN;
    private int anoPublicacao;
    private int quantidadeDisponivel;
    
    public Livro (String titulo, String autor, String editora, int anoPublicacao, String ISBN, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.ISBN = ISBN;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String gettitulo () {
        return titulo;
    }
    public void settitulo (String titulo) {
        this.titulo = titulo;
    }

    public String getautor () {
        return autor;
    }
    public void setautor (String autor) {
        this.autor = autor;
    }

    public String geteditora () {
        return editora;
    }
    public void seteditora (String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao () {
        return anoPublicacao;
    }
    public void setAnoPublicacao (int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getISBN () {
        return ISBN;
    }
    public void setISBN (String ISBN) {
        this.ISBN = ISBN;
    }

    public int getQuantidadeDisponivel () {
        return quantidadeDisponivel;
    }
    public void setQuantidadeDisponivel (int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

}

/*
 * import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Livro> acervo;

    // Construtor
    public Biblioteca() {
        this.acervo = new ArrayList<>();
    }

    // Métodos para operações de livros (adicionar, buscar, atualizar, excluir)
    // ...

    // Métodos para empréstimo e devolução
    // ...

 */