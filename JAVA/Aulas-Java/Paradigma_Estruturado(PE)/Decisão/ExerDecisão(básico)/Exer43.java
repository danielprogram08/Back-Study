package listaDecisao;

import java.util.Scanner;

/*43)Entrar com o salário de uma pessoa e imprimir o desconto do INSS segundo a tabela 
a seguir:
Menor ou igual a R$ 600,00 Isento
Maior que R$ 600,00 e menor ou igual a R$ 1.200,00 20%
Maior que R$ 1.200,00 e menor ou igual a R$ 2.000,00 25%
Maior que R$ 2.000,00*/
public class Exer43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //Entrar com o Salário;
        double salario, desconto;
        System.out.println("Informe seu salário.");
        salario = in.nextDouble();
        
        if(salario <= 600){
            System.out.println("Isento");
        } else if (salario > 600 && salario <= 1.200){
            desconto = salario * 0.20;
            System.out.println("O desconto do inss = " + desconto);
        } else if (salario > 1.200 && salario <= 2.200) {
            desconto = salario * 0.25;
            System.out.println("O desconto do inss = " + desconto);
        } else {
            desconto = salario * 0.30;
            System.out.println("O desconto do inss = " + desconto);
        }
    }
}
