package AbstracaoPolimorfismo;

public abstract class funcionario {
    private String nome;
    protected double salario;

    public abstract double getbonus ();

    public void setsalario (double salario) {
        this.salario = salario;
    }

    public String getnome (String nome) {
        return nome;
    }
}