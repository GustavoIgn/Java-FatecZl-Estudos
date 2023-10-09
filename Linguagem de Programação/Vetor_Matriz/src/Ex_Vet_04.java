
import javax.swing.JOptionPane;

public class Ex_Vet_04 {

    public static void main(String[] args) {
        double vt[] = new double[30], acimaMedia = 0, média = 0;
        String posiçãoBaixoMedia = " ";

        for (int cta = 0; cta < 30; cta++) {
            vt[cta] = Double.parseDouble(JOptionPane.showInputDialog("Insira o " + (cta + 1) + "º valor"));
            System.out.println("Posição " + (cta + 1) + "º do vetor:" + vt[cta]);
        }
        média = calc_média(vt, média);
        System.out.println("A média é: " + média);
        System.out.println("A quantidade de notas acima da média é: " + quant(média, vt, acimaMedia));
        System.out.println("As posições das notas abaixo da média são: " + posições(vt, média, posiçãoBaixoMedia));
    }

    static double calc_média(double vt[], double média) {
        for (int cta = 1; cta < 29; cta++) {
            média = média + vt[cta];
        }
        média = média / 30;
        return média;
    }

    static double quant(double média, double vt[], double acimaMedia) {
        for (int cta = 0; cta < 30; cta++) {
            if (vt[cta] > média) {
                acimaMedia += 1;
            }
        }
        return acimaMedia;
    }

    static String posições(double vt[], double média, String posiçãoBaixaMedia) {
        for (int cta = 0; cta < 30; cta++) {
            if (vt[cta] < média){
                posiçãoBaixaMedia += cta + "";
            }
        }
        return posiçãoBaixaMedia;
    }
}
