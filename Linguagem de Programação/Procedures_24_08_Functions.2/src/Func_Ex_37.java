//37. Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
import javax.swing.JOptionPane;
public class Func_Ex_37 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
        
        calc_seq(n);
    }
    
    static int calc_seq(int n) 
    {
        int termoant = 0, termoat = 1, proximotermo;

        for (int cta = 1; cta <= n; cta++) {
            proximotermo = termoat + termoant;
            termoant = termoat;
            termoat = proximotermo;
            System.out.println("A série é " + termoat);
        }
        return 1;
    }
}