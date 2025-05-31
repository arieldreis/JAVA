import javax.swing.JOptionPane;
public class ex008 {
    public static void main(String[] args){
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "QUANTOS ANOS VOCÊ TEM? "));
        int meses = (idade * 12);
        int dias = (idade * 365);
        int minutos = (idade * 525960);
        // String dados = String.format("UMA PESSOA COM %d ANOS TEM\n %d MESES %f DIAS E %f minutos", idade, meses, dias, minutos);
        JOptionPane.showMessageDialog(null, "UMA PESSOA QUE " + idade + " ANOS, TEM " + meses + " MESES " + dias + " DIAS " + minutos + " MINUTOS");
    }
}