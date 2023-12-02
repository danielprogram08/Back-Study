/*27)Faça um algoritmo que receba nome e ano de nascimento. No final diga o nome da
pessoa mais velha e da mais nova. O algoritmo deve pedir nome de pessoas até
que o usuário diga que não tem mais nomes a informar, e então, verificar a mais
velha e a mais nova.*/

import java.util.Scanner;

public class Exer27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    //entrada;
    int ano, i = 0, maisVelha = 100, maisNova = 0;
    String nome, PessoaVelha = "", PessoaNova = "";
    char resp = 's';

    while (resp == 's') {
        System.out.println("Insira seu nome: ");
        nome = in.next();
        System.out.println("Insira seu ano de nascimento: ");
        ano = in.nextInt();

        //MaisVelha;
        if (ano < maisVelha) {
            maisNova = ano;
            PessoaNova = nome;

        //MaisNova    
        } else if (ano > maisNova){
            maisVelha = ano;
            PessoaVelha = nome;
        }

        System.out.println("Deseja continuar ? [s/n]");
        resp = in.next().charAt(0);
        i++;
    }    

    //saída;
    System.out.println("A mais velha é: " + maisVelha);
    System.out.println("A mais nova é: " + maisNova);
    System.out.println("Número de pessoas entrevistadas: " + i);
    }
}