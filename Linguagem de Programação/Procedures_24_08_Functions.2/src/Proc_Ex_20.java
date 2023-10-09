/*
20. Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. 
Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
*/
import javax.swing.JOptionPane;
public class Proc_Ex_20 {
    static double A, B, C, x1, x2, delta;
    public static void main(String args[]) {
        A = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor de A?"));
        if (A != 0){
            B = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor de B?"));
            C = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor de C?"));
            Calc_Raiz();
        } else {
            JOptionPane.showMessageDialog(null, "Insira um valor para A difente de 0");
            System.exit(0);
        }
    }  
    static void Calc_Raiz(){
        delta = Math.pow(B, 2) - (4 * A * C);
        if (delta >= 0){
            x1 = (-B + Math.sqrt(delta)) / (2 * A);
            x2 = (-B - Math.sqrt(delta)) / (2 * A);
            JOptionPane.showMessageDialog(null, "As raízes são, X1: " + x1 + " e X2: " + x2);
        } else {
            JOptionPane.showMessageDialog(null, "Não há raízes reais");
        }
    }
}