import javax.swing.JOptionPane;

public class Litros 
{
    public static void main(String[] args) 
    {
        double litros, tempoPercuso, vMedia;
        
        tempoPercuso = Double.parseDouble(JOptionPane.showInputDialog("Qual foi o tempo do percuso?"));
        vMedia = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a velocidade média?"));
        
        litros = ((tempoPercuso * vMedia) / 12);
        
        JOptionPane.showMessageDialog(null, "Litros gastos: " + String.format("%.2f", litros) + "l");
    }
}