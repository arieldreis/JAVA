import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex027 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Estrutura de Repetição");
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.getContentPane().setBackground(Color.BLACK);
        janela.setLayout(new BoxLayout(janela.getContentPane(), BoxLayout.Y_AXIS));
        janela.add(Box.createRigidArea(new Dimension(0, 15)));
        janela.setSize(500, 500);
        JLabel lbl1 = new JLabel("Aperte o Botão");
        lbl1.setBackground(Color.BLACK);
        lbl1.setForeground(Color.WHITE);
        lbl1.setFont(new Font("Arial", Font.BOLD, 20));
        lbl1.setAlignmentX(Component.CENTER_ALIGNMENT);
        janela.add(lbl1);
        JButton button = new JButton("Teste");
        button.setBackground(Color.RED);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 20));
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        janela.add(button);
        JLabel lbl2 = new JLabel("");
        lbl2.setBackground(Color.BLACK);
        lbl2.setForeground(Color.WHITE);
        lbl2.setFont(new Font("Arial", Font.BOLD, 20));
        lbl2.setAlignmentX(Component.CENTER_ALIGNMENT);
        janela.add(lbl2);
        button.addActionListener(e -> {
            StringBuilder resposta = new StringBuilder("<html>");
            for(int cont = 0; cont <= 10; cont+=1){
                resposta.append(cont + " \u2192 ");
            }
            resposta.append("</html>");
            lbl2.setText(resposta.toString());
        });
        janela.setVisible(true);
    }
}
