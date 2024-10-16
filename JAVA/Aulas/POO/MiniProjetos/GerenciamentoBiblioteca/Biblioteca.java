package GerenciamentoBiblioteca;

import java.util.ArrayList;
import java.util.List;

import Biblioteca.livros;

public class Biblioteca {
    private List<Livro> acervo;

    public Biblioteca () {
        this.acervo = new ArrayList<>();
    }

    public void adicionarLivro (Livro l) {
        acervo.add(l);
        System.out.println("Livro cadastrado!");
    }

    public void exibirAcervo () {
        System.out.println(acervo.get(0));
    }
}