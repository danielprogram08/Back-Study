import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //valor;
        int valor, i;
        System.out.println("Digite um valor: ");
        valor = in.nextInt();
        
        //repetição e condição;
        for(i = 0; i <= valor; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
 
}