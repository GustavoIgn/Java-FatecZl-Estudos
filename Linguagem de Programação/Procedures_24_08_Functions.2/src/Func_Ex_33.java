//33. Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
import javax.swing.JOptionPane;
public class Func_Ex_33 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
        double serie = 0, cta = 0;
        
        System.out.println("O resultado final é: " + String.format("%.2f", calc_serie(n, cta, serie)));
    }
    static double calc_serie(int n, double cta, double serie){
        for (cta = 1; cta <= n; cta++){
            System.out.print("A série é " + String.format("%.2f",serie));
            serie = serie  + (1 / cta);
            System.out.println(" + " + "1/" + cta + " = " + String.format("%.2f",serie));
        }
        return serie;
    }
}