
import javax.swing.JOptionPane;

public class Diferença 
{
    public static void main(String[] args) 
    {
        double n1, n2, dif;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um número:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira outro número:"));
                        
        if(n1 > n2){
            dif = n1 - n2;
            JOptionPane.showMessageDialog(null, "A diferença é: " + dif);
        } else{
            dif = n2 - n1;
            JOptionPane.showMessageDialog(null, "A diferença é: " + dif);
        }
    }
}
