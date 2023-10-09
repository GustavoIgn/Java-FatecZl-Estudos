
import java.util.Random;

public class Ex_Vet_05 {

    public static void main(String[] args) {
        Random random = new Random();
        int vt[] = new int[20], soma = 0;

        for (int cta = 0; cta < 20; cta++) {
            vt[cta] = random.nextInt(20);
            System.out.println(vt[cta]);
        }
        for (int aux = 0; aux < 10; aux++) {
            soma = soma + (vt[aux] - vt[19 - aux]);
        }

        System.out.println("A somatória é: " + soma);
    }
}
