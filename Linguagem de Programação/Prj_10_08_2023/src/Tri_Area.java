
import javax.swing.JOptionPane;

public class Tri_Area 
{
    public static void main(String args[])
    {
        int area, base, altura;
        base = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da base?"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da altura?"));
        area = (base * altura)/2;
       JOptionPane.showMessageDialog(null, "A área é: " + area);
    }
}
