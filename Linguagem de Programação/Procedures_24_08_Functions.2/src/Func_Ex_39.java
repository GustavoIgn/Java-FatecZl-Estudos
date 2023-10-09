/*
39. Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
Casa: 	1 2 3 4 ... 64
Qdte:	1 2 4 8 ... N

*/
public class Func_Ex_39 {
    public static void main(String[] args) {
        double casa = 0, qtd = 0, aux = 0;
        System.out.println("No total serão " + String.format("%.0f", calc_grãos(casa, qtd, aux)) + " grãos.");
    }
    static double calc_grãos(double casa, double qtd, double aux){
        qtd = 1;
        aux = 0;
        for (casa = 1; casa <= 64; casa++){
            System.out.println("Na casa " + String.format("%.0f", casa) + " terá " + String.format("%.0f", qtd) + " grãos...");
            aux = aux + qtd;
            qtd = Math.pow(2, casa);
        }
        return aux;
    }
}