
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome;
        String Matricula;
        float nota1, nota2, nota3, media;

        System.out.print("Insira seu nome: ");
        nome = in.nextLine();

        System.out.print("Insira sua Matricula: ");
        Matricula = in.nextLine();

        System.out.println();

        aluno Aluno = new aluno(nome, Matricula);

        System.out.print("Insira sua nota1: ");
        nota1 = in.nextFloat();
        System.out.print("Insira sua nota2: ");
        nota2 = in.nextFloat();
        System.out.print("Insira sua nota3: ");
        nota3 = in.nextFloat();

        media = Aluno.calcularMedia(nota1, nota2, nota3);
        Aluno.verificarAprovacao(media);

        System.out.println(Aluno.toString());
        
    }
}
