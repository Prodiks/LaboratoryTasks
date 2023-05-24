package LR3;

import java.util.Scanner;

public class Ex4
{
    public static void main(String[] args)
    {
        Scanner id = new Scanner(System.in);
        System.out.println("Write two number: ");
        int num1 = id.nextInt();
        int num2 = id.nextInt();

        printArray(Math.min(num1,num2), Math.max(num1, num2));
        printArrayRec(Math.min(num1,num2), Math.max(num1, num2));
        id.close();
    }

    public static void printArray(int min, int max)
    {
        for(int i = min; i <= max; i++)
            System.out.printf("%d ", i);
        System.out.println();
    }

    public static void printArrayRec(int min, int max)
    {
        if (min > max)
            return;
        System.out.printf("%d ", min);
        printArrayRec(min+1, max);
    }
}
