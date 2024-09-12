package Notebook;

public class notebook {
    private String marca;
    private String modelo;
    private String cor;
    
    public notebook() {}

    public notebook(String marca, String modelo, String cor) {
      this.marca = marca;
      this.modelo = modelo;
      this.cor = cor;
    }
  
    public String getmarca() {
      return marca;
    }
  
    public void setmarca(String marca) {
      this.marca = marca;
    }
  
    public String getmodelo() {
      return modelo;
    }
  
    public void setmodelo(String modelo) {
      this.modelo = modelo;
    }
  
    public String getcor() {
      return cor;
    }
  
    public void setcor(String cor) {
      this.cor = cor;
    }

    public static String LigarNotebook() {
      String mensagem;
      mensagem = "Notebook Ligado";
      return mensagem;
    }

    public static String DesligarNotebook() {
      String mensagem;
      mensagem = "Notebook Desligado";
      return mensagem;
    }
  
    public String toString() {
        System.out.println();
      return "notebook: " + marca + "\n" + "modelo: " + modelo + "\n" + "cor: " + cor;
    }
  }
