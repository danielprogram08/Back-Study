package Método_Simples.Exer01;

public class Lampada {
    int luz;

    void interruptor() {
        if (luz == 0) {
            System.out.println("OFF");        
        } else if (luz == 1) {
            System.out.println("ON");
        }
    }
}