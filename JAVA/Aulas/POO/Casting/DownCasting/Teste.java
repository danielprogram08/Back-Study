package Casting.DownCasting;

public class Teste {
    public static void main(String[] args) {
        Aluno2 aluno1 = new Aluno2("Daniel", 20);
        Pessoa pessoaAluno = aluno1; //UpCasting;

        Aluno2 aluno2 = (Aluno2) pessoaAluno; //DownCasting

        System.out.println(pessoaAluno + "\n" + aluno2);
    }
}