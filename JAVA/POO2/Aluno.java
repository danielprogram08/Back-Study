public class Aluno {

    //Atributos do aluno;
    private double nota1;
    private double nota2;
    private String nome;
    private int matricula;

    //Método Construtor com parâmetro;
    public Aluno (double nota1, double nota2 ,String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    //Método Construtor sem parâmetro;
    public Aluno () {}

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}