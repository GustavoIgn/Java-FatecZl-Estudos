public class Dados_soma_7 
{
    public static void main(String[] args) 
    {
        int dado1, dado2;
        
        for (dado1 = 1; dado1 <= 6; dado1++){
            for (dado2 = 1; dado2 <= 6; dado2++){
                if(7 == dado1 + dado2){
                    System.out.println("Os valores são " + dado1 +  " + " + dado2);
                }
            }
        }
    }
}
