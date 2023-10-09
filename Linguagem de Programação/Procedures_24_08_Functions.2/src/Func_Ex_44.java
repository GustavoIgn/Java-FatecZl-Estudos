/*
44. Receba o número da base e do expoente. Calcule e mostre o valor da potência.
 */
import java.util.Scanner;

public class Func_Ex_44 {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        double potencia = 0, base = 0, expoente = 0;
        System.out.println(" é " + calc_potencia(base, expoente, potencia));
    }

    static double calc_potencia(double base, double expoente, double potencia) {
        System.out.print("Insira o valor da base: ");
        base = ler.nextDouble();
        System.out.print("Insira o valor do expoente: ");
        expoente = ler.nextDouble();
        potencia = Math.pow(base, expoente);
        System.out.print("A potência de " + base + " elevado a " + expoente);
        return potencia;
    }
}
