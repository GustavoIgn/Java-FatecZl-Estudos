/*
41. Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
*/
public class Func_Ex_41 {
    public static void main(String args[]){
        int dado1 = 0, dado2 = 0;
        System.out.print(dados(dado1, dado2));
    }
    static String dados(int dado1, int dado2){
        for (dado1 = 1; dado1 <= 6; dado1++){
            for (dado2 = 1; dado2 <= 6; dado2++){
                if(dado1 + dado2 == 7){
                    System.out.println("Os valores são " + dado1 +  " + " + dado2);
                }
            }
        }
        return "";
    }
}