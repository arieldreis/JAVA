package operadores;

public class relacionais {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        System.out.println(x > y); // returns true, because 5 is higher than 3

        int age = 18;

        System.out.println(age >= 18); // true, old enough to vote
        System.out.println(age < 18);  // false

        int passwordLength = 5;

        System.out.println(passwordLength >= 8); // false, too short
        System.out.println(passwordLength < 8);  // true, needs more characters
    }
}
