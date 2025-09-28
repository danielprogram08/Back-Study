package Map.AtvVII;

public class StringUtils {
    
    public int contarLetra(String texto, char letra) {
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == letra) {
                contador++;
            }
        }
        
        System.out.println("\n A letra '" + letra + "' aparece " + contador + " vezes no texto.");
        return contador;
    }
}