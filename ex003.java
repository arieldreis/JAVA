import java.awt.Toolkit;
import java.awt.Dimension;
public class ex003 {
    public static void main(String[] args){
        Toolkit tamanho = Toolkit.getDefaultToolkit();
        Dimension tamanho_tela = tamanho.getScreenSize();
        System.out.println("Sua tela tem a resolução em " + tamanho_tela.width + " x " + tamanho_tela.height);
    }
}// Meus exercícos de Java