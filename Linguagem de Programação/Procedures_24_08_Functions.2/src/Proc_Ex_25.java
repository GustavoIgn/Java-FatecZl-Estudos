/*
25. Receba a hora de início e de final de um jogo (HH,MM).
Calcular o tempo do jogo em horas e minutos.
Sabendo que o tempo máximo é menor que 24 horas e pode começar num dia e terminar noutro.
*/
import javax.swing.*;
public class Proc_Ex_25 {
    static int hi, mi, hf, mf, tempoM, tempoH;
    public static void main (String args  []) {
        
        hi = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora inicial"));
        mi = Integer.parseInt(JOptionPane.showInputDialog("Insira o minuto inicial"));
        hf = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora final"));
        mf = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora final"));
        
        Calc_Duração();
    }
    static void Calc_Duração(){
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
