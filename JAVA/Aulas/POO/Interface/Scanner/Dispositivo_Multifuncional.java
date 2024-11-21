public class Dispositivo_Multifuncional implements Impressora, Impressora_Simples{
    @Override
    public void escanear(String documento) {
        System.out.println("Escaneando: " + documento);
    }

    @Override
    public void imprimir(String documento) {
        System.out.println("Imprimindo: " + documento);
    }
}