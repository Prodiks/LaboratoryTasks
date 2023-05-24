package LR3;

import java.util.Scanner;

public class Ex3
{
    public static void main(String[] args)
    {
        Scanner id = new Scanner(System.in);
        System.out.println("Write count: ");
        int count = id.nextInt();

        if (count < 1)
        {
            System.out.println("Invalid value");
            return;
        }

        printArr(getFibonacci(count));

        int[] res = new int[count];
        getFibonacciRec(res, count, 0);
        printArr(res);

        id.close();
    }

    public static int[] getFibonacci(int c)
    {
        int[] res = new int[c];
        switch(c)
        {
            case 1:
                res[0] = 1;
                return res;

            case 2:
                res[0] = 1;
                res[1] = 1;
                return res;
        }

        res[0] = 1;
        res[1] = 1;
        for (int i = 2; i < c; i++)
        {
            res[i] = res[i-1] + res[i-2];
        }
        return res;
    }

    public static void getFibonacciRec(int arr[], int c, int i)
    {
        if (i == 0)
        {
            arr[0] = 1;
            getFibonacciRec(arr, c, i+1);
        }
        else if (i == 1)
        {
            if (i >= c)
                return;
            arr[1] = 1;
            getFibonacciRec(arr, c, i+1);
        }
        else if (i < c)
        {
            arr[i] = arr[i-1] + arr[i-2];
            getFibonacciRec(arr, c,i+1);
        }
    }

    public static void printArr(int[] arr)
    {
        for (int a: arr)
            System.out.printf("%d ", a);
        System.out.println();
    }
}
