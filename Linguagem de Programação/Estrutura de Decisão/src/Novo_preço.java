import javax.swing.JOptionPane;

public class Novo_preço 
{
    public static void main (String args[])
    {
        double pA, pN, vM;
        
        vM = Double.parseDouble(JOptionPane.showInputDialog("Qual a venda mensal?"));
        pA = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço atual?"));
        pN = 0;
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
        JOptionPane.showMessageDialog(null, "O novo preço é " + pN);
    }
}
