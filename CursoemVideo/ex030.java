import javax.swing.JOptionPane;
public class ex030 {
    public static void main(String[] args) {
        int soma = 0;
        while (true){
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
            soma+=numero;
            int confirm = JOptionPane.showConfirmDialog(null, "Quer continuar: [S/N]: ");
            if (confirm == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "<html>Valores cadastrado com sucesso</html>");
            } else {
                JOptionPane.showMessageDialog(null,  "<html>A soma dos valores<br>Digitados é de " + soma);
                break;
            }
        }
    }
}
