package Map.AtvIII;

public class Polindromo {

    public boolean isPalindromo (String texto) {
        
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) != texto.charAt(texto.length() - 1 - i)) {
                System.out.println("Não é um palíndromo!");
                return false;
            }
        }

        System.out.println("É um palíndromo!");
        return true;
    }
}