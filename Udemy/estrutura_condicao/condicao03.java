package estrutura_condicao;

public class condicao03 {
    public static void main(String[] args) {
        boolean isRaining = false;

        if (isRaining) {
            System.out.println("Bring an umbrella!");
        } else {
            System.out.println("No rain today, no need for an umbrella!");
        }

        int time = 20;

        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
// Outputs "Good evening."
    }
}
