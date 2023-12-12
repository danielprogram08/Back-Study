import java.util.Scanner;

public class Exer42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double c;
        int f;
        for(f = 50; f <= 150; f++){
            c = (5.0/9.0) * (f - 32);
            System.out.printf("%dF equivale a %.1fC\n", f, c);
        }
        
    }
}
