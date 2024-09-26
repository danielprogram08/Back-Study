class telefone {
    private String numero;
    
    public telefone (String numero) {
        this.numero = numero;
    }

    public void fazerChamada (String numeroDestino) {
        System.out.println("Chamando " + numeroDestino + " a partir de " + numero);
    }
    
    public String getNumero() {
        return numero;
    }
}
