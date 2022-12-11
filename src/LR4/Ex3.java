package LR4;

public class Ex3
{
    public static void main(String[] args)
    {
        final int row = 10;
        final int col = 15;

        char[][] rect = new char[row][col];

        rect = fillRectangle(rect, row, col);
        printMatrix(rect, row, col);
    }

    public static char[][] fillRectangle(char[][] tr, int s, int c)
    {
        for(int i = 0; i < s; i++)
            for (int j = 0; j < c; j++)
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
