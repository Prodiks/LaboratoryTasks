package LR6;

public class Ex2
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 10; i++)
            System.out.printf("%d\n", Viewer.getIncValue());
    }
}

class Viewer
{
    private static int _value;

    public static int getIncValue()
    {
        return _value++;
    }
}

