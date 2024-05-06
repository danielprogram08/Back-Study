package Método_com_Parâmetro;

public class testeCarro {
    public static void main(String[] args) {
        carro hatch = new carro();
        hatch.marca = "fiat";
        hatch.modelo = "uno";
        hatch.numPassageiros = 5;
        hatch.consumoCombustivel = 1.0;
        hatch.consumoCombustivel = 10;

        double qtdCombustivel = hatch.calculaCombustivel(10);

        System.out.println(qtdCombustivel);
    }
}