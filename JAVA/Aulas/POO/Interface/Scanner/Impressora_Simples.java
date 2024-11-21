public interface Impressora_Simples {
    public default void imprimir(String documento) {
            System.out.println("Imprimindo: " + documento);
        }
}