package POO.entities;

public class rect {
    public double width;
    public double height;
    public double area(){
        double area = width * height;
        return area;
    }
    public double Perimeter(){
        double perimetro = (width * 2) + (height * 2);
        return perimetro;
    }
    public double diagonal(){
        double diagonal = (Math.pow(width, 2)) + (Math.pow(height, 2));
        double root = Math.sqrt(diagonal);
        return root;
    }
}
