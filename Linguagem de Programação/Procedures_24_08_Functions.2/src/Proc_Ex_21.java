/*
21. Receba 4 notas bimestrais de um aluno. 
Calcule e mostre a média aritmética. 
Mostre a mensagem de acordo com a média:
a. Se a média for >= 6,0 exibir “APROVADO”;
b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c. Se a média for < 3,0 exibir “RETIDO”.
*/
import javax.swing.JOptionPane;
public class Proc_Ex_21 {
    static double n1, n2, n3, n4, media;
    public static void main (String args [ ]) {
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral"));
        
        Calc_Media();
    }  
    static void Calc_Media(){
        media = (n1 + n2 + n3 + n4) / 4;
        System.out.println ("A média é: " + media);
        
        if (media >= 6) 
        {
            System.out.println ("Aprovado");
        } else {
            if (media >= 3 && media < 6){
                System.out.println ("Exame");
            } else {
                    System.out.println ("Retido");
            }
        }
    }
}