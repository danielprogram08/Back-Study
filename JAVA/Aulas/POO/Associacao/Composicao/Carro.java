package POO.Associacao.Composicao;

public class Carro {

    private Motor motor;
    private String modelo;

    public Carro(String modelo, String tipoMotor) {
        this.modelo = modelo;
        this.motor = new Motor(tipoMotor); // O carro cria o motor
    }

    public void listarDetalhes() {
        System.out.println("Modelo: " + modelo + ", Motor: " + motor.getTipo());
    }
    
    public void remover() {
        if (motor != null) {
            motor.destruir(); // Chama a remoção do motor
            motor = null; // Remove a referência ao motor
        }
        
        System.out.println("Carro modelo " + modelo + " removido.");
    }
}