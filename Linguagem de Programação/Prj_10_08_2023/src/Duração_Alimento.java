
import javax.swing.JOptionPane;

public class Duração_Alimento 
{
    public static void main(String[] args) 
    {
        double aliment, duração;
        
        aliment = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de alimentos?"));
        
        duração = ((aliment * 1000) / 50);
        JOptionPane.showMessageDialog(null, "A duração em dias é: " + duração);
    }
}
