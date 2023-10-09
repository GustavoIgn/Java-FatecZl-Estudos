
import java.util.Random;

public class Ex_Vet_06 {

    public int[] Cadastrar(int vt[]) {
        int aux;
        Random random = new Random();

        for (aux = 0; aux < 20; aux++) {
            vt[aux] = random.nextInt(1000);
            System.out.print(vt[aux] + " ");
        }

        System.out.println("\n|||||||||||||||||||||CADASTRADO||||||||||||||||||||||||");
        return vt;
    }

    public int[] Classificar(int vt[]) {
        for (int i = 0; i < 20; i++) {
            for (int j = i + 1; j < 20; j++) {
                if (vt[j] < vt[i]) {
                    int cop = vt[i];
                    vt[i] = vt[j];
                    vt[j] = cop;
                }
            }
            System.out.print(vt[i] + " ");
        }
        System.out.println("\n|||||||||||||||||||||CLASSIFICADO|||||||||||||||||||||||||");
        return vt;
    }

    public int Procurar(int vt[], int n) {
        int inicio = 0, fim = vt.length, meio = 0;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (n == vt[meio]) {
                return meio;
            } else {
                if (n > vt[meio]) {
                    inicio = meio + 1;
                } else {
                    fim = meio - 1;
                }
            }
        }
        return -1;
    }
}
