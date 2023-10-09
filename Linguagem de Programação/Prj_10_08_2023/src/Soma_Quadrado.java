
import javax.swing.JOptionPane;
public class Soma_Quadrado 
{
    public static void main(String[] args) 
    {
        int n1, n2, somaQuad;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        somaQuad = ((n1 * n1) + (n2 * n2));
        
        JOptionPane.showMessageDialog(null, "A soma dos quadrados é: " +  somaQuad);
    }
}