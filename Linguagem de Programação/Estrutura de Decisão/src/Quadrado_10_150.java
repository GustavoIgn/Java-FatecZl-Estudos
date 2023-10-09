
import javax.swing.JOptionPane;

public class Quadrado_10_150 
{
    public static void main(String[] args) 
    {
        int n;
        double quad;
        
        for (n = 10; n <= 150; n++){
            quad = Math.pow(n, 2);
            System.out.println("O quadrado de " + n + " é " + quad);
        }
    }
}
