package decorator;

public class Main {
    static int n;
    static int m;

    public static void main(String[] args) {
        n = 3;
        m = 7;
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = n * i + j;
            }
        }
        System.out.println("Начальная матрица a:");
        System.out.println("------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
        int[][] b = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = i + m * j;
            }
        }
        System.out.println("Начальная матрица b");
        System.out.println("------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%4d", b[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Транспонированная матрица:");
        System.out.println("------");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int transparentMatrix = new TransparentMatrix(a).getElement(j, i);
                System.out.printf("%4d", transparentMatrix);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Сложение матриц:");
        System.out.println("------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int sumOfTwoMatrices = new SumOfTwoMatrices(a,b).getElement(i, j);
                System.out.printf("%4d", sumOfTwoMatrices);
            }
            System.out.println();
        }
    }
}
