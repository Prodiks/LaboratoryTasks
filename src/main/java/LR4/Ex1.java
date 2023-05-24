package LR4;

public class Ex1
{
    public static void main(String[] args)
    {
        final int rowCount = 11;
        final int columnCount = 23;

        drawRectangle(rowCount, columnCount);
    }
    public static void drawRectangle(int r, int c)
    {
        for(int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
                System.out.print("* ");
            System.out.print("\n");
        }
    }

}
