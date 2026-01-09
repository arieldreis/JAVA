package arrays.listas;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class list03 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Maria");
        lista.add("Alex");
        lista.add("Bob");
        lista.add("Anna");
        lista.add(2, "Marco"); // Irá adicionar o nome "Marcos" na posição 2 da lista.

        System.out.println(lista.size()); // mostra o tamanho da lista;
        System.out.println("-----------------------------");
        for(String x : lista){
            System.out.println("Nomes: " + x);
        }

        lista.removeIf(x -> x.charAt(0) == 'M'); // Remove os caracteres que começam com a letra 'M'.
        for(String x : lista){
            System.out.println("Nomes: " + x);
        }
        System.out.println("------------------------------");
        System.out.println("Index of Bob: " + lista.indexOf("Bob")); // índice do nome 'Bob'.
        System.out.println("Index of Marco: " + lista.indexOf("Marco")); // Indíce do nome 'Marco'.
        System.out.println("--------------------------------");
        List<String> result = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        /*
        filters a list of strings (lista) and creates a new list (result)
        containing only the strings that start with the character 'A'.
         */
        for(String x : lista){
            System.out.println("Nomes: " + x);
        }
        System.out.println("----------------------------");
        String name = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}
