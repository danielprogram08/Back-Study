package Map.AtvV;

public class StringUtils {

    public int contarVogais(String texto) {
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }

        System.out.println("\nQuantidade de Vogais: " + contador);
        return contador;
    
    }
}