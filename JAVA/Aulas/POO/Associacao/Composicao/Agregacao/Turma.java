package POO.Associacao.Composicao.Agregacao;

public class Turma {
    private Aluno aluno;
    private String turma, info;

    public Turma (String turma, String nome, String matricula) {
        this.turma = turma;
        this.aluno = new Aluno(nome, matricula);
    }

    public String listarTurma () {
        info = "Turma: " + turma + "\n" + "Aluno: " + aluno.listarAlunos();
        return info;
    }
}