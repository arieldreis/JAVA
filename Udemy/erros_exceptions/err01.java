package erros_exceptions;

public class err01 {
    public static void main(String[] args) {
        try{
            int resultado = dividir(10, 2);
            System.out.println("Resultado: " + resultado);
        }catch(MeuException e){
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
    public static int dividir(int numerador, int denominador)throws MeuException{
        if(denominador == 0){
            throw new MeuException("Divisão por zero não é permitida");
        }
        return numerador / denominador;
    }
}
