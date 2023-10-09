/*
17. Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. 
Receber o tempo de percurso e a velocidade média.
*/
import javax.swing.JOptionPane;
public class Proc_Ex_17 
{
    static double litros, tP, vM;
    public static void main(String[] args) {
        tP = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo do percurso"));
        vM = Double.parseDouble(JOptionPane.showInputDialog("Insira a velocidade média"));
        
        calcLitros();
        JOptionPane.showMessageDialog(null, "Litros gastos: " + String.format("%.2f", litros) + "L" );
    }
    static void calcLitros(){
        litros = (tP * vM) / 12;
    }
}
