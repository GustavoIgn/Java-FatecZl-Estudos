
import javax.swing.JOptionPane;
public class Troca_Val 
{
    public static void main(String args[])
    {
        int x, y, cop;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para X"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para Y"));
                
        cop = x;
        x = y;
        y = cop;
        
       JOptionPane.showMessageDialog(null, "O valor de X agora é: " + x);
       JOptionPane.showMessageDialog(null, "O valor de Y agora é: " + y);
    }
}
