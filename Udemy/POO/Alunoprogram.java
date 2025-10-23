import entities.aluno;
import java.util.Locale;
import java.util.Scanner;
public class Alunoprogram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);
        aluno AlunoPack = new aluno();
        System.out.println("Name: ");
        AlunoPack.nome = sc.nextLine();
        System.out.println("Type the notes: ");
        AlunoPack.notaone = sc.nextDouble();
        AlunoPack.notatwo = sc.nextDouble();
        AlunoPack.notathree = sc.nextDouble();

        System.out.println(AlunoPack.situacao());
    }
}
