package LR4;

public class Ex7
{
    public static void main(String[] args)
    {
        final int size= 5;

        char[][] matr = new char[size][size];

        int offset = 0;
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size-i; j++)
            {
                matr[i][j] = '*';
                printMatrix(matr, size, size);
                System.out.println();
            }

            for(int j = 0; j < size-i; j++)
            {
                matr[size-1-j][size-1-i] = '*';
                printMatrix(matr, size, size);
                System.out.println();
            }
        }
    }

    public static void printMatrix(char[][] m, int r, int c)
    {
        for(int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
                System.out.print(m[i][j]);
            System.out.println();
        }
    }
}
