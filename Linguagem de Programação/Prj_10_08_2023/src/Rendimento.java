import javax.swing.JOptionPane;
public class Rendimento 
{
    public static void main(String[] args) 
    {
        int mes;
        double rend, vDepositado, vFinal;
    
        mes = 1;
    
        rend = (1.3 / 100);
    
        vDepositado = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para depósito"));
    
        vFinal = (vDepositado + (vDepositado * mes * rend));
        JOptionPane.showMessageDialog(null, "O valor final foi de: " + vFinal);
    }
}