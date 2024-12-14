package Exceptions.MyException;

public class NaoInteiroException extends Exception {
    protected int num;
    protected int demon;

    public NaoInteiroException(int num, int demon) {
        super();
        this.num = num;
        this.demon = demon;
    }

    @Override
    public String toString() {
        return "Resultado de " + num + " / " + demon + " não é inteiro!";
    }

}