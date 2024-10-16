package GerenciamentoBiblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("Java: Como Programar", "Deitel & Deitel", "Pearson", 2020, "978-8576059029", 5);
        biblioteca.adicionarLivro(livro1);
        System.out.println("Acervo da Biblioteca:");
        biblioteca.exibirAcervo();
    }
}
