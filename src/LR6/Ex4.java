package LR6;

public class Ex4
{
    public static void main(String[] args)
    {
        System.out.printf("Factorial of 6: %d\n", Factorial.calculate(6));
        System.out.printf("Factorial of 6: %d\n", Factorial.calculateRec(6));
    }
}

class Factorial
{
    public static int calculate(int number)
    {
        if(number < 0)
            return 0;
        if(number == 1)
            return 1;

        int fact = 1;
        for(int i = number; i > 1; i -= 2)
            fact *= i;
        return fact;
    }

    public static int calculateRec(int number)
    {
        if(number <= 2)
            return number;
        return number * calculateRec(number - 2);
    }
}
