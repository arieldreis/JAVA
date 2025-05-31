import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class ex020 {
    public static void main(String[] args) {
    JFrame janela = new JFrame("CALCULADORA");
    janela.setSize(800, 400);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.getContentPane().setBackground(Color.BLACK);
    janela.setLayout(new FlowLayout(FlowLayout.CENTER));
    janela.setLocationRelativeTo(null); // Centraliza a tela no meio do computador.
    JLabel lbl1 = new JLabel("<html>INFORME UM VALOR: </html>");
    lbl1.setForeground(Color.WHITE);
    lbl1.setFont(new Font("Monospaced", Font.BOLD, 18));
    janela.add(lbl1);
    JSpinner input = new JSpinner(new SpinnerNumberModel(1, 0, 1000, 1)); // Igual ao input do html min max step e value
    input.setPreferredSize(new Dimension(200, 30));
    janela.add(input);
    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    // CONFIGURAÇÃO DO LAYOUT
    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.anchor = GridBagConstraints.CENTER; // CENTRALIZA
    gbc.insets = new Insets(10, 10, 10, 10);
    janela.add(panel, gbc);
    JButton botao = new JButton("Calcular");
    botao.setForeground(Color.WHITE);
    botao.setBackground(Color.RED);
    botao.setCursor(new Cursor(Cursor.HAND_CURSOR));
    janela.add(botao);
    JLabel mensagem = new JLabel("");
    mensagem.setForeground(Color.WHITE);
    mensagem.setFont(new Font("Monospaced", Font.BOLD, 18));
    janela.add(mensagem);
    botao.addActionListener(e -> {
        int numero = (int)(input.getValue());
        float resto = numero % 2; // Resto da divisão de um número.
        double cubo = Math.pow(numero, 3); // Um número elevado ao cubo.
        double raiz = Math.sqrt(numero); // Raiz Quadrada
        double cubica = Math.cbrt(numero);
        String resposta = String.format("<html>Resto da Divisão por 2: %.2f<br>Elevado ao Cubo: %.2f<br>Raiz Quadrada: %.2f<br>Raiz Cúbica: %.2f</html>"
                , resto, cubo, raiz, cubica);
        mensagem.setText(resposta);
    });
    janela.setVisible(true);
    }
}