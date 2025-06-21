import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionListener;
public class ex028 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("EXPONENCIAÇÃO");
        janela.getContentPane().setBackground(Color.BLACK);
        janela.setLayout(new BoxLayout(janela.getContentPane(), BoxLayout.Y_AXIS));
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janela.add(Box.createRigidArea(new Dimension(0, 20)));
        janela.setSize(700, 400);
        /// Colocando os elementos em uma única linha
        JPanel row = new JPanel();
        row.setAlignmentX(Component.CENTER_ALIGNMENT);
        row.setOpaque(false);
        SpinnerNumberModel model = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1); // AQUI IRÁ COLOCAR O VALOR MAXIMO NO jSpinner, que não irá permitir número negativo e o pulo de 1 em 1.
        JSpinner expoWindow = new JSpinner(model);
        expoWindow.setPreferredSize(new Dimension(100, 40));
        row.add(expoWindow);
        JLabel lbl1 = new JLabel("! = ");
        lbl1.setBackground(Color.BLACK);
        lbl1.setForeground(Color.WHITE);
        lbl1.setFont(new Font("Arial", Font.BOLD, 20));
        lbl1.setAlignmentX(Component.CENTER_ALIGNMENT);
        row.add(lbl1);
        JLabel lbl2 = new JLabel(" Resultado");
        lbl2.setBackground(Color.BLACK);
        lbl2.setForeground(Color.RED);
        lbl2.setFont(new Font("Arial", Font.BOLD, 20));
        lbl2.setAlignmentX(Component.CENTER_ALIGNMENT);
        row.add(lbl2);
        row.setAlignmentX(Component.CENTER_ALIGNMENT);
        janela.add(row);
        expoWindow.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int expoente = (int)(expoWindow.getValue());
                int mult = 1;
                StringBuilder conta = new StringBuilder();
                String resposta;
                for(int cont = 1; cont <= expoente; cont+=1){
                    mult*=cont;
                    conta.append(cont);
                    if(cont < expoente){
                        conta.append(" x ");
                    }
                }
                conta.append(" = ").append(mult);
                lbl2.setText(conta.toString());
            }
        });
        janela.setVisible(true);
    }
}
