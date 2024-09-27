class telefoneCelular extends telefone {
    private String operadora;

    public telefoneCelular (String numero, String operadora) {
        super(numero);
        this.operadora = operadora;
    }

    public void enviarSMS (String mensagem, String numeroDestino) {
        System.out.println("Enviado SMS para: " + numeroDestino + mensagem);
    }
}
