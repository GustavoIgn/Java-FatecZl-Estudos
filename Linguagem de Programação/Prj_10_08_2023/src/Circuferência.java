
import javax.swing.JOptionPane;
public class Circuferência 
{
    public static void main(String[] args) 
    {
        double raio, comprimento;
        raio = Double.parseDouble(JOptionPane.showInputDialog("Qual o raio?"));
        
        comprimento = (2 * Math.PI * raio);
        JOptionPane.showMessageDialog(null, "O comprimento é " + comprimento);
    }
}
