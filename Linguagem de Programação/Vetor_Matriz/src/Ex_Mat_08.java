
import java.util.Random;
import javax.swing.JOptionPane;


public class Ex_Mat_08 {

    public static void main(String[] args) {
        Random random = new Random();
        int mat[][] = new int[4][3], x, y, prodUnico = 0, prodSemanas = 0 , total = 0;
        for (x = 0; x < 4; x++) {
            for(y = 0; y < 3; y++) {
                //mat[x][y] = random.nextInt(20);
                mat[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Insira os valores da matriz"));
            }
        }
        for (x = 0; x < 3; x++) {
            for(y = 0; y < 4; y++) {
                prodUnico = prodUnico + mat[y][x];
            }
            System.out.println("O produto " + x + " tem " + prodUnico + " produtos vendidos");
            prodUnico = 0;
        }
        for (x = 0; x < 4; x++) {
            for (y = 0; y < 3; y++) {
                prodSemanas = prodSemanas + mat[x][y];
                total = total + mat[x][y];
            }
            System.out.println("Por semana o total foi: " + prodSemanas + " na " + (1+x) + " semana");
            prodSemanas = 0;
        }
        System.out.println("O total vendido foi: " + total);
    }
}