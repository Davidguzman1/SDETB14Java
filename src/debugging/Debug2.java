package debugging;

public class Debug2 {
    static int[][] reduce10(int[][] num) {

        for (int i = 0; i < num.length; i++) {
            for (int a = 0; a < num[i].length; a++) {
                num[i][a] = num[i][a] - 10;

            }
            System.out.println();
        }
        return num;

    }

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}
        };
        reduce10(a);
    }
}
