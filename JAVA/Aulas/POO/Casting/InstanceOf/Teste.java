package Casting.InstanceOf;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Daniel", 20, "ADS");

        if (aluno instanceof Aluno) {
            System.out.println("aluno é instância de Aluno");
        }
    }
}
