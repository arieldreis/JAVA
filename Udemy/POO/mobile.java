package POO;
import POO.entities.mobileProgram;
public class mobile {
    public static void main(String[] args) {
        mobileProgram obj = new mobileProgram();

        mobileProgram.brand = "Apple"; // Static method
        obj.price = 1500;
        obj.name = "Smartphone";

        mobileProgram obj2 = new mobileProgram();
        mobileProgram.brand = "Samsung"; // Static method
        obj2.price = 1700;
        obj2.name = "Smartphone";

        obj.show();
        obj2.show();

        mobileProgram.show1(obj);
    }
}
