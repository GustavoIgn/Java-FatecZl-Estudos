/*
24. Receba um valor inteiro. 
Verifique e mostre se é divisível por 2 e 3.
*/
import javax.swing.*;

public class Proc_Ex_24 {

    static int n;

    public static void main(String args[]) {
        n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));

        Verificando();
    }

    static void Verificando() {
        if (n % 3 == 0 && n % 2 == 0) {
            System.out.println(n + " é divisível por 2 e 3");
        } else {
            if (n % 3 == 0) {
                System.out.println(n + " é divisível por 3, apenas");
            } else {
                if (n % 2 == 0) {
                    System.out.println(n + " é divisível por 2, apenas");
                } else {
                    System.out.println(n + " não é divisível por nenhum dos dois");
                }
            }
        }
    }
}
