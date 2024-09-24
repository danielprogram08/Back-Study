package Biblioteca;

public class biblioteca {

    private livros Livros;

    public biblioteca (String autor, String titulo, String genero) {
        this.Livros = new livros(autor, titulo, genero);
    }

    public void listar() {
        System.out.println("Livro: " + Livros.gettitulo() + "\n" + "Autor: " + Livros.getautor() + "\n" + "Gênero: " + Livros.getgenero() + "\n" + "Status: Disponivel"); 
    }

    public void remover() {
        if (Livros != null) {
            System.out.println("Livro: " + Livros.gettitulo() + "\n" + "Genero: " + Livros.getgenero() + "\n" + "Autor: " + Livros.getautor() + "\n" + "Status: Removido.");
            Livros.destruir();
            Livros = null;
        }
    }
}