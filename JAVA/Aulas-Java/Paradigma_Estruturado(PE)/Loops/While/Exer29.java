import java.util.Scanner;

/*Entrar com a idade de várias pessoas e imprimir:
• Total de pessoas com menos de 21 anos;
• Total de pessoas com mais de 50 anos.*/

public class Exer29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = 1, cont21 = 0, cont50 = 0, idade;
        System.out.println("Insira a sua idade: ");
        idade = in.nextInt();

        while (true) {
            System.out.println("Digite a sua idade [0 para sair]: ");

            if (idade == 0) {
                System.out.println("Finalizado");
            break;
            }

        if (idade < 21) {
            System.out.println("Você é menor de 21.");
            cont21++; 
        } else if (idade > 50){
            System.out.println("você é maior de 50.");
            cont50++;
        }
          i++;
        } 

        System.out.println("Resultados: ");
        System.out.println("Total de pessoas com menos de 21 anos: " + cont21);
        System.out.println("Total de pessoas com menos de 50 anos: " + cont50);

    }
    
}