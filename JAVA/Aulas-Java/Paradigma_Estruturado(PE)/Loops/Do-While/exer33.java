import java.util.Scanner;

public class exer33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dtemp = 0, temp, mtemp = 0, Mtemp = 42;
        char resp = 's';

        System.out.println("Bem-vindo ao Dep. Estadual de Meteorologia.");

        do {
            System.out.print("Informe uma temperatura válida registrada: ");
                temp = in.nextInt();
                    dtemp++;

                    if (temp <= Mtemp) {
                        Mtemp = temp;
                    } else if (temp > mtemp && temp > Mtemp) {
                        mtemp = temp;
                    }

                    if (dtemp == 4) {
                        System.out.println("Deseja continuar ? [s(sim)/n(não)]: ");
                            resp = in.next().charAt(0);
                                if (resp == 's') {
                                    continue;
                                } else if (resp == 'n') {
                                    break;
                                }                       
                    }

        } while (resp == 's');

        System.out.println("A menor temperatura registrada foi de: " + Mtemp + " graus.");
        System.out.println("A maior temperatura registrada foi de: " + mtemp + " graus.");
            
    }
}
