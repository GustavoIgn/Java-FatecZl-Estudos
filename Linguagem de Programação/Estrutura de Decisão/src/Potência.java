
import javax.swing.JOptionPane;

public class Potência 
{
    public static void main(String[] args) 
    {
        double base, expoente, potencia;
        
        base = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da base"));
        expoente = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do expoente"));
        
        potencia = Math.pow(base, expoente);
        
        JOptionPane.showMessageDialog(null, "A potência de " + base + " elevado a " + expoente + " é " + potencia);
    }
    
}
