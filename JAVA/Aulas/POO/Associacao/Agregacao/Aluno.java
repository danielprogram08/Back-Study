package POO.Associacao.Composicao.Agregacao;

public class Aluno {
    private String nome;
    private String matricula;
    
    public Aluno (String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getnome () {
        return nome;
    }

    public void setnome (String nome) {
        this.nome = nome;
    }

    public String getmatricula () {
        return matricula;
    }

    public void setmatricula (String matricula) {
        this.matricula = matricula;
    }

    public String listarAlunos () {
        String info = "Nome: " + nome + "\n" + "Matricula: " + matricula;
        return info;
    }
}