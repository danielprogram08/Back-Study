public class Aluno {

    //Atributos do aluno;
    private double nota1;
    private double nota2;
    private String nome;
    private String matricula;

    //Método Construtor com parâmetro;
    public Aluno (double nota1, double nota2 ,String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    //Método Construtor sem parâmetro;
    public Aluno () {}

    //Métodos Getters e Setters;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //Método de verificação da matricula;
    public boolean verificarMatricula (String matricula) {
        if (matricula != "") {
            System.out.println("\n Aluno Matriculado(a)!");
            return true;
        } else {
            System.out.println("\n Aluno não Matriculado(a)!");
            return false;
        }
    }

    //Método de calculo da média;
    public double calcularMedia (double nota1, double nota2) {
        double media = (nota1 + nota2) / 2.0;
        if (media >= 6) {
            System.out.print(" Aluno(a) aprovado(a)!");
            return media;
        } else {
            System.out.print(" Aluno(a) reprovado(a)!");
            return media;
        }
    }

    //Método toString
    @Override
    public String toString() {
        return "\n Aluno(a): " + getNome() + "\n Matricula: " + getMatricula() + "\n Nota 1: " + getNota1() + "\n Nota 2: " + getNota2() + "\n Status da matricula: " + verificarMatricula(matricula) + "\n Média Final: " + calcularMedia(nota1, nota2) + "\n \n";
    }
}