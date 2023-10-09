
import javax.swing.JOptionPane;


public class Ex_Vet_01 {

    public static void main(String[] args) {
        int vet[] = new int[50];
        int média = 0, soma = 0;
        double div = 0;
        for (int cta = 0; cta < 50; cta++) {
            vet[cta] = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + (cta + 1) + "º valor"));
            
            if (vet[cta] > 10 && vet[cta]< 200){
                média = média + vet[cta];
                div = div + 1;
            }
            if (vet[cta] % 2 != 0) {
                soma = soma + vet[cta];
            }
        }
        for (int cta = 0; cta < 50; cta ++){
            System.out.println("Posição " + cta + "º do vetor: " + vet[cta]);
        }
        JOptionPane.showMessageDialog(null, "A média dos números entre 10 e 200 é " + (média / div));
        JOptionPane.showMessageDialog(null, "A soma dos impares é " + soma);
    }
}