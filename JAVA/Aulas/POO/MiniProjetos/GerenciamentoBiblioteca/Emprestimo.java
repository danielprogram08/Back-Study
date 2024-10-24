package GerenciamentoBiblioteca;

import java.util.Date;

public class Emprestimo {
    private String nomeUsuario;
    private Livro livro;
    private Date dataEmprestimo;
    private Date dataDevolucaoPrevista;

    public Emprestimo(String nomeUsuario, Livro livro, Date dataEmprestimo, Date dataDevolucaoPrevista) {
        this.nomeUsuario = nomeUsuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Date getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }
}