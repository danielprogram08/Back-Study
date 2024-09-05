package POO.Encapsulamento;

public class Principal {
    public static void main(String[] args) {
        Sapato sapato1 = new Sapato(42);
        System.out.println("Novo sapato: " + sapato1.gettamanho());
    }
}