//5) Serie5 = (N)! + (N-1)! + (N-2)! + ... + (1)!
import javax.swing.JOptionPane;
public class Rec_Ex_5 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
        System.out.println("O resultado é " + calc_serie(n));
    }
    static int calc_serie(int n) {
        int r;
        if (n == 1) {
            return 1;
        } else {
            int fatorial = calc_fatorial(n);
            r = fatorial + calc_serie(n-1);
            return r;
        }
    }

    static int calc_fatorial(int n) {
        if (n == 1) {
            return (1);
        } else {
            return (n * calc_fatorial(n - 1));
        }
    }
}