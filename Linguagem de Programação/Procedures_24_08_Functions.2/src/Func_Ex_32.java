// 32. Receba um número inteiro. Calcule e mostre o seu fatorial.
import javax.swing.JOptionPane;

public class Func_Ex_32 {
    public static void main(String [] args){
        int n, fat = 1, cta = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
        System.out.println("O fatorial de " + n + " é " + calc_fat(cta, fat, n) + ".");
    }
    static int calc_fat(int cta, int fat, int n){
        for (cta = 1; cta <= n; cta ++){     
            System.out.print("A sequencia para esse fatorial é " + fat + " X " + cta);
            fat = fat * cta;
            System.out.println(" = " + fat);
        }
        return fat;
    }
}
