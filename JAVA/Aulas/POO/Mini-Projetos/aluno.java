public class aluno {
    private String nome;
    private String matricula;

public aluno (String nome, String matricula) {
    this.nome = nome;
    this.matricula = matricula;
}

public String getnome () {
    return nome;
}

public void setnome (String nome) {}

public String getmatricula () {
    return matricula;
}

public void setmatricula (String matricula) {}

public static int calcularMedia (float nota1, float nota2, float  nota3) {
    float soma = (nota1 + nota2 + nota3);
    float media = (soma/4);
    float mediaFaculd = 6;

    return (int) media;
}

public static boolean verificarAprovacao (float media) {
    boolean aprovacao = true;
    if (media >= 6) {
        aprovacao = true;
        System.out.println();
        System.out.println("você foi aprovado!");
    } else if (media < 6) {
        aprovacao = false;
        System.out.println();
        System.out.println("você foi reprovado!");
    }

    return aprovacao;
}

public String toString () {
    System.out.println();
    return "nome: " + nome + "\n" + "matricula: " + matricula + "\n";
}

}