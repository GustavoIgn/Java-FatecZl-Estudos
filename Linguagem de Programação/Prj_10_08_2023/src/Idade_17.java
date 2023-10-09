
import javax.swing.JOptionPane;

public class Idade_17 
{
    public static void main(String[] args) 
    {
        int anoNasc, anoAt, id;
        
        anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de nascimento!"));
        anoAt = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual!"));
        
        id = (anoAt - anoNasc); //idade atual, sem considerar aniversário
        id = (id + 17); //idade daqui 17 anos...
        
        JOptionPane.showMessageDialog(null, "Daqui 17 anos você terá: " + id);
    }
}