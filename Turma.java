package POO.Associacao.agregacao;

public class Turma {
    private Aluno aluno;
    private String turma, info;

    public Turma (String turma, String nome, String matricula) {
        this.turma = turma;
        this.aluno = new Aluno(nome, matricula);
    }

    public String listarTurma () {
        if (turma == null) {
            turma = "indisponivel";
        }
        info = "Turma: " + turma + "\n" + "Aluno: " + aluno.listarAlunos();
        return info;
    }

    public void removerTurma () {
        if (turma != null) {
            turma = null;
            System.out.println("Turma: indisponivel");
        }
    }
}