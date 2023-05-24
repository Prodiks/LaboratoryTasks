package LR3;

import java.util.Scanner;

public class Ex6
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

        int[] arr;
        arr = getArray(count);
        printArr(arr);

        arr = getArray2(count);
        printArr(arr);

        id.close();
    }

    public static int[] getArray(int count)
    {
        int[] array = new int[count];
        for(int i = 2, j = 0; j < count; i++)
        {
            if(i % 5 == 2)
                array[j++] = i;
        }
        return array;
    }

    public static int[] getArray2(int count)
    {
        int[] array = new int[count];
        array[0] = 2;
        for(int i = 1; i < count; i++)
        {
            array[i] = array[i-1] + 5;
        }
        return array;
    }

    public static void printArr(int[] arr)
    {
        for (int a: arr)
            System.out.printf("%d ", a);
        System.out.println();
    }
}
