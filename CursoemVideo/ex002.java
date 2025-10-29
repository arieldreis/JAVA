import java.util.Date;

public class ex002 {
    public static final String verde = "\u001B[1;35m";
    public static final String escape = "\u001B[0m";
    public static void main(String[] args){
        Date data = new Date();
        System.out.println( verde + "HORA DO SISTEMA!" + escape);
        System.out.println(data);
    }
} // Meus exercícos de Java
