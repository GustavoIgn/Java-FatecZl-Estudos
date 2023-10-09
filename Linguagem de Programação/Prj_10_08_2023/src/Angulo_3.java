
import javax.swing.JOptionPane;

public class Angulo_3 
{
    public static void main(String[] args) 
    {
        double ang1, ang2, ang3;
        
        ang1 = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do ângulo 1?"));
        ang2 = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do ângulo 2?"));
        
        ang3 = ((180 - ang1) - ang2);
        JOptionPane.showMessageDialog(null,"O valor do ângulo 3 é: " + ang3);
    }
}
