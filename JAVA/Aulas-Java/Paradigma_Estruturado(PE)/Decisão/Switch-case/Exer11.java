import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int indent = 1;
        int salario;
        double valor, aumento;
        String nome;
        char resp = 's';

        while (resp == 's') {    
            System.out.println("Bem-Vindo ao Org. Tabajara! Digite seu nome: ");
                nome = in.next();
            System.out.println("Olá " + nome + "! Identifique-se: 1.[colaborador] 2.[cliente]");
                indent = in.nextInt();
                    if (indent == 1) {
                        System.out.println("Aguarde um instante...");
                    } else if (indent == 2) {
                        System.out.println("Esta página é exclusiva apenas para colaboradores!");
                        break;
                    } else if (indent != 1 && indent != 2) {
                        System.out.println("Opção inválida! Tente Novamente!");
                        continue;
                    }

            System.out.println(nome + ", informe seu salário atual: 1(até R$ 280,00), 2(entre R$ 280,00 e R$ 700,00), 3(entre R$ 700,00 e R$ 1.500,00), 4(R$ 1500,00 em diante): ");
            salario = in.nextInt();
                switch (salario) {
                    case 1:
                       System.out.println("Seu salário receberá um aumento de 20%."); 
                        break;
                    
                    case 2:
                       System.out.println("Seu salário receberá um aumento de 15%."); 
                        break;

                    case 3:
                       System.out.println("Seu salário receberá um aumento de 10%."); 
                        break;

                    case 4:
                       System.out.println("Seu salário receberá um aumento de 5%."); 
                        break;    

                    default:
                        System.out.println("Por favor, informe um salário válido!");
                        continue;
                }

            System.out.println("Insira o valor do seu salário para prosseguirmos: ");
                valor = in.nextInt();
                    if (salario == 1) {
                        aumento = (valor * (20.0/100.0));
                        System.out.println("O valor atual do seu novo salário será: " + "R$ " + (valor + aumento));   
                    } else if (salario == 2) {
                        aumento = (valor * (15.0/100.0));
                        System.out.println("O valor atual do seu novo salário será: " + (valor + aumento)); 
                    } else if (salario == 3) {
                        aumento = (valor * (10.0/100.0));
                        System.out.println("O valor atual do seu novo salário será: " + (valor + aumento)); 
                    } else if (salario == 4) {
                        aumento = (valor * (5.0/100.0));
                        System.out.println("O valor atual do seu novo salário será: " + (valor + aumento)); 
                    }

            System.out.println("Deseja efetuar mais uma consulta ? [s/n]: ");
            resp = in.next().charAt(0);
        }
        
        System.out.println("Obrigado e até a próxima!");
    }
}
