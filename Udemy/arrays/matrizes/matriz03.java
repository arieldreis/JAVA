package arrays.matrizes;
// como achar a posição em uma matriz.
public class matriz03 {
    public static void main(String[] args) {
        int mat[][] = new int[5][5];

        for(int index = 0; index < 5; index++){
            for(int j = 0; j < 5; j++){
                System.out.printf("Posição: %d, %d\n", index, j);
            }
        }
    }
}
