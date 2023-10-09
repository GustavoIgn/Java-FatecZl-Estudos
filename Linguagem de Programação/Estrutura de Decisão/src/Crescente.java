
import javax.swing.JOptionPane;
public class Crescente 
{
    public static void main(String args []) 
    {
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro número"));
        
        if (n1 == n2){
            System.out.println("Os valores são iguais: " + n1);
        } else {
            if (n1 > n2){
                System.out.println("Ordem: " + n2 + ", " + n1);                
            } else {
                System.out.println("Ordem: " + n1 + ", " + n2);
            }
        }
    }   
}