package LR4;

import java.util.Random;

public class Ex6
{
    public static void main(String[] args)
    {
        final int row = 7;
        final int col = 5;
        int[][] matr = new int[row][col];
        int[][] res = new int[row - 1][col - 1];
        matr = getRandomMatrix(row, col);

        Random rand = new Random();
        res = cutMatrix(matr, row, col, rand.nextInt(row-2), rand.nextInt(col-2));

        printMatrix(matr, row, col);
        System.out.println("\nNew Matrix;");
        printMatrix(res, row - 1, col - 1);
    }

    public static int[][] cutMatrix(int[][] m, int r, int c, int delR, int delC)
    {
        int[][] res = new int[r - 1][c - 1];
        int rowRes = 0;

        for(int i = 0; i < r; i++)
        {
            int colRes = 0;
            if(i == delR) continue;
            for (int j = 0; j < c; j++)
            {
                if(j == delC) continue;
                res[rowRes][colRes] = m[i][j];
                colRes++;
            }
            rowRes++;
        }

        return res;
    }

    public static int[][] getRandomMatrix(int r, int c)
    {
        int[][] res = new int[r][c];
        Random random = new Random();
        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                res[i][j] = random.nextInt(9);
        return res;
    }

    public static void printMatrix(int[][] m, int r, int c)
    {
        for(int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
                System.out.print(m[i][j]);
            System.out.println();
        }
    }
}
