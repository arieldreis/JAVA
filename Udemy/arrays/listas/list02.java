package arrays.listas;

import java.util.ArrayList;
import java.util.List;

public class list02 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("Fiat");
        cars.add("Tesla");

        for(String x : cars){
            System.out.println("Meus carros: " + x);
        }
    }
}
