package LR9.Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args)
    {
        int[][] matrix;
        try
        {
            matrix = getMatrix();
        }
        catch (InputMismatchException ex)
        {
            System.out.println("Неверный ввод");
            return;
        }
        System.out.println("Введенная матрица:");
        printMatrix(matrix);

        System.out.println("Введите номер столбца: ");
        Scanner id = new Scanner(System.in);
        int column_num;
        try
        {
            column_num = id.nextInt();
        }
        catch (InputMismatchException ex)
        {
            System.out.println("Неверный ввод");
            return;
        }

        int[] column;
        try
        {
            column = getColumn(matrix, column_num);
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Индекс столбца за пределами матрицы");
            return;
        }

        System.out.println("Полученный столбец:");
        for(int i = 0; i < column.length; i++)
        {
            System.out.println(column[i]);
        }
    }

    public static int[][] getMatrix()
    {
        System.out.println("Введите количество строк и столбцов матрицы матрицы:");
        Scanner id = new Scanner(System.in);
        int row = id.nextInt();
        int col = id.nextInt();
        int[][] matrix = new int[row][col];

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                System.out.print("[" + i + "]"+"[" + j + "]" + " = ");
                matrix[i][j] = id.nextInt();
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix)
    {
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] getColumn(int[][] matrix, int column_num) {
        int row_count = matrix.length;
        int column_count = matrix[0].length;
        int[] column = new int[row_count];

        for(int i = 0; i < row_count; i++)
        {
            column[i] = matrix[i][column_num];
        }

        return column;
    }
}
