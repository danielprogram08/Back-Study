package POO.Associacao.Composicao;

public class Motor {

    private String tipo;

    public Motor(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void destruir() {
        System.out.println("Motor de tipo " + tipo + " destruído.");
    }
}