// 2) Serie2 = (N) + (N-1) + (N-2) + ... + (1) 
import java.util.Scanner;
public class Rec_Ex_2 {
    public static void main(String[] args) {
        int n;
        Scanner ler = new Scanner(System.in);
        System.out.print("Insira o valor de N: ");
        n = ler.nextInt();
        
        System.out.println("O resultado é " + calc_serie(n));
    }
    static int calc_serie(int n){
        int r;
        if (n > 1){
            r = n + calc_serie(n-1);
            return r;    
        } else {
            return 1;   
        }
    }
}
