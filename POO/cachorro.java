public class cachorro {
    String nome;
    String raca;
    int idade;
    static void latir(){ // Building a method in Java.
        System.out.println("Au Au!");
    }
    public cachorro(String nome, String raca, int idade){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }
    public static void main(String[] args) {
        latir();
        cachorro mydog = new cachorro("Bolt", "Husky", 3);
        System.out.println("Nome: " + mydog.nome);
        System.out.println("Raça: " + mydog.raca);
        System.out.println("Idade: " + mydog.idade + " anos.");
    }
}
