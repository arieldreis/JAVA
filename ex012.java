import java.util.Scanner;
public class ex012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE O VALOR DA COMPRA:R$ ");
        float compra = sc.nextFloat();
        if(compra > 100){
            float desconto = compra - (compra * 0.1f);
            System.out.println("O VALOR FINAL DA COMPRA É:R$" + desconto);
        }else{
            System.out.println("O VALOR FINAL DA COMPRA É DE:R$" + compra);
        }
    }
}