package LR3;

import java.util.Scanner;
import java.util.Random;

public class Ex10
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
        bubleSort(array);
        printArr(array);

        id.close();
    }

    public static void printArr(int[] arr)
    {
        for (int a: arr)
            System.out.printf("%d ", a);
        System.out.println();
    }

    public static int[] getRandomArray(int count)
    {
        Random random = new Random();
        int[] array = new int[count];
        for(int i = 0; i < count; i++)
            array[i] = random.nextInt(10);
        return array;
    }

    public static void bubleSort(int[] arr)
    {
        for(int i = 0; i < arr.length-1; i++)
            for(int j = i + 1; j < arr.length; j++)
                if (arr[i] < arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
    }
}
