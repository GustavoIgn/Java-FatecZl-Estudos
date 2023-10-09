/*
35. Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
*/
import javax.swing.JOptionPane;
public class Func_Ex_35 {
    public static void main(String[] args) {
        int n1, n2, soma = 0, impar = 0;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro número"));
        JOptionPane.showMessageDialog(null, calc_impar(n1, n2, soma, impar));
    }
    static String calc_impar(int n1, int n2, int soma, int impar) {
        String r;
        if (n1 > n2){
            for (impar = n2; impar <= n1; impar++){
                if (impar % 2 != 0){
                    soma = (soma + impar);
                }
            }
            r = "A soma dos impares entre " + n2 + " e " + n1 + " é " + soma;
        } else {
            if (n2 > n1){
                for (impar = n1; impar <= n2; impar++){
                    if (impar % 2 != 0){
                        soma = (soma + impar);    
                    }
                }
                r = "A soma dos impares entre " + n1 + " e " + n2 + " é " + soma;
            } else {
                r = "Os números são iguais";
            }
        }
        return r;
    }
}