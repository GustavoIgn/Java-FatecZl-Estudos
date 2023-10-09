
import javax.swing.JOptionPane;

public class Maior_Reais 
{
    public static void main(String[] args) 
    {
        double n1, n2, maior;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor real"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira outro valor real"));
        
       if (n1 > n2){
           maior = n1;
       } else {
           maior = n2;
       }
       JOptionPane.showMessageDialog(null, "O maior é " + maior);
    }
}
