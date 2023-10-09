
import javax.swing.JOptionPane;

public class Maior_100 
{
    public static void main(String[] args) 
    {
        int n, maior, menor, cta;
        maior = 0;
        menor = 0;
                
        for (cta = 1; cta <= 100; cta++){
            n = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + cta + "º número."));
            if (n >=0){
                if (cta == 1){
                    maior = n;
                    menor = n;
                }
                if (n > maior){
                    maior = n;
                } else {
                    if (n < menor) {
                        menor = n;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Insira apenas valores positivos, voltando ao " + cta + "º número");
                cta = cta - 1;
            }
        }
        System.out.println("O maior é " + maior);
        System.out.println("O menor é " + menor);
    }        
}
