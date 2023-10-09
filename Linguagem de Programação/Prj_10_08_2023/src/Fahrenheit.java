
import javax.swing.JOptionPane;

public class Fahrenheit {
    public static void main(String argumentos [])
    {
        double c, f;
        c = Double.parseDouble(JOptionPane.showInputDialog("Qual a temperatura em Celsius?"));
        f = (9 * c + 160) / 5;
        JOptionPane.showMessageDialog(null, "Em Fahrenheit são: " + f + "f");
    }
}
