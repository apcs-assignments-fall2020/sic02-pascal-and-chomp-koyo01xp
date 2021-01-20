/**
 * Write a description of class Pascal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pascal
{
    public static int[][] pascalTriangle(int n) {
        int [][] mat = new int[n][n];
        mat[0][0] = 1;
        
        for(int x = 1;x<n;x++){
            mat[x][0] = 1;
            mat[x][x] = 1;
        }
        for(int y = 2;y<n;y++){
            for(int z = 1;z<y;z++){
                mat[y][z]= mat[y-1][z-1]+mat[y-1][z];
            }
        }
        return mat;
    }
}
