import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //valor;
        int i, valor;
        int soma = 0;
        System.out.println("Digite um valor: ");
        valor = in.nextInt();
        
        //repetição;
        for(i = 0; soma <= valor; i++){
            System.out.println(i);
            soma += i;
            System.out.println(soma);
        }
    }
}
