class telefoneFixo extends telefone {
    private String operadora;

    public telefoneFixo(String numero, String operadora) {
        super(numero);
        this.operadora = operadora;
    }

    public void transferirChamada(String numeroDestino) {
        System.out.println("transferindo para: " + numeroDestino);
    }
}