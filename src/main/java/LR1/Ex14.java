package LR1;

import java.util.Scanner;

public class Ex14
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Write num: ");
        int num[] = new int[4];

        num[1] = in.nextInt();
        num[0] = num[1] - 1;
        num[2] = num[1] + 1;
        num[3] = getSumArray(num, 3);
        num[3] *= num[3];

        printArray(num, 4);

        in.close();
    }

    public static int getSumArray(int[] arr, int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];
        return sum;
    }

    public static void printArray(int[] arr, int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.print("\n");
    }
}
