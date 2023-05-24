package LR4;

import java.util.Random;

public class Ex5
{
    public static void main(String[] args)
    {
        int row = 5;
        int col = 3;
        int[][] matr = new int[row][col];
        int[][] res = new int[col][row];

        matr = getRandomMatrix(row, col);
        printMatrix(matr, row, col);
        res = transposeMatrix(matr,row, col);

        System.out.println("\nTRANSPOSE:");
        printMatrix(res, col, row);
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

    public static int[][] transposeMatrix(int[][] m, int r, int c)
    {
        int[][] res = new int[c][r];

        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                res[j][i] = m[i][j];

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
