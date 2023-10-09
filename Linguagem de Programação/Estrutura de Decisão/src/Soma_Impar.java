
import javax.swing.JOptionPane;

public class Soma_Impar 
{
    public static void main(String[] args) 
    {
        int n1, n2, soma, impar;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro número"));
        soma = 0;
        
        if (n1 > n2){
            for (impar = n2; impar <= n1; impar++){
                if (impar % 2 != 0){
                    soma = (soma + impar);
                }
            }
            JOptionPane.showMessageDialog(null, "A soma dos impares entre " + n2 + " e " + n1 + " é " + soma);
        } else {
            if (n2 > n1){
                for (impar = n1; impar <= n2; impar++){
                    if (impar % 2 != 0){
                        soma = (soma + impar);    
                    }
                }
                JOptionPane.showMessageDialog(null, "A soma dos impares entre " + n1 + " e " + n2 + " é " + soma);
            } else {
                JOptionPane.showMessageDialog(null, "Os números são iguais");
            }
        }
    }
}
