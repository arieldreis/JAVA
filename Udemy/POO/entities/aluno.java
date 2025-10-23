package entities;
public class aluno {
    public String nome;
    public double notaone;
    public double notatwo;
    public double notathree;
    public String situacao(){
        double media = (notaone + notatwo + notathree);
        if(media > 60){
            return "FINAL GRADE = " + media + "\n\u001B[32mPASS\u001B[0m";
        }else{
            double points = 60 - media;
            return "FINAL GRADE = " + media + "\n\u001B[31mFAILED\u001B[0m\n" + "MISSING " + points + " points.";
        }
    }
}
