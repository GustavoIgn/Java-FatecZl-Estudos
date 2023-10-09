import javax.swing.JOptionPane;

public class Velocidade_média 
{
    public static void main(String[] args) 
    {
        double voltas, extensão, duração, vm;
        
        voltas = Double.parseDouble(JOptionPane.showInputDialog("Quantas voltas foram dadas?"));
        extensão = Double.parseDouble(JOptionPane.showInputDialog("Qual a extensão? (metros)"));
        duração = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a duração? (minutos)"));
        
        vm = ((voltas * extensão) / 1000) / (duração / 60);
        
        JOptionPane.showMessageDialog(null, "A velocidade média é de " + vm + "km/h");
        
    }
}
