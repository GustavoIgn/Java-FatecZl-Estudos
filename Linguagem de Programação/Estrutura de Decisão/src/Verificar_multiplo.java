
import javax.swing.JOptionPane;

public class Verificar_multiplo 
{
    public static void main(String args []) 
    {
        int n1, n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro número"));
        
        if (n1 > n2){
            if(n1 % n2 == 0){
                System.out.println("O maior " + n1 + " é multiplo do menor " + n2);
            } else {
                System.out.println("O maior " + n1 + " não é multiplo do menor " + n2);
            }
        } else {
            if (n2 > n1){
                if(n2 % n1 == 0){
                    System.out.println("O maior " + n2 + " é multiplo do menor " + n1);
                } else {
                    System.out.println("O maior " + n2 + " não é multiplo do menor " + n1);
                }
            } else {
                System.out.println("Os números são iguais.");
            }
        }
    }
}
