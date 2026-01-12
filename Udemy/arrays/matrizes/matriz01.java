package arrays.matrizes;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class matriz01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] [] mat = new int[n][n];
        int NegativeNumbers = 0;

        for (int index = 0; index < mat.length; index++) {
            for (int j = 0; j < mat[index].length; j++) {
                mat[index][j] = sc.nextInt();
                if (mat[index][j] < 0){
                    NegativeNumbers++;
                }
            }
        }
        System.out.println("Main diagonal:");
        for (int index = 0; index < mat.length; index++) {
            System.out.println(mat[index][index] + " ");
        }
        System.out.println("Negative Numbers: " + NegativeNumbers);
    }
}
