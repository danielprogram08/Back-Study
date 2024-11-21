public class Main {
    public static void main(String[] args) {
        Impressora_Inteligente Impressora = new Impressora_Inteligente();
        Impressora_Burra impressora = new Impressora_Burra();

        System.out.println("Impressora manual:");
        impressora.imprimir();

        System.out.println("\nImpressora Automatica:");
        Impressora.imprimir();
    }
}
