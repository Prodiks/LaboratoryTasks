package LR6;

public class Ex8
{
    public static void main(String[] args)
    {
        int[] arr = {5, 8, 9, -1, -5, 4, 12, 6};
        ArrayAv.print(arr);
        System.out.printf("Sum = %d\nAverage = %.2f", ArrayAv.getSum(arr), ArrayAv.getAverage(arr));
    }
}

class ArrayAv
{
    public static double getAverage(int[] arr)
    {
        return (double) getSum(arr) / arr.length;
    }

    public static int getSum(int[] arr)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; sum += arr[i++]);
        return sum;
    }

    public static void print(int[] array)
    {
        for(int a: array)
        {
            System.out.printf("%d ", a);
        }
        System.out.println();
    }
}
