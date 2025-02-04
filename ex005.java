import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class ex005 {
    public static void main(String[] args){
        JFrame janela = new JFrame("MINHA INTERFACE DO CURSO EM VÍDEO.");
        janela.setSize(600, 600);
        janela.setLayout(new BoxLayout(janela.getContentPane() , BoxLayout.Y_AXIS)); // DEIXA OS ELEMENTOS EM COLUNAS.
        janela.getContentPane().setBackground(Color.BLACK);
        JLabel mensagem = new JLabel("MINHA MENSAGEM VAI APARECER AQUI!");
        mensagem.setForeground(Color.WHITE);
        janela.add(mensagem);
        janela.add(Box.createVerticalStrut(20)); // Aqui adiciona o espaçamento de 20px entre a mensagem_vazia eo botão
        JButton botao = new JButton("CLICK!");
        botao.setBackground(Color.RED);
        botao.setForeground(Color.WHITE);
        botao.setCursor(new Cursor(Cursor.HAND_CURSOR));
        JLabel mensagem_vazia = new JLabel(""); // Quando o usuário apertar o botão será disparado um evento onde vai aprecer uma mensagem.
        janela.add(mensagem_vazia);
        janela.add(Box.createVerticalStrut(20)); // Aqui adiciona o espaçamento de 20px entre a mensagem_vazia eo botão
        mensagem_vazia.setForeground(Color.WHITE);
        botao.addActionListener(e -> mensagem_vazia.setText("SALVE!"));
        botao.addActionListener(e -> JOptionPane.showMessageDialog(botao, "SALVE, DE BOA!")); // Essa linha de código irá abrir um POP-up
        janela.add(botao);
        // Alinhando os botões ao centro
        mensagem.setAlignmentX(Component.CENTER_ALIGNMENT);
        botao.setAlignmentX(Component.CENTER_ALIGNMENT);
        mensagem_vazia.setAlignmentX(Component.CENTER_ALIGNMENT);
        janela.setVisible(true);
    }
}
