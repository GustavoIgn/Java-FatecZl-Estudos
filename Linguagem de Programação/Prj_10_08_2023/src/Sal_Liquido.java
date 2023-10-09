
import javax.swing.JOptionPane;
public class Sal_Liquido 
{
    public static void main(String[] args) 
    {
        double horasTrab, valH, descPerc, liq, bruto, salReceber;
        int depen;
    
        horasTrab = Double.parseDouble(JOptionPane.showInputDialog( "Insira as horas trabalhada: "));
        valH = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor por hora: "));
        descPerc = Double.parseDouble(JOptionPane.showInputDialog("Qual o percentual de desconto? "));
        depen = Integer.parseInt(JOptionPane.showInputDialog("Quantos são seus dependentes? "));
    
        bruto = (horasTrab * valH);
            liq = (bruto - (bruto * (descPerc / 100)));
                salReceber = ((depen * 100) + (liq));
            
        JOptionPane.showMessageDialog(null, "Seu pagamento é de: " + salReceber);
    }
}