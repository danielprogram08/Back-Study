package Método_com_Retorno;

public class testeCarro {
    public static void main(String[] args) {
        carro van = new carro();

        van.marca = "ford";
        van.modelo = "ford";
        van.numPassageiros = 10;
        van.capCombustivel = 3.0;
        van.consumoCombustivel = 1.5;

        //chamando o método com retorno;
        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia);
    }
}
