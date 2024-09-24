package POO.Associacao.Composicao;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Mustang", "V8");
        carro.listarDetalhes();

        // Remover o carro e seu motor
        carro.remover();
        
        }
    }
