import java.util.Scanner;

public class Piscina {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float comprimento, largura, profundidade;
        int opcao;

        System.out.print("Insira a largura da piscina: ");
            largura = in.nextFloat();
        System.out.print("Insira a profundidade da piscina: ");
            profundidade = in.nextFloat();
        System.out.println("Insira o comprimento da piscina: ");
            comprimento = in.nextFloat();

        System.out.println("Selecione uma das opções para calculo: 1.PERÍMETRO 2.ÁREA 3.VOLUME");
            opcao = in.nextInt();

        switch (opcao) {
            case 1:
                float Perimetro = calcularPerimetro(comprimento, largura);
                System.out.println(Perimetro);
                break;
            
            case 2:
                float Area = calcularArea(comprimento, largura);
                System.out.println(Area);
                break;

            case 3:
                float Volume = calcularVolume(comprimento, largura, profundidade);
                System.out.println(Volume);
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public static float calcularPerimetro(float comprimento, float largura) {
        float calculo;
        return calculo = (comprimento * 2) + (largura * 2);
    }

    public static float calcularArea(float comprimento, float largura) {
        float calculo;
        return calculo = (comprimento * largura);
    }

    public static float calcularVolume (float comprimento, float largura, float profundidade) {
        float calculo;
        return calculo = (comprimento * largura * profundidade);
    }
}
