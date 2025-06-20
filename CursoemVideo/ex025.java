import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class ex025 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Tipos de Triângulo");
        janela.setSize(600, 600);
        janela.getContentPane().setBackground(Color.BLACK);
        janela.setLayout(new BoxLayout(janela.getContentPane(), BoxLayout.Y_AXIS));
        janela.add(Box.createRigidArea(new Dimension(0, 20))); // 30px de espaço pra baixo
        janela.setLocationRelativeTo(null); // Centraliza no meio da tela do computador
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Quando eu fechar a tela da interface já incerra o programa.
        JLabel lbl1 = new JLabel("Tipos de Triângulo");
        lbl1.setForeground(Color.WHITE);
        lbl1.setFont(new Font("Arial", Font.BOLD, 30));
        lbl1.setAlignmentX(Component.CENTER_ALIGNMENT);
        janela.add(lbl1);
        // Cria um painel só para lbl2 + slider (mesma linha)
        JPanel linha1 = new JPanel();
        linha1.setLayout(new FlowLayout(FlowLayout.CENTER));
        linha1.setOpaque(false); // fundo invisível, mantém o fundo preto da janela

        // Segemento 1
        JLabel lbl2 = new JLabel("<html>Segemento <b>a</b>: </html>");
        lbl2.setForeground(Color.WHITE);
        lbl2.setFont(new Font("Arial", Font.ITALIC, 25));
        lbl2.setAlignmentX(Component.CENTER_ALIGNMENT);
        linha1.add(lbl2);

        JSlider slider = new JSlider(0, 20);
        slider.setValue(0); // Valor inicial do nosso input:range
        slider.setMajorTickSpacing(2); // Intervalo entre um número para outro
        slider.setPaintTicks(true); // mostrar os tracinhos
        slider.setPaintLabels(true); // mostrar os valores
        slider.setBackground(Color.BLACK);
        slider.setForeground(Color.WHITE);
        slider.setPreferredSize(new Dimension(300, 50));
        linha1.add(slider);

        // Segmento 2
        JPanel linha2 = new JPanel();
        linha2.setLayout(new FlowLayout(FlowLayout.CENTER));
        linha2.setOpaque(false);

        JLabel lbl3 = new JLabel("<html>Segmento <b>b:</b></html> ");
        lbl3.setBackground(Color.BLACK);
        lbl3.setForeground(Color.WHITE);
        lbl3.setFont(new Font("Arial", Font.ITALIC, 25));
        lbl3.setAlignmentX(Component.CENTER_ALIGNMENT);
        linha2.add(lbl3);

        JSlider slider1 = new JSlider(0, 20);
        slider1.setValue(0); // Valor inicial do nosso input:range
        slider1.setMajorTickSpacing(2); // Intervalo entre um número para outro
        slider1.setPaintTicks(true); // mostrar os tracinhos
        slider1.setPaintLabels(true); // mostrar os valores
        slider1.setBackground(Color.BLACK);
        slider1.setForeground(Color.WHITE);
        slider1.setPreferredSize(new Dimension(300, 50));
        linha2.add(slider1);

        // Segmento 3
        JPanel linha3 = new JPanel();
        linha3.setLayout(new FlowLayout(FlowLayout.CENTER));
        linha3.setOpaque(false);

        JLabel lbl4 = new JLabel("<html>Segmento <b>c</b>: </html>");
        lbl4.setBackground(Color.BLACK);
        lbl4.setForeground(Color.WHITE);
        lbl4.setFont(new Font("Arial", Font.ITALIC, 25));
        lbl4.setAlignmentX(Component.CENTER_ALIGNMENT);
        linha3.add(lbl4);

        JSlider slider2 = new JSlider(0, 20);
        slider2.setValue(0);
        slider2.setMajorTickSpacing(2); // Intervalo entre um número para outro
        slider2.setPaintTicks(true);
        slider2.setPaintLabels(true);
        slider2.setBackground(Color.BLACK);
        slider2.setForeground(Color.WHITE);
        slider2.setPreferredSize(new Dimension(300, 50));
        linha3.add(slider2);

        // Botão
        JButton botao = new JButton("Verificar");
        botao.setCursor(new Cursor(Cursor.HAND_CURSOR));
        botao.setBackground(Color.red);
        botao.setForeground(Color.WHITE);
        botao.setFont(new Font("Arial", Font.BOLD, 25));
        botao.setPreferredSize(new Dimension(300, 40));
        botao.setAlignmentX(Component.CENTER_ALIGNMENT);
        janela.add(botao);
        // Elemento Document Object Model
        JPanel linha5 = new JPanel();
        linha5.setLayout(new FlowLayout(FlowLayout.CENTER));
        linha5.setOpaque(false);

        JLabel lbl5 = new JLabel("<html>Forma um Triângulo</html>");
        lbl5.setForeground(Color.BLUE);
        lbl5.setBackground(Color.BLACK);
        lbl5.setFont(new Font("Arial", Font.BOLD, 25));
        lbl5.setAlignmentX(Component.CENTER_ALIGNMENT);
        linha5.add(lbl5);
        // Classificação do Triângulo
        JPanel linha6 = new JPanel();
        linha6.setLayout(new FlowLayout(FlowLayout.CENTER));
        linha6.setOpaque(false);

        JLabel lbl6 = new JLabel("");
        lbl6.setBackground(Color.BLACK);
        lbl6.setForeground(Color.WHITE);
        lbl6.setFont(new Font("Arial", Font.BOLD, 20));
        lbl6.setAlignmentX(Component.CENTER_ALIGNMENT);
        linha6.add(lbl6);

        // Adiciona a variavel linha á interface gráfica
        linha1.setAlignmentX(Component.CENTER_ALIGNMENT);
        janela.add(linha1);
        linha2.setAlignmentX(Component.CENTER_ALIGNMENT);
        janela.add(linha2);
        linha3.setAlignmentX(Component.CENTER_ALIGNMENT);
        janela.add(linha3);
        janela.add(botao);
        linha5.setAlignmentX(Component.CENTER_ALIGNMENT);
        janela.add(linha5);
        linha6.setAlignmentX(Component.CENTER_ALIGNMENT);
        janela.add(linha6);
        // Craiando a lógica do triângulo
        botao.addActionListener(e -> {
            int segA = (int)(slider.getValue());
            int segB = (int)(slider1.getValue());
            int segC = (int)(slider2.getValue());
            String mensagem;
            // QUAL É O TIPO DE TRIÂNGULO
            if(segA == segB && segA == segC){
                mensagem = String.format("<html>Triângulo Equilátero</html>");
                lbl6.setText(mensagem);
            }else if(segA == segB && segA != segC || segB == segC && segB != segA || segC == segA && segC != segB){
                mensagem = String.format("<html>Triângulo Isósceles</html>");
                lbl6.setText(mensagem);
            }else{
                mensagem = String.format("<html>Triângulo Escaleno</html>");
                lbl6.setText(mensagem);
            }
        });
        janela.setVisible(true);
    }
}
