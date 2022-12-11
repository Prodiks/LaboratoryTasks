package LR4;

public class Ex2
{
    public static void main(String[] args)
    {
        final int a = 10;

        drawTriangle(a);
    }

    public static void drawTriangle(int size)
    {
        for(int i = 0; i < size; i++)
        {
            for (int j = size; j > i; j--)
                System.out.print("* ");
            System.out.print("\n");
        }
    }
}
