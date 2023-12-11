import java.util.Scanner;

public class Exer81 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String praia, praiaDistante = "", praiaProxima = "";
        int distancia, distante = 10, proxima = 0, porcentagem, Pturistas = 200;
        int turistas = 0, i = 0;
        char resp = 's', form;

        while (resp == 's') {
            System.out.println("Bem-Vindo, usuário. Preencha a seguinte informação. [Turista(T)/Agente(A)]");
            form = in.next().charAt(0);
            if (form == 'T' || form == 't') {
                System.out.println("Olá turista!");
                turistas++;   
            } else if (form != 'T' || form != 't' || form != 'A') {
                System.out.println("Resposta inválida!");
                break;  
            } 
            
            System.out.println("Informe o nome da praia local: ");
            praia = in.next();
            System.out.println("Informe a distância em km da praia ao hotel: ");
            distancia = in.nextInt();
            
            if (distancia < distante) {
                proxima = distancia;
                praiaProxima = praia;

            } else if (distancia > proxima) {
                distante = distancia;
                praiaDistante = praia;

            } else if (distancia > distante) {
                distante = distancia;
                praiaDistante = praia;
            }    

            System.out.println("Deseja continuar ? [s/n]: ");
                resp = in.next().charAt(0);   
        i++;            
    }
        System.out.println("total de turistas: " + (porcentagem = turistas * 100/Pturistas) + "%");
        System.out.println("A praia mais adiante é: " + praiaProxima);
        System.out.println("A praia com distância maior que 10km é: " + praiaDistante);
    }
}

//OBS: i(interação);