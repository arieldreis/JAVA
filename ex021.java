import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class ex021 {
    public static void main(String[] args) {
        JFrame janela =  new JFrame("NASCIMENTO");
        janela.setSize(700, 400);
        janela.getContentPane().setBackground(Color.BLACK);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout(FlowLayout.CENTER));
        janela.setLocationRelativeTo(null); // Centraliza a tela no meio do computador.
        JLabel lbl1 = new JLabel("Ano de Nascimento: ");
        lbl1.setForeground(Color.WHITE);
        lbl1.setFont(new Font("Momospaced", Font.BOLD, 18));
        janela.add(lbl1);
        JSpinner input = new JSpinner();
        input.setPreferredSize(new Dimension(200, 30));
        janela.add(input);
        JButton botao = new JButton("Calcular Idade");
        botao.setForeground(Color.white);
        botao.setBackground(Color.RED);
        botao.setCursor(new Cursor(Cursor.HAND_CURSOR));
        janela.add(botao);
        JLabel mensagem = new JLabel("");
        mensagem.setForeground(Color.WHITE);
        mensagem.setFont(new Font("Monospace", Font.BOLD, 18));
        janela.add(mensagem);
        botao.addActionListener(e -> {
            int numero = (int)(input.getValue());
            int idade = 2025 - numero;
            if (idade >= 18 && idade <= 70){
                String resposta = String.format("<html>IDADE: %d<br>SITUAÇÃO: VOTO OBRIGATÓRIO.</html>", idade);
                mensagem.setText(resposta);
            } else if(idade >= 16 && idade < 18){
                String resposta = String.format("<html>IDADE: %d<br>SITUAÇÃO: VOTO FACULTATIVO.</html>", idade);
                mensagem.setText(resposta);
            }
            else{
                String resposta = String.format("<html>IDADE: %d<br>SITUAÇÃO: VOTO NÃO OBRIGATÓRIO</html>", idade);
                mensagem.setText(resposta);
            }
        });
        janela.setVisible(true);
    }
}
