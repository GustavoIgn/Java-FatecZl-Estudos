//3) Serie3 = (1/1) + (1/2) + (1/3) + ....+ (1/N) 
import javax.swing.JOptionPane;
public class Rec_Ex_3 {
    public static void main(String[] args) {
        double n = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de N"));
        
        System.out.println("O resultado é " + calc_serie(n));
    }
    static double calc_serie(double n){
        double r = 0;
        if (n > 1){
            r = 1 / n + calc_serie(n-1);
            return r;
        } else {
            return 1;
        }
    }
}
