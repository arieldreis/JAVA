public class ex003 {
    public static void main(String[] args) {
        String[] mes = {"Jan", "Fev", "Mar", "Abr", "Mai",
                "Jun", "Ago", "Set", "Out", "Nov", "Dez"};
        int[] tot = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int cont = 0; cont<= mes.length; cont++){
            System.out.println("O mês de " + mes[cont] + " tem " + tot[cont] + " dias ao todo.");
        }
    }
}
