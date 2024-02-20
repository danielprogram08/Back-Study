public class testelampada {
    public static void main(String[] args) {
        lampada lamp = new lampada();

        lamp.volt = 220;
        lamp.tipo = "incandescente";
        lamp.preco = 12.50;

        System.out.println("Lâmpada: " + lamp.tipo);
        System.out.println("Voltagem: " + lamp.volt);
        System.out.println("Valor: " + lamp.preco);
    }
}
