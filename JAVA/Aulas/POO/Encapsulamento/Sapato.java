package POO.Encapsulamento;

public class Sapato {
    private int tamanho;

    public Sapato (int tamanho) {
        this.tamanho = tamanho;
    }

    public int gettamanho () {
        return tamanho;
    }

    public void settamanho (int tamanho) {
        this.tamanho = tamanho;
    }

    public void informacao () {
        System.out.println("Tamanho: " + tamanho);
    }
}
