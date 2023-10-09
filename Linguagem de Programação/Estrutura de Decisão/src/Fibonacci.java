
import javax.swing.JOptionPane;

public class Fibonacci 
{
    public static void main(String[] args) 
    {
       int n, termoant, termoat, cta, proximotermo;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
        termoant = 0;
        termoat = 1;
    
        for (cta = 1; cta <= n; cta++){
            proximotermo = termoat + termoant;
            termoant = termoat;
            termoat = proximotermo;
            System.out.println("A série é " + termoat);
        }
    }
}
