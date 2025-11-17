package manipulacao_string;

public class ex0004 {
    public static void main(String[] args) {
        String txt = "I love too much Java!";
        System.out.println(txt.toLowerCase());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.trim());
        System.out.println(txt.substring(3, 12));
        System.out.println(txt.substring(4));
        System.out.println(txt.replace("Java", "Python"));
        System.out.println("A palavra 'much' começa no índice " + txt.indexOf("much"));
        System.out.println("A palavra 'much' começa no índice " + txt.indexOf("planet")); // Estará no indice negativo pq essa palavra não existe nessa variável.
        System.out.println(txt.lastIndexOf("too"));
        // como fatiar uma string
        String[] vect  = txt.split(" ");
        String word1 = vect[0];
        System.out.println(word1);
        String word2 = vect[1];
        System.out.println(word2);
        String word3 = vect[2];
        System.out.println(word3);
        String word4 = vect[3];
        System.out.println(word4);
        String word5 = vect[4];
        System.out.println(word5);
    }
}
