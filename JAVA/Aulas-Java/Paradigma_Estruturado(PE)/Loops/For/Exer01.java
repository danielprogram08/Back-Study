import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int i;
        System.out.println("Digite um valor: ");
        int valor = in.nextInt();
        for (i = 0; i <= valor; i++){
            System.out.println(i);
        }
    }
}
