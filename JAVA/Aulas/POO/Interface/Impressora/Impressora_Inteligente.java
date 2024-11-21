class Impressora_Inteligente implements Impressora{

    @Override
    public void imprimir() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1);
        }
    }

}
