package Casting.DownCasting;

public class Aluno2 extends Pessoa{
    private String nome;
    private int idade;

    public Aluno2(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Aluno2 [nome=" + nome + ", idade=" + idade + "]";
    }
}