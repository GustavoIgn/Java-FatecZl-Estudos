// 31.	Calcule e mostre o quadrado dos números entre 10 e 150.
public class Func_Ex_31 {
    public static void main(String[] args) {
        int n = 0;
        double quad = 0;
        
        for (n = 10; n <= 150; n++){
            System.out.println("O quadrado de " + n + " é " + String.format("%.0f", calc_quadrado(n, quad)));
        }
    }
    static double calc_quadrado(int n, double quad){
        quad = Math.pow(n, 2);
        return quad;
    }
}