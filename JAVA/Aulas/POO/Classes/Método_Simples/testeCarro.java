package Método_Simples;

public class testeCarro {
    public static void main(String[] args) {
        Carro sport = new Carro();
        sport.marca = "Ford";
        sport.modelo = "Mustang";
        sport.numPassageiros = 5;
        sport.capCombustivel = 100;
        sport.consumoCombustivel = 5.0;

        System.out.println(sport.modelo);
        System.out.println(sport.marca);

        //Chamando o método;
        sport.exibirAutonomia();
    }
}