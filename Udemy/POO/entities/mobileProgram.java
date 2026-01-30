package POO.entities;

public class mobileProgram {
    static public String brand;
    public int price;
    public String network;
    public String name;

    public void show(){
        System.out.printf("%s: %s\n",brand,price);
    }

    public static void show1(mobileProgram obj){
        System.out.printf("%s: %s\n",brand,obj.price);
    }
}
