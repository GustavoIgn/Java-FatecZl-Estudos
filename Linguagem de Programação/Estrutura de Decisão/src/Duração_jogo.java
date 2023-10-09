
import javax.swing.JOptionPane;

public class Duração_jogo 
{
    public static void main (String args  [])
    {
        int hi, mi, hf, mf, tempoM, tempoH;
        
        hi = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora inicial"));
        mi = Integer.parseInt(JOptionPane.showInputDialog("Insira o minuto inicial"));
        hf = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora final"));
        mf = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora final"));
        
        if(hf >= hi){
            tempoH = (hf - hi);
        } else {
            tempoH = ((hf - hi) + 24);
        }
        if(mf >= mi){
            tempoM = (mf - mi);
        } else {
            tempoH = (tempoH - 1);
            tempoM = ((mf - mi) + 60);
        }
        JOptionPane.showMessageDialog(null, "O tempo do jogo foi de " + tempoH + ":" + tempoM);
    }
}
