package estrutura_condicao;

public class condicao06 {
    public static void main(String[] args) {
        int a = 200;
        int b = 33;
        int c = 500;

        if (a > b || a > c) {
            System.out.println("At least one condition is true");
        }
        if (!(a > b)) {
            System.out.println("a is NOT greater than b");
        }

        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3; // 1 = highest

        if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }
}
