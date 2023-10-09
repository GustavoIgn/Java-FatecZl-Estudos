// 19.	Receba 2 valores reais. Calcule e mostre o maior deles
import javax.swing.JOptionPane;
public class Proc_Ex_19 {
    static double n1, n2;
    public static void main(String[] args) {  
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um número"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira outro valor"));
        
        Maior();
    }
    static void Maior(){
        if (n1 > n2) {
            JOptionPane.showMessageDialog(null, "O maior é " + n1);
        } else if (n2 > n1){
            JOptionPane.showMessageDialog(null, "O maior é " + n2);
        } else {
            JOptionPane.showMessageDialog(null, "Os valores são iguais");
        }
    }
}
