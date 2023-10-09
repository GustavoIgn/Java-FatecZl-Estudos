
import javax.swing.JOptionPane;

public class Hipotenusa 
{
    public static void main(String[] args) 
    {
        double ct1, ct2, hip;
        ct1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um cateto"));
        ct2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um cateto"));
        
	hip = Math.sqrt(Math.pow(ct1, 2) + Math.pow(ct2,2));
        
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é " + hip);
    }     
}