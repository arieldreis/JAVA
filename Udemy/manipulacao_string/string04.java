package manipulacao_string;

public class string04 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(" Navin ");
        System.out.println(sb.capacity());
        sb.append(4); // Add a new element in this string.
        sb.insert(6, "Java"); // Add a new element according to its position.
        sb.setLength(30);
        System.out.println(sb);
    }
}
