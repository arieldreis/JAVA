import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class ex019 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("OPERAÇÕES MATEMÁTICAAS");
        janela.setSize(270, 500);
        janela.setLayout(new FlowLayout(FlowLayout.CENTER));
        janela.getContentPane().setBackground(Color.BLACK);
        JLabel lbl1 = new JLabel("Numerador: ");
        lbl1.setForeground(Color.WHITE);
        lbl1.setFont(new Font("Arial", Font.ITALIC, 16));
        janela.add(lbl1);
        JTextField input1 = new JTextField();
        input1.setPreferredSize(new Dimension(200, 30));
        janela.add(input1);
        JLabel lbl2 = new JLabel("Denominador: ");
        lbl2.setForeground(Color.WHITE);
        lbl2.setFont(new Font("Arial", Font.ITALIC, 16));
        janela.add(lbl2);
        JTextField input2 = new JTextField();
        input2.setPreferredSize(new Dimension(200, 30));
        janela.add(input2);
        JButton botao = new JButton("CLICK ON");
        botao.setBackground(Color.RED);
        botao.setForeground(Color.WHITE);
        botao.setCursor(new Cursor(Cursor.HAND_CURSOR));
        botao.setFont(new Font("Arial", Font.ITALIC, 16));
        janela.add(botao);
        JLabel mensagem_vazia = new JLabel("CLIQUE NO BOTÃO.");
        mensagem_vazia.setForeground(Color.WHITE);
        mensagem_vazia.setFont(new Font("Arial", Font.ITALIC, 16));
        janela.add(mensagem_vazia);
        botao.addActionListener(e -> {
            int numero1 = Integer.parseInt(input1.getText());
            int numero2 = Integer.parseInt(input2.getText());
            float divisao = (float) numero1 / numero2;
            double raiz = Math.sqrt(numero1);
            mensagem_vazia.setText("Divisão: " + divisao + " Raiz: " + raiz);
        });
        janela.setVisible(true);
    }
}