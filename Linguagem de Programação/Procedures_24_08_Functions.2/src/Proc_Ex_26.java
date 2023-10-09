/*
26. Receba 2 números inteiros. 
Verifique e mostre se o maior número é múltiplo do menor.
*/
import javax.swing.JOptionPane;
public class Proc_Ex_26 {
    static int n1, n2;
    public static void main(String args []) {
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro número"));
        
        calc_div();
    }
    static void calc_div(){
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