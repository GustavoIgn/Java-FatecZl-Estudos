/*
38. Receba 100 números inteiros reais. 
Verifique e mostre o maior e o menor valor. 
Obs.: somente valores positivos.
*/
import javax.swing.JOptionPane;
public class Func_Ex_38 {
    public static void main(String[] args) {
        int[] resultado = Maior_Menor();
        int maior = resultado[0];
        int menor = resultado[1];
        
        System.out.println("O maior é " + maior);
        System.out.println("O menor é " + menor);
    }
    public static int[] Maior_Menor() {
        int maior = 0;
        int menor = 0;
        
        for (int cta = 1; cta <= 100; cta++) {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + cta + "º número."));
            
            if (n >= 0) {
                if (cta == 1) {
                    maior = n;
                    menor = n;
                }
                if (n > maior) {
                    maior = n;
                }
                if (n < menor) {
                    menor = n;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Insira apenas valores positivos, voltando ao " + cta + "º número");
                cta = cta - 1;
            }
        }
        
        int[] resultado = {maior, menor};
        return resultado;
    }
}