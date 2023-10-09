/*
18. Receba 2 valores inteiros. 
Calcule e mostre o resultado da diferença do maior pelo menos valor.
*/
import java.util.Scanner; //testando scanner
public class Proc_Ex_18
{
    static int n1, n2, dif;
    static String R;
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.printf("Insira um valor: ");
        n1 = ler.nextInt();
        
        System.out.printf("Insira um valor: ");
        n2 = ler.nextInt();
        
        calcDif();
        
        System.out.println(R);
    }
    static void calcDif(){
        if (n1 > n2){
            dif = n1 - n2;
            R = "A diferença é: " + dif;
        } else if (n2 > n1){
            dif = n2 - n1;
            R = "A diferença é: " + dif;
        } else {
            R = "Os números são iguais";
        }
    }
}