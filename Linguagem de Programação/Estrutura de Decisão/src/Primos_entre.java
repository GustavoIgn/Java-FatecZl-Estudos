import javax.swing.JOptionPane;

public class Primos_entre 
{
    public static void main(String[] args) 
    {
        int n1, n2, primo, cta, aux;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
        primo = 0;
        
        if (n1 > n2) {
            System.out.print("Os primos entre " + n2 + " e " + n1 + " são: ");
            for (cta = n2; cta <= n1; cta++) {
                for (aux = 1; aux <= cta; aux++) {
                    if (cta % aux == 0) {
                        primo++;
                    }
                }
                if (primo == 2) {
                    System.out.print(cta + ", ");
                }
                primo = 0;
            }
        } else {
            if (n2 > n1) {
                System.out.print("Os primos entre " + n1 + " e " + n2 + " são: ");
                for (cta = n1; cta <= n2; cta++) {
                    for (aux = 1; aux <= cta; aux++) {
                        if (cta % aux == 0) {
                            primo++;
                        }
                    }
                    if (primo == 2) {
                        System.out.print(cta + ", ");
                    }
                    primo = 0;
                }
            } else {
                System.out.println("Os números são iguais");
            }
        }
    }
}
