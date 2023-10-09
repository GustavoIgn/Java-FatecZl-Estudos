
import javax.swing.JOptionPane;
public class Dif_maior_menor 
{
    public static void main(String [] args)
    {
        int n1, n2, dif;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do N1"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do N2"));
        
        if (n1 > n2)
        {
            dif = n1 - n2;
        } else {
            dif = n2 - n1;
        }
        JOptionPane.showMessageDialog(null, "A diferença é: " + dif);
    }
}
