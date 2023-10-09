public class Série_42 
{
    public static void main(String[] args) 
    {
        double serie, numerador, denominador;
        numerador = 1;
        serie = 0;
        
        for (denominador = 0; denominador <= 99; denominador++){
            denominador = denominador + 1;
            serie = serie + (numerador / denominador);
            numerador = numerador + 1;
        }
        System.out.println("O resultado é " + String.format("%.2f", serie));
    }
}
