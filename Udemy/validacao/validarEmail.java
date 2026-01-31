package validacao;
import java.util.Scanner;
// import org.apache.commons.lang3.StringUtils;
public class validarEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        /*if(!StringUtils.isEmail(input)){
            throw new IllegalArgumentException("E-mail inválido");
        }*/

        System.out.println("E-mail válido " + input);
    }
}
