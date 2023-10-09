//34. Receba um número. Calcule e mostre os resultados da tabuada desse número.
import javax.swing.JOptionPane;

public class Func_Ex_34 {
    public static void main(String[] args) 
    {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor")), tabuada = 0, cta = 0;
        for (cta = 1; cta < 11; cta ++){
            System.out.println("A tabuada de " + n + " é: " + n + " X " + cta + " = " + calc_tabuada(n, tabuada, cta) );
        }
    }
    static int calc_tabuada(int n, int tabuada, int cta){
        tabuada = n * cta;
        return tabuada;
    }   
}