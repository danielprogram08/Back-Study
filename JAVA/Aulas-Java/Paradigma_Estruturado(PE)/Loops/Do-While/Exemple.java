import java.util.Scanner;

public class Exemple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 1;
        int max = 10;

        System.out.println("Contando até: " + max);

        //While;
        while (count <= max) {
            System.out.println("valor de i: " + count);
            count++; //i + 1 ou i += 1; 
        }
        System.out.println(count); //valor de 11;

        //Do-While;
        do {
            count++;
            System.out.println("valor de i: " + i);
        } while (count < 15); 

        System.out.println(count);
    }
}
