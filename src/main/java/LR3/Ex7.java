package LR3;

import java.util.Scanner;

public class Ex7
{
    public static void main(String[] args)
    {
        Scanner id = new Scanner(System.in);
        System.out.println("Write count: ");
        int count = id.nextInt();
        if (count < 1) {
            System.out.println("Invalid value");
            return;
        }
        if (count > 32)
        {
            System.out.println("Too much count, calculated only 32 numbers");
            count = 32;
        }

        char[] arr = getArray(count);
        printArr(arr);
        printArrInv(arr);

        id.close();
    }

    public static char[] getArray(int count)
    {
        char[] array = new char[count];
        char c = 'а';
        for(int i = 0; i < count; i++)
            array[i] = c++;
        return array;
    }

    public static void printArr(char[] arr)
    {
        for (int a: arr)
            System.out.printf("%c ", a);
        System.out.println();
    }

    public static void printArrInv(char[] arr)
    {
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.printf("%c ", arr[i]);
        System.out.println();
    }
}
