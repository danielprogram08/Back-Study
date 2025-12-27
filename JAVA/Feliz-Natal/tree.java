public class tree {
    public static void main(String[] args) {
        int alt = 10;

        System.out.println();
        
        for (int i = 1; i <= alt; i++) {
            for (int j = 1; j <= alt - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 8; k++) {
                System.out.print("#");
            }

            System.out.println();

        }

    }
}