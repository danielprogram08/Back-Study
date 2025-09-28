import java.util.Random;

public class JogoNumeros {

    Random random = new Random();

    int valor1 = random.nextInt(100);
    int valor2 = random.nextInt(100);
    int valor3 = random.nextInt(100);
    int valor4 = random.nextInt(100);
    int valor5 = random.nextInt(100);
    int valor6 = random.nextInt(100);
    int valor7 = random.nextInt(100);
    int valor8 = random.nextInt(100);
    int valor9 = random.nextInt(100);
    int valor10 = random.nextInt(100);

    int[] numeros = new int[] {valor1, valor2, valor3, valor4, valor5, valor6, valor7, valor8, valor9, valor10};

    public void imprimirNumeros() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public int maiorNumero() {
        int maior = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("O maior número é: " + maior);
        return maior;
    }

    public int somarNumeros() {
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        
        System.out.println("A soma dos números é: " + soma);
        return soma;
    
    }
}