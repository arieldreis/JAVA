import javax.swing.JOptionPane;
public class ex029 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "<html>Digite o seu <b>Nome:</b></html>");
        int soma = 0;
        int quant = 0;
        while(true){
            int numeros = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Digite um <b>número</b>:</html>"));
            soma+=numeros;
            if(numeros == JOptionPane.CANCEL_OPTION){
                JOptionPane.showMessageDialog(null,
                "<html>" +
                "Olá" +
                nome +
                "olha o resultado das operações abaixo.<br>" +
                "Total de Valores: " +
                "Total de pares: " + 
                "Total de ímpares:" + 
                "Acima de 100:" + 
                "Média dos Valores: " +
                "</html>");
                break;
            }else{
                JOptionPane.showMessageDialog(null, "<html>Valor cadstrado com sucesso.</html>");
            }
        }
    }
}