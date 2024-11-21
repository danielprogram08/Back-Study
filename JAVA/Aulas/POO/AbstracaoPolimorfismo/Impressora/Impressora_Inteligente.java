package Impressora;
class Impressora_Inteligente extends Impressora{

    @Override
    void imprimir() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1);
        }
    }
}
