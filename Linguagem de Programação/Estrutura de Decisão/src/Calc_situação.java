import javax.swing.*; 
public class Calc_situação 
{
    public static void main (String args [ ]) 
    {
        double n1, n2, n3, n4, media;
    
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral"));
        media = (n1 + n2 + n3 + n4) / 4;
        System.out.println ("A média é: " + media);
        
        if (media >= 6) 
        {
            System.out.println ("Aprovado");
        } else {
            if (media >= 3 && media < 6){
                System.out.println ("Exame");
            } else {
                    System.out.println ("Retido");
            }
        }
    }
}