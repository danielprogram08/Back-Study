package Biblioteca;

public class livros {
    private String autor;
    private String titulo;
    private String genero;

    public livros (String autor, String titulo, String genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    public String getautor () {
        return autor;
    }

    public void setautor (String autor) {
        this.autor = autor;
    }

    public String gettitulo () {
        return titulo;
    }

    public void settitulo (String titulo) {
        this.titulo = titulo;
    }

    public String getgenero () {
        return genero;
    }

    public void setgenero (String genero) {
        this.genero = genero;
    }

    public void destruir () {
        System.out.println();
        System.out.println("===========BOOK-INFO==============");
        System.out.println("Livro: " + titulo + " Deletado.");
    }
}
