public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        System.out.println("\n ----STATUS DO ALUNO---- ");
        aluno.setNome("Lívia");
        aluno.setMatricula("1-2023562153");
        aluno.setNota1(3.0);
        aluno.setNota2(10.0);
        System.out.print(aluno.toString());
    }
}