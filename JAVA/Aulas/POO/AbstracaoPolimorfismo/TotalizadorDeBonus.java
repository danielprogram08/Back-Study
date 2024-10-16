package AbstracaoPolimorfismo;

public class TotalizadorDeBonus {
    private double total = 0;

    public void adiciona (funcionario f) {
        this.total += f.getbonus();
    }

    public double gettotal () {
        return total;
    }
}
