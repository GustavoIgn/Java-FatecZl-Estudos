
import javax.swing.JOptionPane;

public class Verificar_div 
{
    public static void main(String args []) 
    {
        int n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
        
        if (n % 3 == 0 && n % 2 == 0){
            System.out.println(n + " é divisível por 2 e 3");
        } else {
            if (n % 3 == 0){
                System.out.println(n + " é divisível por 3, apenas");
            } else {
                if (n % 2 ==0){
                    System.out.println(n + " é divisível por 2, apenas");
                } else {
                    System.out.println(n + " não é divisível por nenhum dos dois");
                }
            }
        }                
    }
}
