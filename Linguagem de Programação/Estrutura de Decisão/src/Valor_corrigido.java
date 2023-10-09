
import javax.swing.JOptionPane;

public class Valor_corrigido 
{
    public static void main(String[] args) 
    {
        int tipo;
        double valor, novoV, dias;
        dias = 30;
        
        do 
        {
            tipo = Integer.parseInt(JOptionPane.showInputDialog("Qual o investimento? 1 - Poupança, 2 - Renda Fixa"));
        } while (tipo != 1 && tipo != 2);
        
        valor = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor investido?"));
            
        if (tipo == 1){
            novoV = (valor * 1.03 * (dias / 30));
        } else {
            novoV = (valor * 1.05 * (dias / 30));
        }
        
        JOptionPane.showMessageDialog(null, "O valor corrigido é: " + novoV);
    }
}
