import javax.swing.JOptionPane;
public class ex009 {
    public static void main(String[] args) {
        float notaum = Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE SUA NOTA: "));
        float notadois = Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE SUA NOTA: "));
        float notatres = Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE SUA NOTA: "));
        float media = (notaum + notadois + notatres) / 3;
        JOptionPane.showMessageDialog(null, "A MÉDIA DOS VALORES É DE " + media);
    }
}