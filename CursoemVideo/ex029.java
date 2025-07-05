import javax.swing.JOptionPane;
public class ex029 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "<html>Digite o seu <b>Nome:</b></html>");
        int soma = 0;
        int totalValues = 0;
        int pares = 0;
        int impares = 0;
        int acimaCem = 0;
        double mediaValues = 0;
        int numeros;
        do{
            numeros = Integer.parseInt(
                    JOptionPane.showInputDialog(null,
                            "<html>Digite um <b>número</b>:<br><em>(0 interrompe)</em></html>"));
                if (numeros != 0){
                    totalValues++;
                    if (numeros % 2 == 0){
                        pares++;
                    }
                    if (numeros % 2 == 1){
                        impares++;
                    }
                    if(numeros > 100){
                        acimaCem++;
                    }
                }
            soma+=numeros;
        }while (numeros != 0);
        mediaValues = soma / totalValues;
        JOptionPane.showMessageDialog(null,
                "<html>" +
                        "<h3>Olá " +
                        nome +
                        "!</h3><br>" +
                        "Veja o resultado das operações abaixo.<br>" +
                        "Soma dos Valores: " +
                        soma +
                        "<br>Total de Valores: " +
                        totalValues +
                        "<br>Total de pares: " +
                        pares +
                        "<br>Total de ímpares: " +
                        impares +
                        "<br>Acima de 100: " +
                        acimaCem +
                        "<br>Média dos Valores: " +
                        mediaValues +
                        "</html>");
    }
}
