
import javax.swing.JOptionPane;

public class Reajuste 
{
    public static void main(String args[])
    {
        double sal;
        double rj = 0.15;
        
        sal = Double.parseDouble(JOptionPane.showInputDialog("Qual o salário?"));
        sal = (sal + (sal * rj));
        JOptionPane.showMessageDialog(null, "Com reajuste o salário é: " + sal);        
    }
}
