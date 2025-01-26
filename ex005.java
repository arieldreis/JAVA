import javax.swing.*;
import java.awt.Color;
public class ex005 {
    public static void main(String[] args){
        JFrame janela = new JFrame("Minha Janela com Swing");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.getContentPane().setBackground(Color.CYAN);
        JLabel descricao = new JLabel("DIGITE ALGUMA COISA");
        janela.add(descricao);
        JButton botao = new JButton("Clique Aqui");
        janela.add(botao);
        janela.setSize(600, 400);
        janela.setVisible(true); // Tornando a janela possível de ser vista.
    }
} // Meus exercícos de Jva
// Meus exercícos de Jva
