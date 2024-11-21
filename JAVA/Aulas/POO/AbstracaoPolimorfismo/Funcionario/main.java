package Funcionario;

public class main {
    public static void main(String[] args) {
        gerente g = new gerente();
        desenvolvedor dev = new desenvolvedor();
        g.setsalario(1000.00);
        System.out.println(g.getbonus());
        dev.setsalario(1000.00);
        System.out.println(dev.getbonus());
        TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
        totalizador.adiciona(dev);
        totalizador.adiciona(g);
        System.out.println(totalizador.gettotal());
    }
}
