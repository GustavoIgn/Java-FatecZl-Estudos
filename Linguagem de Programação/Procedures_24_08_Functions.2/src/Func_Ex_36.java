//36. Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
import javax.swing.JOptionPane;

public class Func_Ex_36 {
    public static void main(String[] args) {
        int n;
        double seq, cta = 0, fat;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
        seq = 1;
        fat = 1;
        
        System.out.println("A sequência é " + calc_seq(n, seq, cta, fat));
    }
    static double calc_seq (int n, double seq, double cta, double fat){
        for (cta = 1; cta <= n; cta++){
            fat = fat * cta;
            seq = seq + (1 / fat);
        }
        return seq;
    }
}