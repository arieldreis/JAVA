package arrays.forEach;

public class forEach01 {
    public static void main(String[] args) {
        String[] comidas = {"Arroz", "Feijão", "Frango", "Salada", "Creatina", "WheyProtein"};
        for(String comida : comidas){
            System.out.println("Eu como essas comidas para ganhar massa " + comida);
        }
    }
}
