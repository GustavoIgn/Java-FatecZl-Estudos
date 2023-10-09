
import javax.swing.JOptionPane;

public class Fatorial 
{
    public static void main(String [] args)
    {
        int n, fat, cta;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
        fat = 1;
        
        for (cta = 1; cta <= n; cta ++){     
            System.out.print("A sequencia para esse fatorial é " + fat + " X " + cta);
            fat = fat * cta;
            System.out.println(" = " + fat);
        }
        System.out.println("O fatorial de " + n + " é " + fat + ".");
    }
}
