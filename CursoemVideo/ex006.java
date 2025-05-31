import javax.swing.JOptionPane;

public class ex006 {
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog("Digite o seu nome:");
        JOptionPane.showMessageDialog(null ,"O SEU NOME É " + nome);
    }
}