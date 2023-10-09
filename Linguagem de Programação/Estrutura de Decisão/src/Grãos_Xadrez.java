public class Grãos_Xadrez 
{
    public static void main(String[] args) 
    {
        double casa, qtd, aux;
        qtd = 1;
        aux = 0;
        for (casa = 1; casa <= 64; casa++){
            System.out.println("Na casa " + String.format("%.0f", casa) + " terá " + String.format("%.0f", qtd) + " grãos...");
            aux = aux + qtd;
            qtd = Math.pow(2, casa);
        }        
        System.out.println("No total serão " + String.format("%.0f", aux) + " grãos.");
    }
}
