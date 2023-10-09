
import javax.swing.JOptionPane;

public class Seq_fatorial 
{
    public static void main(String[] args) 
    {
        int n;
        double seq, cta, fat;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
        seq = 1;
        fat = 1;
        
        for (cta = 1; cta <= n; cta++){
            fat = fat * cta;
            seq = seq + (1 / fat);
        }
        System.out.println("A sequência é " + seq);
    }
}
