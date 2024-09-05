package POO.Encapsulamento;

public class fornecedor {
    private int salario;

    public fornecedor (int salario) {
        this.salario = salario;
    }

    public int getsalario () {
        return salario;
    }

    public void setsalario (int salario) {
        this.salario = salario;
    }
}
