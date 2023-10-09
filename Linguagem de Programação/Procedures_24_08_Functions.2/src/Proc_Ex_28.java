/* 28. Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
Venda Mensal	Preço Atual	Preço Novo
< 500	        < 30    	+ 10%
>= 500 e < 1000	>= 30 e < 80	+15%
>= 1000	        >= 80	        - 5%
Obs.: para outras condições, preço novo será igual ao preço atual.
*/
import javax.swing.*;
public class Proc_Ex_28 {
    static double pA, pN, vM;
    public static void main (String args[]) {
        vM = Double.parseDouble(JOptionPane.showInputDialog("Qual a venda mensal?"));
        pA = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço atual?"));
        pN = 0;
        
        calc_pn();
        JOptionPane.showMessageDialog(null, "O novo preço é " + pN);
       
    }
    static void calc_pn() {
         if (vM < 500){
            if (pA < 30){
                pN = (pA * 1.10);
            } else {
                pN = pA;
            }
        } else {
            if (vM >= 500 && vM < 1000){
                if (pA >= 30 && pA <80){
                    pN = (pA * 1.15);
                } else {
                    pN = pA;    
                }
            } else {
                if (vM >= 1000){
                    if (pA >= 80){
                        pN = (pA * 0.95);
                    } else {
                        pN = pA;
                    }
                }
            }
        }  
    }
}
