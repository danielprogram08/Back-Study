package Notebook;

import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    String marca, modelo, cor, powerbutton;

    System.out.println();
    System.out.print("Digite a marca do notebook: ");
    marca = in.nextLine();
    System.out.print("Digite o modelo do notebook: ");
    modelo = in.nextLine();
    System.out.print("Digite a cor do notebook: ");
    cor = in.nextLine();

    notebook Notebook = new notebook(marca, modelo, cor);

    System.out.println("Power: Ligar (I)/Desligar (O): ");
    powerbutton = in.nextLine();
    if (powerbutton == "i") {
      notebook.LigarNotebook();
    } else if (powerbutton == "o") {
      notebook.DesligarNotebook();
    }

    System.out.println();
    System.out.print("Digite a marca do segundo notebook: ");
    marca = in.nextLine();
    System.out.print("Digite o modelo do segundo notebook: ");
    modelo = in.nextLine();
    System.out.print("Digite a cor do segundo notebook: ");
    cor = in.nextLine();

    notebook Notebook2 = new notebook();

    Notebook2.setcor(cor);
    Notebook2.setmodelo(modelo);
    Notebook2.setmarca(marca);

    System.out.println(Notebook.toString());
    System.out.println();
    System.out.println(Notebook2.toString());
  }
}