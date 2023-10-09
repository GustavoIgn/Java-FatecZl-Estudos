/*
27. Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). 
Calcule e mostre a velocidade média em km/h.
*/
import javax.swing.JOptionPane;
public class Proc_Ex_27 {
    static double voltas, extensão, duração, vm;
    public static void main(String[] args) {
        
        voltas = Double.parseDouble(JOptionPane.showInputDialog("Quantas voltas foram dadas?"));
        extensão = Double.parseDouble(JOptionPane.showInputDialog("Qual a extensão? (metros)"));
        duração = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a duração? (minutos)"));
        
        velocidade_média();
    }
    static void velocidade_média(){
        vm = ((voltas * extensão) / 1000) / (duração / 60);
        
        JOptionPane.showMessageDialog(null, "A velocidade média é de " + vm + "km/h");
    }
}