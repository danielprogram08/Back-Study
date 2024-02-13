package JAVA.Aulas.POO.Classes;

public class testeCarro {
    public static void main(String[] args) {
        carro sport = new carro();
        sport.marca = "ford";
        sport.modelo = "Mustang";
        sport.npassageiro = 5;
        sport.consumo = 5.0;
        sport.combustivel = 9.0;

        System.out.println(sport.modelo);
        System.out.println(sport.marca);
    }
}