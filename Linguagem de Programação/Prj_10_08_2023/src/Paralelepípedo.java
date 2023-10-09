
import javax.swing.JOptionPane;

public class Paralelepípedo 
{
    public static void main(String[] args) 
    {
        int comp, alt, larg, vol;
        
        comp = Integer.parseInt(JOptionPane.showInputDialog("Qual o comprimento?"));
        larg = Integer.parseInt(JOptionPane.showInputDialog("Qual a largura?"));
        alt = Integer.parseInt(JOptionPane.showInputDialog("Qual a altura?"));
        
        vol = comp * larg * alt;
        JOptionPane.showMessageDialog(null, "O volume deste paralelepípedo é: " + vol);
        System.out.println("O volume deste paralelepípedo é: " + vol);
    }
}
