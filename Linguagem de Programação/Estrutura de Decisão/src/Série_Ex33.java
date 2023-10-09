import javax.swing.JOptionPane;

public class Série_Ex33 
{
    public static void main(String[] args) 
    {
        int n;
        double serie, cta;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
        serie = 0;
        
        for (cta = 1; cta <= n; cta++){
            System.out.print("A série é " + String.format("%.2f",serie));
            serie = serie  + (1 / cta);
            System.out.println(" + " + "1/" + cta + " = " + String.format("%.2f",serie));
        } 
        System.out.println("O resultado final é: " + String.format("%.2f", serie));
    }
}