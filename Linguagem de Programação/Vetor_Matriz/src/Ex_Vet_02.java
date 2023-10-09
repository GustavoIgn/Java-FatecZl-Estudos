import java.util.Scanner;

public class Ex_Vet_02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vet[] = new int[100], cta, maior = 0, menor = 0;
        double média = 0;
        
        for (cta = 0; cta < 100; cta++) {
            System.out.print("Insira o " + (cta + 1) + "º valor: ");
            vet[cta] = ler.nextInt();
            
            if (cta == 0) {
                menor = vet[cta];
                maior = vet[cta];
            }
            
            if (vet[cta] > maior){
                maior = vet[cta];
            } else if (vet[cta] < menor) {
                menor = vet[cta];
            }
            
            média = média + vet[cta];
        }
        
        System.out.println("O maior é: " + maior);
        System.out.println("O menor é: " + menor);
        System.out.println("A soma é " + média);
        System.out.println("A média dessa soma é: " + (média / 100));
    }
}
