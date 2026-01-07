package estrutura_condicao;

public class condicao05 {
    public static void main(String[] args) {
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        int time1 = 22;
        String message = (time1 < 12) ? "Good morning."
                : (time1 < 18) ? "Good afternoon."
                : "Good evening.";
        System.out.println(message);
    }
}
