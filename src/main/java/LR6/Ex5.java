package LR6;

public class Ex5
{
    public static void main(String[] args)
    {
        System.out.printf("Res of %d = %d\n", 7, CalctulatorSquare.getSumSquare(7));
        System.out.printf("Res rec of %d = %d\n", 7, CalctulatorSquare.getSumSquare(7));
    }
}

class CalctulatorSquare
{
    public static int getSumSquare(int number)
    {
        int res = 1;
        for(int i = 2; i <= number; i++)
            res += i * i;
        return res;
    }

    public static int getSumSquareRec(int number)
    {
        if(number == 0)
            return 0;
        return number * number + getSumSquareRec(number - 1);
    }

}
