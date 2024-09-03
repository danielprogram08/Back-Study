package POO.Instancia;

public class Calculadora {
    Calculadora calcularDobro = new Calculadora ();    
    
    public static int calcularDobro (int valor) {
        int resultado = valor * 2;
        System.out.println(resultado);
        return resultado;
    }
}