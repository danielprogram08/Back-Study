import java.util.Scanner;

public class Exer47 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome = "";
        char sexo, resp;
        int p, masc = 0, fem = 0, sim = 0, nao = 0, respF = 0, respM = 0;

        for (p = 0; p <= 3; p++) {
            System.out.println("Bem-Vindo!");
            System.out.print("Digite seu nome: ");
            nome = in.next();

            System.out.print("Informe o sexo [M/F]: ");
            sexo = in.next().charAt(0);

           if (sexo == 'M' || sexo == 'm') {
                masc++;
           } else if (sexo == 'F' || sexo == 'f') {
                fem++;
           } else {
                System.out.println("Inválido! Tente novamente!");
                break;
           }

           System.out.println(nome + ", lançamos um novo produto no mercado. Informe-nos se gostou do novo produto: [ S(Sim) / N(Não) ]: ");
           resp = in.next().charAt(0);

           if (resp == 's' || resp == 'S') {
                sim++;   
           } else if (resp == 'n' || resp == 'N') {
                nao++;
           }

           if (sexo == 'f' && resp == 's') {
               respF++;
           } else if (sexo == 'm' && resp == 'n') {
               respM++;
           }

           System.out.println("Agradecemos a sua colaboração!");
        }

        System.out.println("Total de entrevistados: " + p);
        System.out.println("Número de pessoas que responderam sim: " + sim);
        System.out.println("Número de pessoas que responderam não: " + nao);
        System.out.println("Porcentagem de pessoas do sexo feminino que responderam 'sim': " + (respF * 100/fem) + "%");
        System.out.println("Porcentagem de pessoas do sexo masculino que responderam 'não': " + (respM * 100/masc) + "%");
    }
}