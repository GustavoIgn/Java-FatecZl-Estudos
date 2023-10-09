
import javax.swing.JOptionPane;

public class Tabuada {
    public static void main(String[] args) 
    {
        int n, tabuada, cta;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
        
        for (cta = 1; cta <= 10; cta++){
            tabuada = n * cta;
            
            System.out.println("A tabuada de " + n + " é: " + n + " X " + cta + " = " + tabuada );
        }
    }
}