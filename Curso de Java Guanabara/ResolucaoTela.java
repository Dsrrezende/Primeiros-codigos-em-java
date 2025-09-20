import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {
    public static void main(String[] args) {
      Toolkit toolkit = Toolkit.getDefaultToolkit(); //acessa as configurações da tela
      Dimension tela = toolkit.getScreenSize(); //pega a resolução da tela
      System.out.println("A resolução da tela é: " + tela.width + "x" + tela.height); //mostra a resolução da tela
    }
}
