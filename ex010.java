import javax.swing.*; // Essa biblioteca permite abrir uma interface gráfica
import javax.swing.text.IconView;
import java.awt.*;
import java.awt.event.ActionListener; // Essa linha faz com que ative uma função do onclick
import java.util.Date; // Essa linha ativa a data do dia atual

public class ex010 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("CALENDÁRIO");
        janela.setSize(500, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.getContentPane().setBackground(Color.lightGray);
        janela.setLayout(new BoxLayout(janela.getContentPane() , BoxLayout.Y_AXIS));
        Date data = new Date();
        JLabel mensagem = new JLabel("DATA E HORA ATUAIS");
        mensagem.setForeground(Color.WHITE);
        mensagem.setFont(new Font("Arial", Font.BOLD, 16));
        mensagem.add(Box.createVerticalStrut(20));
        janela.add(mensagem);
        JButton botao = new JButton("CLICK ON");
        botao.setBackground(Color.RED);
        botao.setForeground(Color.WHITE);
        JLabel mensagem_vazia = new JLabel("CLIQUE NO BOTÃO ABAIXO");
        mensagem_vazia.setForeground(Color.WHITE);
        janela.add(mensagem_vazia);
        janela.add(Box.createVerticalStrut(40));
        botao.addActionListener(e -> mensagem_vazia.setText("DATA DE HOJE: " + data));
        botao.setCursor(new Cursor(Cursor.HAND_CURSOR));
        mensagem.setAlignmentX(Component.CENTER_ALIGNMENT); // Essa linha irá centralizar o o label
        botao.setAlignmentX(Component.CENTER_ALIGNMENT); // Essa linha centraliza o botão no centro da interface gráfica.
        mensagem_vazia.setAlignmentX(Component.CENTER_ALIGNMENT);
        janela.add(botao);
        janela.setVisible(true);
    }
}