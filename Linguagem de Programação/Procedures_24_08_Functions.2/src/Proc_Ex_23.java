/*
23. Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. 
Mostre os 4 números em ordem crescente.
*/
import javax.swing.JOptionPane;

public class Proc_Ex_23 {
    static double n1, n2, n3, n4;
    public static void main(String args []) {
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira outro valor"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Insira outro valor"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Insira outro valor"));
        
        Organizando();
    }
    static void Organizando(){
        if((n1 < n2 && n1 < n3) && (n2 < n3)){
            System.out.println("Organizando...");
            if(n4 < n1){
                JOptionPane.showMessageDialog(null, "A ordem é " + n4 + ", " + n1 + ", " + n2 + ", " + n3);                
            } else {
                if(n4 < n2){
                    JOptionPane.showMessageDialog(null, "A ordem é " + n1 + ", " + n4 + ", " + n2 + ", " + n3);
                } else {
                    if(n4 < n3){
                        JOptionPane.showMessageDialog(null, "A ordem é " + n1 + ", " + n2 + ", " + n4 + ", " + n3);                
                    } else {
                        if(n4 > n3){
                            JOptionPane.showMessageDialog(null, "A ordem é " + n1 + ", " + n2 + ", " + n3 + ", " + n4);                
                        }
                    }
                }
            } 
        } else {
            JOptionPane.showMessageDialog(null, "Insira os 3 primeiros valores em ordem!");
        }   
    }
}
