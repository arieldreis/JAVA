import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class ex022 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Formula de Bhaskara");
        janela.getContentPane().setBackground(Color.BLACK);
        janela.setLayout(new FlowLayout(FlowLayout.CENTER));
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janela.setSize(500, 400);
        janela.setLocationRelativeTo(null); // CENTRALIZA NO CENTRO DA TELA.
        JSpinner input1 = new JSpinner();
        input1.setPreferredSize(new Dimension(50, 30));
        janela.add(input1);
        JLabel lbl1 = new JLabel("<html>x<sup>2</sup> + </html>");
        lbl1.setForeground(Color.WHITE);
        lbl1.setFont(new Font("Monospace", Font.BOLD, 16));
        janela.add(lbl1);
        JSpinner input2 = new JSpinner();
        input2.setPreferredSize(new Dimension(50, 30));
        janela.add(input2);
        JLabel lbl2 = new JLabel("<html>x +</html>");
        lbl2.setForeground(Color.WHITE);
        lbl2.setFont(new Font("Monospace", Font.BOLD, 16));
        janela.add(lbl2);
        JSpinner input3 = new JSpinner();
        input3.setPreferredSize(new Dimension(50, 30));
        janela.add(input3);
        JLabel lbl3 = new JLabel("<html>= 0</html>");
        lbl3.setFont(new Font("Monospace", Font.BOLD, 16));
        lbl3.setForeground(Color.WHITE);
        janela.add(lbl3);
        JButton botao = new JButton("Calcular Δ");
        botao.setBackground(Color.RED);
        botao.setForeground(Color.WHITE);
        botao.setCursor(new Cursor(Cursor.HAND_CURSOR));
        janela.add(botao);
        JLabel vazio = new JLabel("");
        vazio.setForeground(Color.WHITE);
        vazio.setFont(new Font("Monospace", Font.BOLD, 16));
        janela.add(vazio);
        botao.addActionListener(e -> {
            int value1 = (int)(input1.getValue());
            int value2 = (int)(input2.getValue());
            int value3 = (int)(input3.getValue());
            String resultado = String.format("<html>Δ = %d<sup>2</sup>-4. %d . %d<br>", value2, value1, value3);
            float delta = (value2 * value2) - (4 * value1 * value3);
            String valor;
            if (delta >= 0){
                 valor = String.format("Δ = %.2f<br>Tipo = Existem rizes Reais</html>", delta);
            } else {
                valor = String.format("Δ = %.2f<br>Tipo = Não existem rizes Reais</html>", delta);
            }
            vazio.setText(resultado + valor);
        });
        janela.setVisible(true);
    }
}
