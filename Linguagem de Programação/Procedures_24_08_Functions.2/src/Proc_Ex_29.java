/*29.	Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. 
Demais tipos não serão considerados.*/
import javax.swing.JOptionPane;

public class Proc_Ex_29 {

    static int tipo;
    static double valor, novoV, dias;

    public static void main(String[] args) {
        dias = 30;
        calc_vc();
        JOptionPane.showMessageDialog(null, "O valor corrigido é: " + novoV);
    }

    static void calc_vc() {
        do {
            tipo = Integer.parseInt(JOptionPane.showInputDialog("Qual o investimento? 1 - Poupança, 2 - Renda Fixa"));
        } while (tipo != 1 && tipo != 2);

        valor = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor investido?"));

        if (tipo == 1) {
            novoV = (valor * 1.03 * (dias / 30));
        } else {
            novoV = (valor * 1.05 * (dias / 30));
        }
    }
}
