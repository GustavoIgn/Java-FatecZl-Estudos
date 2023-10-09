public class Série_45 
{
    public static void main(String[] args) 
    {
        double numerador, serie, denominador;
        serie = 1;
        
        for (numerador = 2; numerador < 16; numerador++){
            if (numerador % 2 == 0){
                denominador = Math.pow(numerador, 2);
                serie = serie -(numerador / denominador);
            } else {
                denominador = Math.pow(numerador, 2);
                serie = serie + (numerador / denominador);
            }
        }
        System.out.println("A série é " + String.format("%.6f", serie));
    }
}
