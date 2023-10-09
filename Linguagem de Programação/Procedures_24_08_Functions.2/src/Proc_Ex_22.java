/*
22. Receba 2 valores inteiros e diferentes. 
Mostre seus valores em ordem crescente.
*/
import javax.swing.JOptionPane;
public class Proc_Ex_22 {
    static int n1, n2;
    public static void main(String args []) {
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro número"));
        
        Organizando();
    }
    static void Organizando(){
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
