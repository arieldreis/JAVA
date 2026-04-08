package enumeracao_composicao.exercicios.entities;

public class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public void department(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
