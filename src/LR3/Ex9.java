package LR3;

import java.util.Scanner;
import java.util.Random;

public class Ex9
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

        int[] array = getRandomArray(count);
        printArr(array);
        printMinValues(array);

        id.close();
    }

    public static void printArr(int[] arr)
    {
        for (int a: arr)
            System.out.printf("%d ", a);
        System.out.println();
    }

    public static void printMinValues(int[] arr)
    {
        int min = getMin(arr);
        System.out.printf("Min: %d, index: ", min);
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == min)
                System.out.printf("[%d] ", i);
        }
        System.out.println();
    }

    public static int getMin(int[] arr)
    {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static int[] getRandomArray(int count)
    {
        Random random = new Random();
        int[] array = new int[count];
        for(int i = 0; i < count; i++)
            array[i] = random.nextInt(10);
        return array;
    }
}
