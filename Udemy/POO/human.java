package POO;

import POO.entities.Human;

public class human {
    public static void main(String[] args) {
        Human obj = new Human(12, "John");
        Human obj1 = new Human(18, "Navin");
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());

    }
}
// campo existe porém um valor.
// null = ausência de valor.
