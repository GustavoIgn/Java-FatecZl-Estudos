/*
42. Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
*/
public class Func_Ex_42 {
    public static void main(String[] args) {
        double serie, numerador, denominador = 0;
        numerador = 1;
        serie = 0;
        
        System.out.println(calc_serie(serie, numerador, denominador));
    }
    static String calc_serie(double serie, double numerador, double denominador){
        String r;
        for (denominador = 0; denominador <= 99; denominador++){
            denominador = denominador + 1;
            serie = serie + (numerador / denominador);
            System.out.println("O resultado de " + String.format("%.0f", numerador) + " / " + String.format("%.0f", denominador) + " = " + String.format("%.2f", serie));
            numerador = numerador + 1;
        }
        r = ("O resultado final é " + String.format("%.2f", serie) + "//");
        return r;
    }
}