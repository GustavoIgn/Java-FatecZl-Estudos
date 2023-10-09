
import javax.swing.JOptionPane;

public class Ex_Vet_03 {
    public static void main(String[] args) {
       int vt1[] = new int[3], vt2[] = new int [3], vt3[] = new int [6];
       
       for (int cta = 0; cta < 3; cta++){
           vt1[cta] = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + (cta + 1) + "º valor"));
           vt2[cta] = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + (cta + 1) + "º valor"));
           vt3[cta] = vt1[cta];
           vt3[cta+3] = vt2[cta];
       }
       
       for (int cta = 0; cta < 6; cta++){
           System.out.println("O Vetor 3 vale: " + vt3[cta] + " na posição " + (cta + 1) + "º");
       }
    }
}
