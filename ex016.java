import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class ex016 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("SOMA DE DOIS NÚMEROS: ");
        janela.setSize(1000, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());
        janela.getContentPane().setBackground(Color.BLACK);
        JLabel mensagem = new JLabel("");
        mensagem.setForeground(Color.WHITE);
        mensagem.setFont(new Font("Arial", Font.BOLD, 16));
        mensagem.setAlignmentX(Component.CENTER_ALIGNMENT);
        janela.add(mensagem);
        JTextField numeroum = new JTextField();
        numeroum.setPreferredSize(new Dimension(200, 30));
        // METODO PARA FAZER A FILTRAGEM DE DADOS
         // ESSA LINHA TRANSFORMA STRING EM NÚMERO.
        janela.add(numeroum);
        JLabel maisSinal = new JLabel("+");
        maisSinal.setForeground(Color.WHITE);
        janela.add(maisSinal);
        JTextField numerodois = new JTextField();
        numerodois.setPreferredSize(new Dimension(200, 30));
        janela.add(numerodois);
        JButton botao = new JButton("=");
        botao.setBackground(Color.RED);
        botao.setForeground(Color.WHITE);
        janela.add(botao);
        JLabel mensagem_vazia = new JLabel("");
        botao.addActionListener(e -> {
            int valueone = Integer.parseInt(numeroum.getText());
            int valuetwo = Integer.parseInt(numerodois.getText());
            int soma = valueone + valuetwo;
            mensagem_vazia.setText("" + soma);
        });
        mensagem_vazia.setForeground(Color.WHITE);
        janela.add(mensagem_vazia);
        janela.setVisible(true);
    }
}