package DataStructuresCourse;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
    }

    // Pascal Triangle example of 2D array.
    private static int[][] pascalTriangle(int n) {
        int[][] pt = new int[n][];
        for (int i = 0; i < n; i++) {
            pt[i] = new int[i + 1];
            pt[i][0] = 1;
            for (int j = 1; j < i; j++) {
                pt[i][j] = pt[i - 1][j - 1] + pt[i - 1][j];
            }
            pt[i][i] = 1;
        }
        return pt;
    }
}
