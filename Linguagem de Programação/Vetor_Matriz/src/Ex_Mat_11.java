
public class Ex_Mat_11 {

    public static void main(String[] args) {
        int mat[][] = new int[8][8], x = 0, y = 0, z = 0;

        for (z = 1; z <= 4; z++) {
            for (x = (z - 1); x <= (8 - z); x++) {
                for (y = (z - 1); y <= (8 - z); y++) {
                    mat[x][y] = z;
                }
            }
        }
        for (x = 0; x < 8; x++) {
            for (y = 0; y < 8; y++) {
                System.out.print(mat[x][y] + " ");
            }
            System.out.println();
        }
    }
}
