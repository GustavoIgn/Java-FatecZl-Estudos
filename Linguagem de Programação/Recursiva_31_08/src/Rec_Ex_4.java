//4) Serie4 = (N/1) +(N-1 / 2 ) + (N-2 / 3) + .... + (1/N) 
import javax.swing.JOptionPane;
public class Rec_Ex_4 {
    public static void main(String[] args) {
        double n = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor"));
        double d = 1;
        System.out.println("O resultado é " + String.format("%.2f", calc_serie(n, d)));
    }
    static double calc_serie(double n, double d){
        double r;
        if (n == 1 && d != 1){
            return n/d;
        } else {
            r = n / d + calc_serie(n-1, d+1);
            return r;
        }
    }
}
