import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.time.Year;
public class ex017 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("CALCULADORA DE IDADE:");
        janela.setSize(900, 400);
        janela.setLayout(new FlowLayout(FlowLayout.CENTER));
        janela.getContentPane().setBackground(Color.BLACK);
        int ano = Year.now().getValue();
        JLabel mensagem = new JLabel("ANO DE NASCIMENTO: ");
        mensagem.setFont(new Font("Arial", Font.ITALIC, 16));
        mensagem.setForeground(Color.WHITE);
        janela.add(mensagem);
        JSpinner datanascimento = new JSpinner();
        datanascimento.setPreferredSize(new Dimension(200, 30));
        janela.add(datanascimento);
        JButton botaozinho = new JButton("CLICK");
        botaozinho.setBackground(Color.RED);
        botaozinho.setForeground(Color.WHITE);
        botaozinho.setCursor(new Cursor(Cursor.HAND_CURSOR));
        botaozinho.setFont(new Font("Arial", Font.ITALIC, 16));
        janela.add(botaozinho);
        JLabel mensagem_vazia = new JLabel("");
        mensagem_vazia.setForeground(Color.WHITE);
        mensagem_vazia.setFont(new Font("Arial", Font.ITALIC, 16));
        janela.add(mensagem_vazia);
        botaozinho.addActionListener(e -> {
            int valueum = (int)(datanascimento.getValue());
            int idade = ano - valueum;
            if (valueum <= 0 ){
                mensagem_vazia.setText("O Valor digitado é negativo digite um novo valor.");
            }  else {
                mensagem_vazia.setText("No final desse ano, sua idade será " + idade + " anos");
            }
        });
        janela.setVisible(true);
    }
}