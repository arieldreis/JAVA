package arrays.matrizes;
import java.util.Random;

public class matriz06 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        for(int index = 0; index < matriz.length; index++){
            for(int j = 0; j < matriz[index].length; j++){
                int RandomNum = (int) (Math.random() * 100);
                matriz[index][j] = RandomNum;
                System.out.println(matriz[index][j] + "\t");
            }
            System.out.println();
        }
    }
}
