/*
43. Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria, 
sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
*/
public class Func_Ex_43 {
    public static void main(String[] args) {
        int ana = 110, maria = 150, anos = 0;
        System.out.println("Levará " + calc_anos(ana, maria, anos) + " anos para que Ana seja maior");        
    }
    static int calc_anos(int ana, int maria, int anos){
        while (ana <= maria){
            ana = ana + 3;
            maria = maria + 2;
            anos = anos + 1;
        }
        return anos;
    }
}
