package LR3;

import java.util.Scanner;

public class Ex5
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

        System.out.print("Array: ");
        int arr[] = new int[count];

        arr = getArray(count);
        printArr(arr);
        System.out.printf("Sum = %d\n", getSumArray(arr));

        arr = getArray2(count);
        System.out.print("Array: ");
        printArr(arr);
        System.out.printf("Sum = %d\n", getSumArray(arr));

        id.close();
    }
    public static int[] getArray(int c)
    {
        int[] array = new int[c];
        for(int i = 0, j = 0; j < c; i++)
        {
            if ((i % 5 == 2) || (i % 3 == 1))
                array[j++] = i;
        }
        return array;
    }

    public static int[] getArray2(int c)
    {
        int[] array = new int[c];

        int i = 1;
        int j = 0;

        while (j < c)
        {
            if ((i % 5 == 2) || (i % 3 == 1))
                array[j++] = i;
            i++;
        }

        return array;
    }

    public static int getSumArray(int[] arr)
    {
        int sum = 0;
        for (int i: arr)
        {
            sum += i;
        }
        return sum;
    }

    public static void printArr(int[] arr)
    {
        for (int a: arr)
            System.out.printf("%d ", a);
        System.out.println();
    }
}