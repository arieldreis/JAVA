package estrutura_condicao;

public class condicao02 {
    public static void main(String[] args) {
        boolean isRaining = true;
        if (isRaining) {
            System.out.println("Bring an umbrella!");
        }

        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }

        int a = 20;
        int b = 20;
        if (a == b) {
            System.out.println("x is equal to y");
        }

        boolean isLightOn = false;

        if (isLightOn) {
            System.out.println("The light is on.");  // This will not be printed
        }

        System.out.println("This line runs no matter what, because it is outside the if statement.");
    }
}
