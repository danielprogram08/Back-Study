package Método_com_Parâmetro;

public class carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    double calculaCombustivel(double km){
        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }
}

//OBS: passou-se a váriavel km como parâmetro porque não existe um dado correto de km na classe, no entanto, para calculo, coloca-se a variável como parâmetro;