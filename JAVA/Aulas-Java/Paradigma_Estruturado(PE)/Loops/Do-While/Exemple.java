import java.util.Scanner;

public class Exemple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = 1;
        int max = 10;

        System.out.println("Contando até: " + max);

        //While;
        while (i <= max) {
            System.out.println("valor de i: " + i);
            i++; //i + 1 ou i += 1; 
        }
        System.out.println(i); //valor de 11;

        //Do-While;
        do {
            i++;
            System.out.println("valor de i: " + i);
        } while (i < 15); 

        System.out.println(i);
    }
}
