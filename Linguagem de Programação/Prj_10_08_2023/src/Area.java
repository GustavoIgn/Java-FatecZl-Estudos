import javax.swing.JOptionPane;
public class Area {
    public static void main(String argumentos [])
    {
        int lado, area;
        lado = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do lado?"));
        area = lado * lado;
        JOptionPane.showMessageDialog(null, "A área é de: " + area);
    }
            
}
