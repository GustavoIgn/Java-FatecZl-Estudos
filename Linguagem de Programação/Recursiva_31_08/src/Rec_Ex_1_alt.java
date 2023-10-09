//1) Serie1 = (1+2+3+...+100) - começando de 100.
public class Rec_Ex_1_alt {
    public static void main(String[] args) {
        int n = 100;
        
        System.out.println("O resultado da soma de 1 até 100 é: " + calc_serie(n));
    }
    static int calc_serie(int n){
        int r;
        if (n > 1) {
            r = n + calc_serie((n - 1));
            return r;
        } else {
            return 1;
        }
    }
}
