package LR4;

public class Ex4
{
    public static void main(String[] args)
    {
        final int size = 10;

        char[][] triang = new char[size][size];

        triang = fillTriangle(triang, size);
        printMatrix(triang, size, size);
    }

    public static char[][] fillTriangle(char[][] tr, int s)
    {
        for(int i = 0; i < s; i++)
            for (int j = 0; j < s-i; j++)
                tr[i][j] = '2';
        return tr;
    }

    public static void printMatrix(char[][] m, int s, int c)
    {
        for(int i = 0; i < s; i++)
        {
            for (int j = 0; j < c; j++)
                System.out.print(m[i][j]);
            System.out.println();
        }
    }
}
