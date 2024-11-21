//método com parâmetro;
public class calculadora {
    public static void main(String[] args) {
        int result = calcularDobro(10);
        System.out.println("O dobro do valor é: " + result);
    }

    public static int calcularDobro (int valorA) {
        int V = valorA * 2;
        return V;
    }
}