package GerenciamentoBiblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;
    private String ISBN;
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

    public String editora () {
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
    public void setISBN () {
        this.ISBN = ISBN;
    }

    public int getQuantidadeDisponivel () {
        return quantidadeDisponivel;
    }
    public void setQuantidadeDisponivel (int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public void emprestarLivro () {
        
    }
}