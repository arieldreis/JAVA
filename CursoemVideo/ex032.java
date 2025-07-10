import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class ex032 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Progressão Aritimética");
        janela.setLayout(new BoxLayout(janela.getContentPane(), BoxLayout.Y_AXIS));
        janela.getContentPane().setBackground(Color.BLACK);
        janela.setSize(600, 500);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Criação da DIV para alinhar os componentes na mesma linha
        JPanel linha = new JPanel();
        linha.setLayout(new FlowLayout(FlowLayout.CENTER));
        linha.setOpaque(false);

        JLabel lbl1 = new JLabel("Início: ");
        lbl1.setBackground(Color.BLACK);
        lbl1.setForeground(Color.WHITE);
        lbl1.setFont(new Font("Arial", Font.BOLD, 20));
        lbl1.setAlignmentX(Component.CENTER_ALIGNMENT);
        linha.add(lbl1);

        JSlider slider = new JSlider(0, 5);
        slider.setValue(0);
        slider.setMajorTickSpacing(1); // Intervalo entre um número para outro
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setBackground(Color.BLACK);
        slider.setForeground(Color.WHITE);
        slider.setPreferredSize(new Dimension(200, 50));
        linha.add(slider);

        JPanel linha1 = new JPanel();
        linha1.setLayout(new FlowLayout(FlowLayout.CENTER));
        linha1.setOpaque(false);

        JLabel lbl2 = new JLabel("Fim: ");
        lbl2.setBackground(Color.BLACK);
        lbl2.setForeground(Color.WHITE);
        lbl2.setFont(new Font("Arial", Font.BOLD, 20));
        lbl2.setAlignmentX(Component.CENTER_ALIGNMENT);
        linha1.add(lbl2);

        JSlider slider1 = new JSlider(6, 20);
        slider1.setValue(0);
        slider1.setMajorTickSpacing(1); // Intervalo entre um número para outro
        slider1.setPaintTicks(true);
        slider1.setPaintLabels(true);
        slider1.setBackground(Color.BLACK);
        slider1.setForeground(Color.WHITE);
        slider1.setPreferredSize(new Dimension(400, 50));
        linha1.add(slider1);

        JPanel linha2 = new JPanel();
        linha2.setLayout(new FlowLayout(FlowLayout.CENTER));
        linha2.setOpaque(false);

        JLabel lbl3 = new JLabel("Passo: ");
        lbl3.setBackground(Color.BLACK);
        lbl3.setForeground(Color.WHITE);
        lbl3.setFont(new Font("Arial", Font.BOLD, 20));
        lbl3.setAlignmentX(Component.CENTER_ALIGNMENT);
        linha2.add(lbl3);

        JSlider slider2 = new JSlider(1, 6);
        slider2.setValue(0);
        slider2.setMajorTickSpacing(1); // Intervalo entre um número para outro
        slider2.setPaintTicks(true);
        slider2.setPaintLabels(true);
        slider2.setBackground(Color.BLACK);
        slider2.setForeground(Color.WHITE);
        slider2.setPreferredSize(new Dimension(200, 50));
        linha2.add(slider2);
        // Botão
        JButton botao = new JButton("Verificar");
        botao.setCursor(new Cursor(Cursor.HAND_CURSOR));
        botao.setBackground(Color.red);
        botao.setForeground(Color.WHITE);
        botao.setFont(new Font("Arial", Font.BOLD, 25));
        botao.setPreferredSize(new Dimension(300, 40));
        botao.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel linha3 = new JPanel();
        linha3.setLayout(new FlowLayout(FlowLayout.CENTER));
        linha3.setOpaque(false);

        JLabel lbl4 = new JLabel("");
        lbl4.setBackground(Color.BLACK);
        lbl4.setForeground(Color.WHITE);
        lbl4.setFont(new Font("Arial", Font.BOLD, 20));
        lbl4.setAlignmentX(Component.CENTER_ALIGNMENT);
        linha3.add(lbl4);

        linha.setAlignmentX(Component.CENTER_ALIGNMENT);
        janela.add(linha);
        linha1.setAlignmentX(Component.CENTER_ALIGNMENT);
        janela.add(linha1);
        linha2.setAlignmentX(Component.CENTER_ALIGNMENT);
        janela.add(linha2);
        janela.add(botao);
        linha3.setAlignmentX(Component.CENTER_ALIGNMENT);
        janela.add(linha3);
        botao.addActionListener(e -> {
            int inicio = (int)(slider.getValue());
            int fim = (int)(slider1.getValue());
            int pulo = (int)(slider2.getValue());
            StringBuilder resposta = new StringBuilder();
            for(int cont = inicio; cont <= fim; cont+=pulo){
                resposta.append(cont + " ➡ ");
            }
            lbl4.setText(resposta.toString());
        });
        janela.setVisible(true);
    }
}
