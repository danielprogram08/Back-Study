package Casting.UpCasting;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Daniel",20);
        Object pessoa = aluno; //upcasting;
            //é o mesmo que:
        Object aluno2 = (Object) new Aluno("Teo", 19);

        System.out.println(pessoa);
        System.out.println(aluno2);
    }
}