public class main {
    public static void main(String[] args) {
        telefoneFixo telefoneFixo = new telefoneFixo("32634044", "vivo");
        telefoneCelular telefoneCelular = new telefoneCelular("987563030", "claro");
        telefoneFixo.fazerChamada("980802122");
        telefoneFixo.transferirChamada("30308090");
        telefoneCelular.fazerChamada("988999997");
        telefoneCelular.enviarSMS("Fala má oee", "987201832");
    }
}