public class Anos_crescimento 
{
    public static void main(String[] args) 
    {
        int ana, maria, anos;
        
        ana = 110;
        maria = 150;
        anos = 0;
        
        while (ana <= maria){
            ana = ana + 3;
            maria = maria + 2;
            anos = anos + 1;
        }
        
        System.out.println("Levará " + anos + " anos para que Ana seja maior");
    }
}
