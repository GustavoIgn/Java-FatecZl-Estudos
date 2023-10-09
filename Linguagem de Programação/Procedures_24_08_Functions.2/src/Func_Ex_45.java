/*
45. Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
*/
public class Func_Ex_45 {
    public static void main(String[] args) {
        double numerador = 0, serie, denominador = 0;
        serie = 1;
        
        System.out.println("A série é " + String.format("%.6f", calc_serie(numerador, serie, denominador)));
    }
    static double calc_serie(double numerador, double serie, double denominador) {
        for (numerador = 2; numerador < 16; numerador++){
            if (numerador % 2 == 0){
                denominador = Math.pow(numerador, 2);
                serie = serie -(numerador / denominador);
            } else {
                denominador = Math.pow(numerador, 2);
                serie = serie + (numerador / denominador);
            }
        }
        return serie;
    }
}